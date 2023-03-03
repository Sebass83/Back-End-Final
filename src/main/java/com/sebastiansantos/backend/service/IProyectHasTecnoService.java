package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.ProyectHasTecno;
import com.sebastiansantos.backend.model.Proyecto;
import com.sebastiansantos.backend.model.Tecnologia;
import java.util.List;

public interface IProyectHasTecnoService {
    public void guardarTecnologiasDeProyectos(ProyectHasTecno phs);
    public void editarTecnologiasDeProyectos(ProyectHasTecno phs);
    public List<Tecnologia> FindByIdProyecto(int id);
    public List<Tecnologia> traerTodoTDP();
    public void DeleteAllByid_proyecto(int id);
    public List<ProyectHasTecno> traerTodosLosPHS();
    public void eliminarUnaTecnologiaDelProyecto(int idProyecto,int idTecnologia);
    
    
}
