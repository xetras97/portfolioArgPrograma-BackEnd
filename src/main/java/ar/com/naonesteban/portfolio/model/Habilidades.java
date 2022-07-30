/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.naonesteban.portfolio.model;

import java.sql.Blob;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "habilidades")
public class Habilidades {
    @Id
    private Long idHabilidades;
    
    private String nombre;
    private String tipo;
    private String nivel;
    private String img;
    private String otro;
    
    public Habilidades() {
        
    }
    
    public Habilidades (Long idHabilidades, String nombre, String tipo, String nivel, String img, String otro) {
        this.idHabilidades = idHabilidades;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.img = img;
        this.otro = otro;
    }
}

