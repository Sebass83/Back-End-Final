
package com.sebastiansantos.backend.controller;

import com.sebastiansantos.backend.model.Contacto;
import com.sebastiansantos.backend.service.IContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactoController {
    @Autowired
        private IContactoService contactService;
    
        @GetMapping("/contacto")
        public List<Contacto> traerMensajes(){
            return contactService.traerMensajes();
        }
        
        @PostMapping("/contacto")
        public void dejarMensaje(@RequestBody Contacto mensaje){
            contactService.dejarMensaje(mensaje);
        }
        
        @DeleteMapping("/contacto/{id}")
        public void eliminarMensaje(@PathVariable int id){
            contactService.borrarMensaje(id);  
        }
    
    
    
    
    
}
