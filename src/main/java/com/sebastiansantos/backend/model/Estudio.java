
package com.sebastiansantos.backend.model;
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
@Table(name = "estudio")
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
