package com.portfolio.web.controller;

import com.portfolio.web.model.Persona;
import com.portfolio.web.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping("/persona/ver")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }
    
    @PostMapping("/persona/crear")
    public String createStudent(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La persona fue borrada correctamente";
    }
    
    @PutMapping("persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("apellido") String nuevoApellido,
                                @RequestParam ("titulo") String nuevoTitulo,
                                @RequestParam ("inormacion") String nuevaInfo) {
        
        Persona perso = interPersona.findPersona(id);
        
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setTitulo(nuevoTitulo);
        perso.setInformacion(nuevaInfo);
        
        interPersona.savePersona(perso);
            return perso;  
    } 
}
