/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.naonesteban.portfolio.service;

import ar.com.naonesteban.portfolio.model.Proyectos;
import java.util.List;

/**
 *
 * @author Esti
 */
public interface IProyectosService {
    public List<Proyectos> verProyectos();
    public void crearProyecto(Proyectos pro);
    public void borrarProyecto (Long id);
    public Proyectos buscarProyecto (Long id);
}
