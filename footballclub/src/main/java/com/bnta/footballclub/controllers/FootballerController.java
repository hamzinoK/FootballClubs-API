package com.bnta.footballclub.controllers;

import com.bnta.footballclub.models.Footballer;
import com.bnta.footballclub.repositories.FootballerRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("footballers")
public class FootballerController {


    @Autowired
    FootballerRepository footballerRepository;
    // GET/INDEX route
    @GetMapping
    public ResponseEntity<List<Footballer>> getAllFootballers(){
        return new ResponseEntity<>(footballerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping //localhost:8080/footballers?playerRating=86
    public ResponseEntity<List<Footballer>> getAllFootballersWithAPlayerRatingOf86(@Request) {
        
    }

    // SHOW route

    @GetMapping(value = "/{id}") //localhost:8080/footballers/1
    public ResponseEntity<Optional<Footballer>> getFootballer(@PathVariable Long id) {
        return new ResponseEntity<>(footballerRepository.findById(id), HttpStatus.OK);
    }

    // POST route
    @PostMapping // POST localhost:8080/pets
    public ResponseEntity<Footballer> createFootballer(@RequestBody Footballer newFootballer) {
        footballerRepository.save(newFootballer);
        return new ResponseEntity<>(newFootballer, HttpStatus.CREATED);
    }
}
