package com.udacity.swagger.swagger_document.controller;

import com.udacity.swagger.swagger_document.entity.Dog;
import com.udacity.swagger.swagger_document.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {

    @Autowired
    private DogService dogService;


    @GetMapping("/breed")
    public ResponseEntity<List<Dog>> retrieveAllDogBreed() {
        return new ResponseEntity<>(dogService.retrieveAllBreed(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dog> retrieveDogById(@PathVariable("id") int id) {
        return new ResponseEntity<Dog>(dogService.retrieveDogById(id),HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity<List<Dog>> retrieveAllDogName() {
        return new ResponseEntity<>(dogService.retrieveAllDogName(), HttpStatus.OK);
    }

}
