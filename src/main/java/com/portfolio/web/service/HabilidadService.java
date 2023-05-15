
package com.portfolio.web.service;

import com.portfolio.web.model.Habilidad;
import com.portfolio.web.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {
    
    @Autowired
    private HabilidadRepository habRepository;

    @Override
    public List<Habilidad> getHabilidad() {
        List<Habilidad> listaHabilidad = habRepository.findAll();
        return listaHabilidad;
    }

    @Override
    public void saveHabilidad(Habilidad hab) {
         habRepository.save(hab);
    }

    @Override
    public void deleteHabilidad(Long id) {
       habRepository.deleteById(id);
    }

    @Override
    public Habilidad findHabilidad(Long id) {
       Habilidad hab = habRepository.findById(id).orElse(null);
        return hab;
    }
}
