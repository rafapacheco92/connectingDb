package com.senai.seventhClass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.seventhClass.entities.TimeFutebolEntity;


@Repository
public interface TimeFutebolRepository extends JpaRepository<TimeFutebolEntity, Long> {
    
}
