
package com.sebastiansantos.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactoDTO {
    
    private int id_Contacto;
    private String nombre_completo;
    private String email;
    private String mensaje;
    
}
