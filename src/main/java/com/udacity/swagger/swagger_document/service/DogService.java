package com.udacity.swagger.swagger_document.service;

import com.udacity.swagger.swagger_document.entity.Dog;
import com.udacity.swagger.swagger_document.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    public List<Dog> retrieveAllBreed() {
        return dogRepository.retrieveAllBread();
    }

    public Dog retrieveDogById(Integer id) {
        return Optional.ofNullable(dogRepository.retrieveDogById(id)).orElseThrow(DogNotFoundException::new);
    }

    public List<Dog> retrieveAllDogName() {
        return dogRepository.retrieveAllDogName();
    }
}
