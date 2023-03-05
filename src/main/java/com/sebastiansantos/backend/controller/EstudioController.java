
package com.sebastiansantos.backend.controller;

import com.sebastiansantos.backend.model.Estudio;
import com.sebastiansantos.backend.service.IEstudioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://sebass-dev.web.app", methods= {RequestMethod.GET,RequestMethod.POST})
public class EstudioController {
    @Autowired
    private IEstudioService estudioService;
    
  
    @GetMapping("/estudio")
    @ResponseBody
    public List<Estudio> TraerTodosLosEstudios(){
        return estudioService.TraerTodosLosEstudios();
    }
    
    @GetMapping("/estudio/{id}")
    @ResponseBody
    public Estudio getEstudioByID(@PathVariable int id){
        return estudioService.getEstudioByID(id);
    }
    
    @PostMapping("/estudio")
    public void altaEstudio(@RequestBody Estudio estudio){
        estudioService.altaEstudio(estudio);
    }
    
    @PutMapping("/estudio")
    public void editarEstufdio(@RequestBody Estudio estudio){
        estudioService.editarEstufdio(estudio);
    }
    
    @DeleteMapping("/estudio/{id}")
    public void eliminarEstudio(@PathVariable int id){
        estudioService.eliminarEstudio(id);
   
    }

       
}
