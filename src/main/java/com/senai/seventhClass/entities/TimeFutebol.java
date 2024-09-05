package com.senai.seventhClass.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "time_futebol")

public class TimeFutebol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column //(name = "i_d") serve para nomes diferentes da variavel no DB e no JAVA
    private Long id;

    @Column(name = "nome")
    private String nomeClube;
    @Column(name = "divisao")
    private String divisao;
    @Column(name = "pais")
    private String pais;
    @Column(name = "tem_mundial")
    private Boolean temMundial; // se for not null pode ser boolean
}
