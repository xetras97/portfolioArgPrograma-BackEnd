/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.naonesteban.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Esti
 */
@Getter @Setter    
@Entity
@Table(name = "educacion")
public class Estudios {
    @Id
    private Long idEducacion;
    
    private String titulo;
    private Long anio;
    private String institucion;
    private String img;
    private String periodo;

    public Estudios() {
        
    }
    
    public Estudios (Long idEducacion, String titulo, Long año, 
            String institucion, String img, String periodo) {
        this.idEducacion = idEducacion;
        this.titulo = titulo;
        this.anio = año;
        this.institucion = institucion;
        this.img = img;
        this.periodo = periodo;
    }
}
