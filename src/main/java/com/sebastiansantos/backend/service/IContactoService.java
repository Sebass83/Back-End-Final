package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.Contacto;
import java.util.List;

public interface IContactoService {
    public void dejarMensaje(Contacto contacto);
    public List<Contacto> traerMensajes();
    public void borrarMensaje(int id);
  
    
}
