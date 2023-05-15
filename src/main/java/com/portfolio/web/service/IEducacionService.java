package com.portfolio.web.service;

import com.portfolio.web.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> getEducacion();
    
    public void saveEducacion(Educacion edu);
    
    public void deleteEducacion(Long id);
    
    public Educacion findEducacion(Long id);
}
