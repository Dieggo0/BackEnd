package com.portfolio.web.repository;

import com.portfolio.web.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
    
}
