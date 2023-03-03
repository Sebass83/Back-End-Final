
package com.sebastiansantos.backend.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienciaLaboralDTO {
    private int id_experiencia_laboral;
    private String empresa;
    private String puesto;
    private String descripcion;
    private Date desde;
    private Date hasta;
    
}
