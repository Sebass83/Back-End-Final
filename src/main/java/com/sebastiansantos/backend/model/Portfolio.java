
package com.sebastiansantos.backend.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "portfolio")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id_portfolio;
    private String informacion_titulo;
    private String saludo_titulo;
    private String saludo_descripcion;
    private String github_url;
    private String cv_url;
    private String foto_perfil;
    
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn      
    Usuario user;
    

    
}
