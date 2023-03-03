package com.sebastiansantos.backend.dto;

import com.sebastiansantos.backend.model.Tecnologia;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioDTO implements Serializable {
    private int id_portfolio;
    private String full_name;
    private String informacion_titulo;
    private String saludo_titulo;
    private String saludo_descripcion;
    private String github_url;
    private String cv_url;
    private String foto_perfil;
    private List<ProyectoDTO> proyectos;
    private List<TecnologiasDTO> tecnologias; 
    private List<EstudioDTO> estudios;
    private List<ExperienciaLaboralDTO> experienciasLaborales;
}
