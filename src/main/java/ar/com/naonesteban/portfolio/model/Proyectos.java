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
@Table(name = "proyectos")
public class Proyectos {
    @Id
    private Long idProyectos;
    
    private String nombre;
    private String imagen;
    private String descripcion;
    private String stack;
    private String web;
    private String github;
    private Long año;
    private String observaciones;
    private String img2;
    private String img3;
    private String img4;
    private String img5;
    private String img6;
    
    public Proyectos() {
        
    }
    
    public Proyectos (Long idProyectos, String nombre, String imagen, String descripcion, 
            String stack, String web, String github, Long año, String observaciones, 
            String img2, String img3, String img4, String img5, String img6) {
        this.idProyectos = idProyectos;
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.stack = stack;
        this.web = web;
        this.github = github;
        this.año = año;
        this.observaciones = observaciones;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
    }
}
