/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.naonesteban.portfolio.service;

import ar.com.naonesteban.portfolio.model.Habilidades;
import java.util.List;

/**
 *
 * @author Esti
 */
public interface IHabilidadesService {
    public List<Habilidades> verHabilidades();
    public void crearHabilidad (Habilidades hab);
    public void borrarHabilidad (Long id);
    public Habilidades buscarHabilidad (Long id);
}
