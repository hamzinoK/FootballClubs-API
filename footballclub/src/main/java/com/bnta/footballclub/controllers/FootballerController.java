package com.bnta.footballclub.controllers;

import com.bnta.footballclub.models.Footballer;
import com.bnta.footballclub.repositories.FootballerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("footballers")
public class FootballerController {


    @Autowired
    FootballerRepository footballerRepository;
    // get/index
    @GetMapping
    public ResponseEntity<List<Footballer>> getAllFootballers(){
        return new ResponseEntity<>(footballerRepository.findAll(), HttpStatus.OK);
    }
}
