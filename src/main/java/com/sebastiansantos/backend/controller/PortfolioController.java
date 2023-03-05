
package com.sebastiansantos.backend.controller;

import com.sebastiansantos.backend.dto.EstudioDTO;
import com.sebastiansantos.backend.dto.ExperienciaLaboralDTO;
import com.sebastiansantos.backend.dto.PortfolioDTO;
import com.sebastiansantos.backend.dto.ProyectoDTO;
import com.sebastiansantos.backend.dto.TecnologiasDTO;
import com.sebastiansantos.backend.model.Estudio;
import com.sebastiansantos.backend.model.ExperienciaLaboral;
import com.sebastiansantos.backend.model.Portfolio;
import com.sebastiansantos.backend.model.Proyecto;
import com.sebastiansantos.backend.model.Tecnologia;
import com.sebastiansantos.backend.service.IEstudioService;
import com.sebastiansantos.backend.service.IExperienciaLaboralService;
import com.sebastiansantos.backend.service.IPortfolioService;
import com.sebastiansantos.backend.service.IProyectHasTecnoService;
import com.sebastiansantos.backend.service.IProyectoService;
import com.sebastiansantos.backend.service.ITecnologiaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PortfolioController {

        @Autowired
        private IPortfolioService portService;
        
        @Autowired
        private ITecnologiaService tecnoService;
        
        @Autowired
        private IProyectoService proyectService;
        
        @Autowired
        private IProyectHasTecnoService phsService;
        
        @Autowired
        private IEstudioService estudioService;
        
        @Autowired
        private IExperienciaLaboralService expLabService;
        
   
    @GetMapping("/portfolio/{id}")
    @ResponseBody
    @CrossOrigin(origins = "https://sebass-dev.web.app", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
    
    public PortfolioDTO obtenerPortfolio(@PathVariable int id) {
        
        List<Proyecto> proyectos = proyectService.traerTodosLosproyectos();
        List<ProyectoDTO> proyectosdto = new ArrayList();
        for(Proyecto p : proyectos){
            ProyectoDTO proyDTO = new ProyectoDTO();
                proyDTO.setId_proyecto(p.getId_proyecto());
                proyDTO.setTitulo_proyecto(p.getTitulo_proyecto());
                proyDTO.setDescripcion_proyecto(p.getDescripcion_proyecto());
                proyDTO.setImgURL_proyecto(p.getImgURL_proyecto());
                proyDTO.setGithub_proyecto(p.getGithub_proyecto());
                proyDTO.setUrl_proyecto(p.getUrl_proyecto());
                proyDTO.setTecnologias((List<Tecnologia>) phsService.FindByIdProyecto(p.getId_proyecto()));

                proyectosdto.add(proyDTO);
        }
        
        List<Tecnologia> tecnologias = tecnoService.traerAllTecnologia();
        List<TecnologiasDTO> tecnologiasDTO = new ArrayList();
        for(Tecnologia t: tecnologias){
            TecnologiasDTO tecnoDTO = new TecnologiasDTO();
            tecnoDTO.setId_tecnologia(t.getId_tecnologia());
            tecnoDTO.setNombre_tecnologia(t.getNombre_tecnologia());
            tecnoDTO.setPorcentaje(t.getPorcentaje());
            tecnoDTO.setSvg_url(t.getSvg_url());
            tecnoDTO.setColor(t.getColor());
            tecnologiasDTO.add(tecnoDTO);
        }
        
        List<Estudio> estudios = estudioService.TraerTodosLosEstudios();
        List<EstudioDTO> estudiosDTO = new ArrayList();
        for(Estudio e:estudios){
            EstudioDTO studyDTO = new EstudioDTO();
            studyDTO.setId_estudio(e.getId_estudio());
            studyDTO.setNombre_estudio(e.getNombre_estudio());
            studyDTO.setDescripcion(e.getDescripcion());
            studyDTO.setEntidad_educador(e.getEntidad_educador());
            studyDTO.setImg_entidad(e.getImg_entidad());
            studyDTO.setEs_carrera(e.isEs_carrera());
            studyDTO.setFinalizado(e.isFinalizado());
            studyDTO.setTitulo(e.getTitulo());
            studyDTO.setTitulo_Url(e.getTitulo_Url());
            estudiosDTO.add(studyDTO);        
        }
        
        List<ExperienciaLaboral> experienciaLaboral =  expLabService.traerTodasLasexperienciasLaborales();
        List<ExperienciaLaboralDTO> experienciaLaboralDTO = new ArrayList();
        for(ExperienciaLaboral exp:experienciaLaboral){
            ExperienciaLaboralDTO expDTO = new ExperienciaLaboralDTO();
            expDTO.setId_experiencia_laboral(exp.getId_experiencia_laboral());
            expDTO.setEmpresa(exp.getEmpresa());
            expDTO.setPuesto(exp.getPuesto());
            expDTO.setDescripcion(exp.getDescripcion());
            expDTO.setDesde(exp.getDesde());
            expDTO.setHasta(exp.getHasta());
            experienciaLaboralDTO.add(expDTO);
        }
        
        PortfolioDTO portDTO = new PortfolioDTO();
        portDTO.setId_portfolio(portService.traerPortfolio(id).getId_portfolio());
        portDTO.setCv_url(portService.traerPortfolio(id).getCv_url());
        portDTO.setFoto_perfil(portService.traerPortfolio(id).getFoto_perfil());
        portDTO.setFull_name(portService.traerPortfolio(id).getUser().getFullname());
        portDTO.setGithub_url(portService.traerPortfolio(id).getGithub_url());
        portDTO.setInformacion_titulo(portService.traerPortfolio(id).getInformacion_titulo());
        portDTO.setSaludo_descripcion(portService.traerPortfolio(id).getSaludo_descripcion());
        portDTO.setSaludo_titulo(portService.traerPortfolio(id).getSaludo_titulo());
        portDTO.setTecnologias(tecnologiasDTO);
        portDTO.setProyectos(proyectosdto);
        portDTO.setEstudios(estudiosDTO);
        portDTO.setExperienciasLaborales(experienciaLaboralDTO);
        
       return  portDTO;

    }
    

    @PostMapping("/portfolio") 
    public void altaPortfollio(@RequestBody Portfolio portfolio){ 
        
        portService.altaPortfolio(portfolio);
    }

   @PutMapping("/portfolio")
   @CrossOrigin(origins = { "localhost:4200"}, allowedHeaders={"Accept"}) 
    public void modificarPortfolio(@RequestBody Portfolio portfolio){
        portService.modificarPortfolio(portfolio);
    }
    


}
