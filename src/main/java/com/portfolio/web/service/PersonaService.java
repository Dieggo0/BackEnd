package com.portfolio.web.service;

import com.portfolio.web.model.Persona;
import com.portfolio.web.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> getPersonas() {
       List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas; 
    }

    @Override
    public void savePersona(Persona perso) {
         persoRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
         Persona perso = persoRepository.findById(id).orElse(null);
        return perso;
    }
    
}
