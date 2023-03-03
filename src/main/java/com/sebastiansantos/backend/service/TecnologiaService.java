package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.Tecnologia;
import com.sebastiansantos.backend.repository.TecnologiaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService {

    @Autowired
    public TecnologiaRepository tecnoRepo;

    @Override
    public void altaTecnologia(Tecnologia tecnologia) {

        tecnoRepo.save(tecnologia);
    }

    @Override
    public void modificarTecnologia(Tecnologia tecnologia) {
        tecnoRepo.save(tecnologia);
    }

    @Override
    public void eliminarTecnologia(int id) {
        tecnoRepo.deleteById(id);
    }

    @Override
    public Tecnologia traerTecnologia(int id) {
        return tecnoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Tecnologia> traerAllTecnologia() {
        return tecnoRepo.findAll();
    }
    
    @Override
    public List<Tecnologia> findTecnologiaByUser_iduser(Tecnologia buscar) {
        List<Tecnologia> tecnologias = tecnoRepo.findAll();
        List<Tecnologia> resultado = new ArrayList<>();
        for (Tecnologia tecno : tecnologias) {
            if (tecno.equals(buscar)) {
                resultado.add(tecno);
            }
        }

        if (resultado.size() > 0) {
            return resultado;
        } else {
            return null;
        } 
    }
}

