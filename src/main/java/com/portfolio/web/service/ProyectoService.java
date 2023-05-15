
package com.portfolio.web.service;

import com.portfolio.web.model.Proyecto;
import com.portfolio.web.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    ProyectoRepository proyeRepository;

    @Override
    public List<Proyecto> getProyecto() {
           List<Proyecto> listaProyecto = proyeRepository.findAll();
        return listaProyecto;
    }

    @Override
    public void saveProyecto(Proyecto proye) {
        proyeRepository.save(proye);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyeRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proye = proyeRepository.findById(id).orElse(null);
        return proye;
    }
}
