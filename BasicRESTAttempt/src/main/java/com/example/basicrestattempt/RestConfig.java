package com.example.basicrestattempt;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

//@Configuration
public class RestConfig implements RepositoryRestConfigurer
{
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors)
    {
        config.exposeIdsFor(Coursename.class);
        config.exposeIdsFor(Course.class);
        config.exposeIdsFor(Degreetype.class);
        config.exposeIdsFor(Student.class);
    }
}
