
package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.Estudio;
import java.util.List;


public interface IEstudioService {
    public void altaEstudio(Estudio estudio);
    public Estudio getEstudioByID(int id);
    public List<Estudio> TraerTodosLosEstudios();
    public void editarEstufdio(Estudio estudio);
    public void eliminarEstudio(int id);
  
   
    
}
