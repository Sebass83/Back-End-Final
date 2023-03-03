
package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.Estudio;
import com.sebastiansantos.backend.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService {
    @Autowired
    public EstudioRepository estudioRepo;
    
    @Override
    public void altaEstudio(Estudio estudio) {       
        estudioRepo.save(estudio);
    
    }

    @Override
    public Estudio getEstudioByID(int id) {
        return estudioRepo.findById(id).orElse(null);
    }

    @Override
    public List<Estudio> TraerTodosLosEstudios() {
        return estudioRepo.findAll();
    }

    @Override
    public void editarEstufdio(Estudio estudio) {
        estudioRepo.save(estudio);
    }

    @Override
    public void eliminarEstudio(int id) {
        estudioRepo.deleteById(id);
    }
    
}
