
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
@Table(name = "proyectos")
public class Proyecto {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_proyecto;
    
    private String imgURL_proyecto;
    
    @Column(nullable = false)
    private String titulo_proyecto;
    
    @Column(nullable = false)
    private String descripcion_proyecto;
    
    private String github_proyecto;
    private String url_proyecto;
    
    
}
