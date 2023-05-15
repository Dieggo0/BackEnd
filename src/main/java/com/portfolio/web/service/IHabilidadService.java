package com.portfolio.web.service;

import com.portfolio.web.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
    
    public List<Habilidad> getHabilidad();
    
    public void saveHabilidad(Habilidad hab);
    
    public void deleteHabilidad(Long id);
    
    public Habilidad findHabilidad(Long id);
}
