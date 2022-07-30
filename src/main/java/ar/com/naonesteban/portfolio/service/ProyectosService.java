/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.naonesteban.portfolio.service;

import ar.com.naonesteban.portfolio.model.Proyectos;
import ar.com.naonesteban.portfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Esti
 */
@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    public ProyectosRepository proRepo;
    
    @Override
    public List<Proyectos> verProyectos() {
        return proRepo.findAll();        
    }

    @Override
    public void crearProyecto(Proyectos pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        return proRepo.findById(id).orElse(null);
    }
    
}
