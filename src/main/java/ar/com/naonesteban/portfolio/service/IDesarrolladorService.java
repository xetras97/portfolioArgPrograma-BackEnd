/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.naonesteban.portfolio.service;

import ar.com.naonesteban.portfolio.model.Desarrollador;
import java.util.List;

/**
 *
 * @author Esti
 */
public interface IDesarrolladorService {
    public List<Desarrollador> verDesarrollador();
    public void modificarDesarrollador (Desarrollador des);
}
