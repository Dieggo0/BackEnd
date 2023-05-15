package com.portfolio.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
   
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String nombre;
        private String informacion;
        private String titulo;
        private Date fechainicio;
        private Date fechafin;
        private String logourl;
        private String certificadourl;
}
