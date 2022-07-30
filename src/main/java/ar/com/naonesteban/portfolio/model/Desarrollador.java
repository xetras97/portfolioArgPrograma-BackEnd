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
@Table(name = "desarrollador")
public class Desarrollador {
    @Id
    private Long idDesarrollador;
    
    private String nombre;
    private String apellido;
    private String titulo;
    private String img;
    private String descripcion;
    private String tituloSecundario;
    private String github;
    private String linkedin;
    private String instagram;
    private String banner;
    
    public Desarrollador() {
        
    }
    
    public Desarrollador (Long idDesarrollador, String nombre, String apellido, 
            String titulo, String img, String descripcion, String tituloSecundario, 
            String github, String linkedin, String instagram, String banner) {
        this.idDesarrollador = idDesarrollador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.img = img;
        this.descripcion = descripcion;
        this.tituloSecundario = tituloSecundario;
        this.github = github;
        this.linkedin = linkedin;
        this.instagram = instagram;
        this.banner = banner;
    }
}