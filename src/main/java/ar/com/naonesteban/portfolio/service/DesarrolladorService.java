/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.naonesteban.portfolio.service;

import ar.com.naonesteban.portfolio.model.Desarrollador;
import ar.com.naonesteban.portfolio.repository.DesarrolladorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Esti
 */
@Service
public class DesarrolladorService implements IDesarrolladorService {

    @Autowired
    public DesarrolladorRepository desRepo;
    
    @Override
    public List<Desarrollador> verDesarrollador() {
      return desRepo.findAll();     
    }

    @Override
    public void modificarDesarrollador(Desarrollador des) {
        desRepo.save(des);
    }
    
}
