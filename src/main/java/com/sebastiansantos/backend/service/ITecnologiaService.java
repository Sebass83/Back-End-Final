package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.Tecnologia;
import java.util.List;

public interface ITecnologiaService {
    public void altaTecnologia(Tecnologia tecnologia);
    public void modificarTecnologia(Tecnologia tecnologia);
    public void eliminarTecnologia(int id);
    public Tecnologia traerTecnologia(int id);
    public List<Tecnologia> traerAllTecnologia(); 
    public List<Tecnologia> findTecnologiaByUser_iduser(Tecnologia buscar);
}
