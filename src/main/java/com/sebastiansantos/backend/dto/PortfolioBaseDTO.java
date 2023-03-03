package com.sebastiansantos.backend.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioBaseDTO implements Serializable {
    
    private String informacion_titulo;
    private String saludo_titulo;
    private String saludo_descripcion;
    private String github_url;
    private String cv_url;
    private String foto_perfil;
  
}
