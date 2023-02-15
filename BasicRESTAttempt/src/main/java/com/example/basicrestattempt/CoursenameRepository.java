package com.example.basicrestattempt;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "coursename", path = "coursename")
public interface CoursenameRepository extends PagingAndSortingRepository<Coursename, Integer>, CrudRepository<Coursename, Integer>{

}