/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.naonesteban.portfolio.service;

import ar.com.naonesteban.portfolio.model.Habilidades;
import ar.com.naonesteban.portfolio.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Esti
 */
@Service
public class HabilidadesService implements IHabilidadesService {
    @Autowired
    public HabilidadesRepository habRepo;

    @Override
    public List<Habilidades> verHabilidades() {
        return habRepo.findAll();    
    }

    @Override
    public void crearHabilidad(Habilidades hab) {
        habRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidad(Long id) {
        return habRepo.findById(id).orElse(null);
    }
}
