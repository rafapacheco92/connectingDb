package com.senai.seventhClass.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.seventhClass.repositories.TimeFutebolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/times")

public class TimeFutebolController {
    
    @Autowired // serve para não precisar instanciar
    TimeFutebolRepository timeFutebolRepository;

    @GetMapping
    public ResponseEntity getTimes() {

        timeFutebolRepository.findAll();

        return ResponseEntity.ok().build();
    }
    
}
