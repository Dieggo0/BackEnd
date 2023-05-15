package com.portfolio.web.controller;

import com.portfolio.web.model.Habilidad;
import com.portfolio.web.service.IHabilidadService;
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
public class HabilidadController {
    
    @Autowired
    private IHabilidadService interHabilidad;
    
    @GetMapping("/habilidad/ver")
    public List<Habilidad> getHabilidad(){
        return interHabilidad.getHabilidad();
    }
    
    @PostMapping("/habilidad/crear")
    public String createHabilidad(@RequestBody Habilidad hab){
        interHabilidad.saveHabilidad(hab);
        return "La habilidad fue creada correctamente";
    }
    
    @DeleteMapping("/habilidad/borrar/{id}")
    public String deleteHabilidad(@PathVariable Long id){
        interHabilidad.deleteHabilidad(id);
        return "La habilidad fue borrada correctamente";
    }
    
    @PutMapping("habilidad/editar/{id}")
    public Habilidad editEducacion(@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre){
        
        Habilidad hab = interHabilidad.findHabilidad(id);
        
        hab.setNombre(nuevoNombre);
        
        interHabilidad.saveHabilidad(hab);
            return hab;  
    } 
}
