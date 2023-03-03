
package com.sebastiansantos.backend.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "experiencia_laboral")
public class ExperienciaLaboral {
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_experiencia_laboral;
    private String empresa;
    private String puesto;
    private String descripcion;
    private Date desde;
    private Date hasta;

    
}
