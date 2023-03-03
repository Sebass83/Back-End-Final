
package com.sebastiansantos.backend.service;

import org.springframework.stereotype.Service;
import com.sebastiansantos.backend.model.ExperienciaLaboral;
import java.util.List;

@Service
public interface IExperienciaLaboralService {
    
    public void altaExperienciaLaboral(ExperienciaLaboral experiencia);
    public ExperienciaLaboral getExperienciaLaboralByID(int id);
    public List<ExperienciaLaboral> traerTodasLasexperienciasLaborales();
    public void editarExperienciaLaboral(ExperienciaLaboral experiencia);
    public void eliminarExperienciaLaboral(int id);
    
}
