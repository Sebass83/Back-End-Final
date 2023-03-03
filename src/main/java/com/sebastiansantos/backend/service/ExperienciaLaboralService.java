
package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.ExperienciaLaboral;
import com.sebastiansantos.backend.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {
    
    @Autowired
    public ExperienciaLaboralRepository expLaboralRepo;
    
     @Override
    public void altaExperienciaLaboral(ExperienciaLaboral experiencia) {
        expLaboralRepo.save(experiencia);
    }

    @Override
    public ExperienciaLaboral getExperienciaLaboralByID(int id) {
        return expLaboralRepo.findById(id).orElse(null);
    }

    @Override
    public List<ExperienciaLaboral> traerTodasLasexperienciasLaborales() {
        return expLaboralRepo.findAll();
    }

    @Override
    public void editarExperienciaLaboral(ExperienciaLaboral experiencia) {
        expLaboralRepo.save(experiencia);
    }

    @Override
    public void eliminarExperienciaLaboral(int id) {
        expLaboralRepo.deleteById(id);
    }

}
