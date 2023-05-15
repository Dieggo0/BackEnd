package com.portfolio.web.repository;

import com.portfolio.web.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EducacionRepository extends JpaRepository <Educacion, Long> {
    
}
