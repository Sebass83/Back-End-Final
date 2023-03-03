package com.sebastiansantos.backend.dto;

import com.sebastiansantos.backend.model.Tecnologia;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProyectoDTO {

    private int id_proyecto;
    private String imgURL_proyecto;
    private String titulo_proyecto;
    private String descripcion_proyecto;
    private String github_proyecto;
    private String url_proyecto;
    private List<Tecnologia> tecnologias;
    
}
