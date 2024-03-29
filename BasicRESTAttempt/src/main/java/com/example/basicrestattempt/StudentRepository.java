package com.example.basicrestattempt;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

//prevent CORS error (when it thinks youre sending requests from different host addresses)
//remember to change from wildcard to actual origin you expect request from
//might also need cors mapping method to map things to the cors registry (according to Arthur)
@CrossOrigin(origins="*", allowedHeaders = "*")



@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer>, CrudRepository<Student, Integer>
{
    //example JPA queries. can alternatively write code in Java
    @Query("select s from Student s where s.address like '%swansea%'")
    List<Student> findStudentsFromSwansea();

    @Query("select s from Student s where s.address like '%swansea%' and lower(s.name) like lower(concat('%', :name, '%'))")
    List<Student> findStudentsFromSwanseaByName(@Param("name") String name);

}