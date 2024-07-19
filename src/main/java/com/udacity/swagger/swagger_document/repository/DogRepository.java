package com.udacity.swagger.swagger_document.repository;

import com.udacity.swagger.swagger_document.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends CrudRepository<Dog, Integer> {

    @Query("select d from Dog d")
    List<Dog> retrieveAllBread();

    @Query("select d from Dog d where d.id=:id")
    Dog retrieveDogById(int id);

    @Query("select d from Dog d")
    List<Dog> retrieveAllDogName();
}
