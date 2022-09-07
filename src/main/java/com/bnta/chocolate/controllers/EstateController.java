package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class EstateController {

    @Autowired
    EstateRepository estateRepository;

    @GetMapping(value = "/estates")
    public ResponseEntity<List<Estate>> getAllEstates(){
        List<Estate> estates = estateRepository.findAll();
        return new ResponseEntity<>(estates, HttpStatus.OK);

    }
}
