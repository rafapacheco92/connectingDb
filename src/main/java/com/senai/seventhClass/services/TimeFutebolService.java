package com.senai.seventhClass.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.seventhClass.entities.TimeFutebolEntity;
import com.senai.seventhClass.repositories.TimeFutebolRepository;

@Service
public class TimeFutebolService {

    @Autowired
    TimeFutebolRepository timeFutebolRepository;

    public List<TimeFutebolEntity> getAllTimes() {
        
        return timeFutebolRepository.findAll();

    }
    
}
