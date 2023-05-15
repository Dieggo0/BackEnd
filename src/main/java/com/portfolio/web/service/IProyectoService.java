package com.portfolio.web.service;

import com.portfolio.web.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> getProyecto();
    
    public void saveProyecto(Proyecto proye);
    
    public void deleteProyecto(Long id);
    
    public Proyecto findProyecto(Long id);
    
}
