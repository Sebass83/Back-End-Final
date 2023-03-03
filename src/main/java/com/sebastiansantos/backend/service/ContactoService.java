
package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.Contacto;
import com.sebastiansantos.backend.repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService implements IContactoService{
    @Autowired
    public ContactoRepository contactRepo;

    @Override
    public void dejarMensaje(Contacto contacto) {
        contactRepo.save(contacto);
        
    }

    @Override
    public List<Contacto> traerMensajes() {
        return contactRepo.findAll();
    }

    @Override
    public void borrarMensaje(int id) {
        contactRepo.deleteById(id);
    }

    
}
