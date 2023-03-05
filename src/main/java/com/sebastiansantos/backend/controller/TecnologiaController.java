package com.sebastiansantos.backend.controller;

import com.sebastiansantos.backend.model.ProyectHasTecno;
import com.sebastiansantos.backend.model.Tecnologia;
import com.sebastiansantos.backend.service.IProyectHasTecnoService;
import com.sebastiansantos.backend.service.ITecnologiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://sebass-dev.web.app", methods= {RequestMethod.GET,RequestMethod.POST})
public class TecnologiaController {
    
        @Autowired
        private ITecnologiaService tecnoService;
        
        @Autowired
        private IProyectHasTecnoService phtService;
        
      
        
        @PostMapping("/tecnologia")
        public void altaTecnologia(@RequestBody Tecnologia tecnologia){
            
            tecnoService.altaTecnologia(tecnologia);
   
        }
        
        @PutMapping("/tecnologia")
        public void modificarTecnologia(@RequestBody Tecnologia tecnologia){
            
            tecnoService.modificarTecnologia(tecnologia);
            
        }
        
        @GetMapping("/tecnologia/{id}")
        @ResponseBody
        public Tecnologia traerTecnologia(@PathVariable int id){
            
            return tecnoService.traerTecnologia(id);
        
        }
        
        @DeleteMapping("/tecnologia/{id}")
        public void eliminarTecnologia(@PathVariable int id){
            List<ProyectHasTecno> phs= phtService.traerTodosLosPHS();
            for(ProyectHasTecno tecno:phs){
                if(tecno.getId_tecnologia() == id){
                   
                    phtService.eliminarUnaTecnologiaDelProyecto(tecno.getId_proyecto(), tecno.getId_tecnologia());

                }
            }
            
            tecnoService.eliminarTecnologia(id);
       
        }
        
                
    
    
}
