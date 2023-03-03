package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.Proyecto;
import com.sebastiansantos.backend.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    public ProyectoRepository proyectRepo;

    @Override
    public void altaProyecto(Proyecto proyect) {
        proyectRepo.save(proyect);
    }

    @Override
    public void modificarProyecto(Proyecto proyect) {
        proyectRepo.save(proyect);        
    }

    @Override
    public void borrarProyecto(int id) {
        proyectRepo.deleteById(id);
    }

    @Override
    public List<Proyecto> traerTodosLosproyectos() {
                   
        return proyectRepo.findAll();
    }

    @Override
    public Proyecto traerProyectoPorId(int id) {
        return proyectRepo.findById(id).orElse(null);
    }
    
}
