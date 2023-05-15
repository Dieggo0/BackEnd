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
public class Proyecto {
   
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String nombre;
        private String informacion;
        private Date fecha;
        private String linkproyecto;
        private String urlimagenes;
}
