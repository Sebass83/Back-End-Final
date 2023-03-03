package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.ProyectHasTecno;
import com.sebastiansantos.backend.model.Proyecto;
import com.sebastiansantos.backend.model.Tecnologia;
import com.sebastiansantos.backend.repository.ProyectHasTecnoRepository;
import com.sebastiansantos.backend.repository.TecnologiaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectHasTecnoService implements IProyectHasTecnoService {

    @Autowired
    public ProyectHasTecnoRepository phtRepository;
    @Autowired
    public TecnologiaRepository tecnoRepo;

    @Override
    public void guardarTecnologiasDeProyectos(ProyectHasTecno phs) {
        phtRepository.save(phs);
    }

    @Override
    public void editarTecnologiasDeProyectos(ProyectHasTecno phs) {
        phtRepository.save(phs);
    }

    @Override
    public List<Tecnologia> FindByIdProyecto(int id) {
        List<Tecnologia> resultado = new ArrayList();

        List<ProyectHasTecno> aFiltrar = phtRepository.findAll();
        for (ProyectHasTecno filtrado : aFiltrar) {
            if (filtrado.getId_proyecto() == id) {
                resultado.add(tecnoRepo.findById(filtrado.getId_tecnologia()).orElse(null));
            }
        }

        return resultado;
    }

    @Override
    public List<Tecnologia> traerTodoTDP() {
        return tecnoRepo.findAll();
    }

    @Override
    public void DeleteAllByid_proyecto(int id) {
        List<ProyectHasTecno> todos = phtRepository.findAll();

        for (ProyectHasTecno eliminar : todos) {
            if (eliminar.getId_proyecto() == id) {
                phtRepository.deleteById(eliminar.getId());
            }

        }

    }

    @Override
    public List<ProyectHasTecno> traerTodosLosPHS() {
        return phtRepository.findAll();

    }

    @Override
    public void eliminarUnaTecnologiaDelProyecto(int idProyecto, int idTecnologia) {
        List<ProyectHasTecno> tecnologias = phtRepository.findAll();
        for (ProyectHasTecno eliminar : tecnologias) {
            if (eliminar.getId_proyecto() == idProyecto && eliminar.getId_tecnologia() ==  idTecnologia) {
                phtRepository.deleteById(eliminar.getId());
            }

        }
    }

}
