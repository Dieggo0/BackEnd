package com.portfolio.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidad {
    
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String nombre;
}
