/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.naonesteban.portfolio.service;

import ar.com.naonesteban.portfolio.model.Estudios;
import ar.com.naonesteban.portfolio.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Esti
 */
@Service
public class EstudiosService implements IEstudiosService {

    @Autowired
    public EstudiosRepository estRepo;
    
    @Override
    public List<Estudios> verEstudios() {
        return estRepo.findAll();    
    }

    @Override
    public void crearEstudios(Estudios est) {
        estRepo.save(est);
    }

    @Override
    public void borrarEstudios(Long id) {
        estRepo.deleteById(id);
    }

    @Override
    public Estudios buscarEstudios(Long id) {
        return estRepo.findById(id).orElse(null);
    }
    
}
