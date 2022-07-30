/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.naonesteban.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Esti
 */
@Getter @Setter
@Entity
public class Experiencia {
    @Id
    private Long idExperiencia;
    private String cargo;
    private String empresa;
    private String periodo;
    private String funcion;
    private String img;
    
    public Experiencia() {
        
    }
    
    public Experiencia (Long idExperiencia, String cargo, String empresa, String periodo, String funcion, String img) {
        this.idExperiencia = idExperiencia;
        this.cargo = cargo;
        this.empresa = empresa;
        this.periodo = periodo;
        this.funcion = funcion;
        this.img = img;
    }
}
