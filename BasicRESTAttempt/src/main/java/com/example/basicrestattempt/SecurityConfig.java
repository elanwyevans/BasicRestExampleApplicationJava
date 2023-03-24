package com.example.basicrestattempt;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    String jwkSetUri = "http://localhost:8090/realms/StudentServiceAuthRealm/protocol/openid-connect/certs";

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        //DO NOT USE OLD APPROACH, USE TIM'S APPROACH - otherwise will be marked down

        //must specify whats allowed, otherwise default is to not allow it
        http.authorizeHttpRequests()
                //allows user to delete/get/etc at any endpoint, as long as they have the role studentserviceadmin/user/etc
                .requestMatchers(HttpMethod.DELETE, "/**").hasRole("studentserviceadmin")
                .requestMatchers(HttpMethod.GET, "/**").hasRole("studentserviceuser")
                .requestMatchers(HttpMethod.POST, "/**").hasRole("studentserviceuser")
                .requestMatchers(HttpMethod.PUT, "/**").hasRole("studentserviceuser")
                .requestMatchers(HttpMethod.PATCH, "/**").hasRole("studentserviceuser")

                //if request we received matches any of the above requests, it will be authenticated
                .anyRequest().authenticated();

        http.oauth2ResourceServer().jwt(jwt -> jwt.jwtAuthenticationConverter(jwtAuthenticationConverter()));

        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        return http.build();
    }

    private Converter<Jwt, ? extends AbstractAuthenticationToken> jwtAuthenticationConverter()
    {
        JwtAuthenticationConverter jwtConverter = new JwtAuthenticationConverter();
        jwtConverter.setJwtGrantedAuthoritiesConverter(new KeycloakRealmConverter());
        return jwtConverter;
    }

    @Bean
    JwtDecoder jwtDecoder()
    {
        return NimbusJwtDecoder.withJwkSetUri(this.jwkSetUri).build();
    }
}