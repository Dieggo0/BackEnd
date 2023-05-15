package com.portfolio.web.controller;

import com.portfolio.web.model.Proyecto;
import com.portfolio.web.service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService interProyecto;
    
    @GetMapping("/proyecto/ver")
    public List<Proyecto> getProyecto(){
        return interProyecto.getProyecto();
    }
    
    @PostMapping("/proyecto/crear")
    public String createHabilidad(@RequestBody Proyecto proye){
        interProyecto.saveProyecto(proye);
        return "La proyecto fue creada correctamente";
    }
    
    @DeleteMapping("/Proyecto/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id){
        interProyecto.deleteProyecto(id);
        return "La proyecto fue borrada correctamente";
    }
    
    @PutMapping("proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("informacion") String nuevaInfo,
                                @RequestParam ("fecha") Date nuevaFecha){
        
        Proyecto proye = interProyecto.findProyecto(id);
        
        proye.setNombre(nuevoNombre);
        proye.setInformacion(nuevaInfo);
        proye.setFecha(nuevaFecha);
        
        interProyecto.saveProyecto(proye);
            return proye;  
    } 
}
