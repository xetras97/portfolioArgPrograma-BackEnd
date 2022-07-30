/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.naonesteban.portfolio.service;

import ar.com.naonesteban.portfolio.model.Experiencia;
import java.util.List;

/**
 *
 * @author Esti
 */
public interface IExperienciaService {
    public List<Experiencia> verExperiencias();
    public void crearExperiencia (Experiencia exp);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id);
}
