package com.portfolio.web.service;

import com.portfolio.web.model.Educacion;
import com.portfolio.web.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    private EducacionRepository eduRepository;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion = eduRepository.findAll();
        return listaEducacion;
    }

    @Override
    public void saveEducacion(Educacion edu) {
          eduRepository.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
         eduRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
          Educacion edu = eduRepository.findById(id).orElse(null);
        return edu;
    }
}
