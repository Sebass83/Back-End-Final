
package com.sebastiansantos.backend.controller;

import com.sebastiansantos.backend.model.ProyectHasTecno;
import com.sebastiansantos.backend.service.IProyectHasTecnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PHTController {
        @Autowired
        private IProyectHasTecnoService phtService;
        
        @PostMapping("/phs")
        @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
        
        public void guardarTecnologiasDeProyectos(@RequestBody ProyectHasTecno phs){
            
            phtService.guardarTecnologiasDeProyectos(phs);
        }
        
        @DeleteMapping("/phs/proyecto/{id}")
        public void DeleteAllByid_proyecto(@PathVariable int id){
            phtService.DeleteAllByid_proyecto(id);
        }
        @DeleteMapping("/phs/tecno/{idP}/{idT}")
        public void eliminarUnaTecnologiaDelProyecto(@PathVariable int idP, @PathVariable int idT){
            phtService.eliminarUnaTecnologiaDelProyecto(idP, idT);
        }
        
    
}
