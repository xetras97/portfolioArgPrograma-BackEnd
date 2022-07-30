/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.naonesteban.portfolio.service;

import ar.com.naonesteban.portfolio.model.Estudios;
import java.util.List;

/**
 *
 * @author Esti
 */
public interface IEstudiosService {
    public List<Estudios> verEstudios();
    public void crearEstudios (Estudios est);
    public void borrarEstudios(Long id);
    public Estudios buscarEstudios (Long id);
}
