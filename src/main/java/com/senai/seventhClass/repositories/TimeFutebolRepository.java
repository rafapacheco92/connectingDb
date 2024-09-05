package com.senai.seventhClass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.seventhClass.entities.TimeFutebol;

public interface TimeFutebolRepository extends JpaRepository<TimeFutebol, Long> {
    
}
