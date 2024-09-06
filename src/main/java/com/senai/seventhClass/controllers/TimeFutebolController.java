package com.senai.seventhClass.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.seventhClass.services.TimeFutebolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/time-futebol")

public class TimeFutebolController {
    
    @Autowired // serve para não precisar instanciar
    TimeFutebolService timeFutebolService;

    @GetMapping
    public ResponseEntity getTimes() {

        var times = timeFutebolService.getAllTimes();

        return ResponseEntity.ok(times);
    }
    
}
