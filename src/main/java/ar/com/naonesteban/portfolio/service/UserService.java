/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.naonesteban.portfolio.service;


import ar.com.naonesteban.portfolio.model.User;
import ar.com.naonesteban.portfolio.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Esti
 */
@Service
public class UserService implements IUserService {

    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<User> verUser() {
        return userRepo.findAll();    
    } 

    @Override
    public User buscarUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }
}