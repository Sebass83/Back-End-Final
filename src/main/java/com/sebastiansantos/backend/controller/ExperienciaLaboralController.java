
package com.sebastiansantos.backend.controller;

import com.sebastiansantos.backend.model.ExperienciaLaboral;
import com.sebastiansantos.backend.service.IExperienciaLaboralService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaLaboralController {
    @Autowired
    private IExperienciaLaboralService experienciaLaboralService;
    
    @GetMapping("/experiencia")
    @ResponseBody
    public List<ExperienciaLaboral>traerExperienciasLaborales(){
        return experienciaLaboralService.traerTodasLasexperienciasLaborales();
    }
    
    
    @GetMapping("/experiencia/{id}")
    @ResponseBody
    public ExperienciaLaboral getExperienciaLaboralByID(@PathVariable int id){
        return experienciaLaboralService.getExperienciaLaboralByID(id);
    }
    @PostMapping("/experiencia")
    public void altaExperienciaLaboral(@RequestBody ExperienciaLaboral exp){
        experienciaLaboralService.altaExperienciaLaboral(exp);
    }
    @PutMapping("/experiencia")
    public void editarExperienciaLaboral(@RequestBody ExperienciaLaboral exp){
        experienciaLaboralService.editarExperienciaLaboral(exp);
    }
    @DeleteMapping("/experiencia/{id}")
    public void eliminarExperienciaLaboral(@PathVariable int id){
        experienciaLaboralService.eliminarExperienciaLaboral(id);
    }
    
}
