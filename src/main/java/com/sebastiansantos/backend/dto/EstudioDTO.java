
package com.sebastiansantos.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudioDTO {
    private int id_estudio;
    private boolean es_carrera;
    private String nombre_estudio;
    private boolean finalizado;
    private String entidad_educador;
    private String img_entidad;
    private String titulo;
    private String descripcion;
    private String titulo_Url;
    
}
