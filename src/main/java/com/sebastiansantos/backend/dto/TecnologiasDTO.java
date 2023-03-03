package com.sebastiansantos.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TecnologiasDTO {
    private int id_tecnologia;          
    private String nombre_tecnologia;   
    private String svg_url;             
    private String color;
    private int porcentaje;    
}
