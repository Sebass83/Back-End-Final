
package com.sebastiansantos.backend.model;

import javax.persistence.Column;
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
@Table(name = "proy_has_tecno")
public class ProyectHasTecno {
    

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id")
    int id;
    
    @Column(name = "id_proyecto")
    int id_proyecto;
    
    @Column(name = "id_tecnologia")
    int id_tecnologia;
    
}
