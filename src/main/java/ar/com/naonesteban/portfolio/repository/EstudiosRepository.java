/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.naonesteban.portfolio.repository;

import ar.com.naonesteban.portfolio.model.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Esti
 */
@Repository
public interface EstudiosRepository extends JpaRepository<Estudios, Long>{
    
}