/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.com.naonesteban.portfolio.service;

import ar.com.naonesteban.portfolio.model.User;
import java.util.List;

/**
 *
 * @author Esti
 */
public interface IUserService {
    public List<User> verUser();
    public User buscarUser(Long id);
}
