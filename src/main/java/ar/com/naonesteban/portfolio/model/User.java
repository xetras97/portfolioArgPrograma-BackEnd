/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.naonesteban.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Esti
 */
@Getter @Setter    
@Entity
@Table(name = "user")
public class User {
    @Id
    private Long idUser;
    private String username;
    private String password;
    private String token;
    
    
    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
    
    public String getToken() {
	return token;
    }

    public void setToken(String token) {
	this.token = token;
    }

    public User() {
        
    }
    
    public User (Long idUser, String username, String password, String token) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.token = token;
    }
}