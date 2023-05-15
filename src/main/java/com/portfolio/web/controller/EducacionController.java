package com.portfolio.web.controller;

import com.portfolio.web.model.Educacion;
import com.portfolio.web.service.IEducacionService;
import java.util.Date;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService interEducacion;
    
    @GetMapping("/educacion/ver")
    public List<Educacion> getEducacion(){
        return interEducacion.getEducacion();
    }
    
    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion edu){
        interEducacion.saveEducacion(edu);
        return "La educacion fue creada correctamente";
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        interEducacion.deleteEducacion(id);
        return "La educacion fue borrada correctamente";
    }
    
    @PutMapping("educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("inormacion") String nuevaInfo,
                                @RequestParam ("titulo") String nuevoTitulo,
                                @RequestParam ("fechainicio") Date nuevaFechaInicio,
                                @RequestParam ("fechafin") Date nuevaFechaFin){
        
        Educacion edu = interEducacion.findEducacion(id);
        
        edu.setNombre(nuevoNombre);
        edu.setInformacion(nuevaInfo);
        edu.setTitulo(nuevoTitulo);   
        edu.setFechainicio(nuevaFechaInicio);
        edu.setFechafin(nuevaFechaFin);
        
        
        interEducacion.saveEducacion(edu);
            return edu;  
    } 
}
