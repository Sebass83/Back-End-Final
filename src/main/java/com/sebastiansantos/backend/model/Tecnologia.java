
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
@Table(name = "tecnologias")
public class Tecnologia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int id_tecnologia;          
    
    
    @Column(nullable = false)
    private String nombre_tecnologia;   
   
    @Column(nullable = false)
    private String svg_url;             
    
    @Column(nullable = false)
    private String color;
    
    @Column(nullable = false)
    private int porcentaje; 

}