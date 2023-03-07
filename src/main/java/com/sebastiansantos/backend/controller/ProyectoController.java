package com.sebastiansantos.backend.controller;

import com.sebastiansantos.backend.model.Proyecto;
import com.sebastiansantos.backend.service.IProyectHasTecnoService;
import com.sebastiansantos.backend.service.IProyectoService;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://sebastian-santos.web.app/", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProyectoController {
        @Autowired
        private IProyectoService proyectService;
        
        @Autowired 
        private IProyectHasTecnoService phtService;
        
        @GetMapping("/proyecto")
        public List<Proyecto> traerTodosLosPoroyectos(){
            return proyectService.traerTodosLosproyectos();
        }
        
        
        @PostMapping("/proyecto")
        public void altaProyecto(@RequestBody Proyecto proyect){
            proyectService.altaProyecto(proyect);
        }
        
        @PutMapping("/proyectos")
        public void modificarProyecto(@RequestBody Proyecto proyect){
            proyectService.modificarProyecto(proyect);
        }
        
        @DeleteMapping("/proyectos/{id}")
        public void eliminarProyecto (@PathVariable int id){
            phtService.DeleteAllByid_proyecto(id);
            proyectService.borrarProyecto(id);
            
        
        }
        
        
        
    
}
