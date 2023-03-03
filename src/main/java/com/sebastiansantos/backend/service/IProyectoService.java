
package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    public void altaProyecto(Proyecto proyect);
    public void modificarProyecto(Proyecto proyect);
    public void borrarProyecto(int id);
    public List<Proyecto> traerTodosLosproyectos();
    public Proyecto traerProyectoPorId(int id); 
    
}
