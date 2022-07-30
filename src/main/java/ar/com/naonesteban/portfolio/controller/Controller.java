/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.naonesteban.portfolio.controller;

import ar.com.naonesteban.portfolio.model.Desarrollador;
import ar.com.naonesteban.portfolio.model.Estudios;
import ar.com.naonesteban.portfolio.model.Experiencia;
import ar.com.naonesteban.portfolio.model.Habilidades;
import ar.com.naonesteban.portfolio.model.Proyectos;
import ar.com.naonesteban.portfolio.service.IDesarrolladorService;
import ar.com.naonesteban.portfolio.service.IEstudiosService;
import ar.com.naonesteban.portfolio.service.IExperienciaService;
import ar.com.naonesteban.portfolio.service.IHabilidadesService;
import ar.com.naonesteban.portfolio.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Esti
 */

@RestController
public class Controller {
    
    //HABILIDADES
    @Autowired
    private IHabilidadesService habServ;
    @PostMapping ("/new/habilidad")
    public void agregarHabilidad(@RequestBody Habilidades hab) {
        //listaPersonas.add(pers);
        habServ.crearHabilidad(hab);
    }
    
    @GetMapping ("/ver/habilidades")
    @ResponseBody
    public List<Habilidades> verHabilidades() {
        //return listaPersonas;
        return habServ.verHabilidades();
    }
    
    @DeleteMapping ("/delete/habilidad/{id}")
    public void borrarHabilidad(@PathVariable Long id){
        habServ.borrarHabilidad(id);
    }
    
    //DESARROLLADOR
    @Autowired
    private IDesarrolladorService habDes;
    @PostMapping ("/new/desarrollador")
    public void modificarDesarrollador(@RequestBody Desarrollador des) {
        //listaPersonas.add(pers);
        habDes.modificarDesarrollador(des);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/ver/desarrollador")
    @ResponseBody
    public List<Desarrollador> verDesarrollador() {
        //return listaPersonas;
        return habDes.verDesarrollador();
    }
    
    //ESTUDIOS
    @Autowired
    private IEstudiosService estServ;
    @PostMapping ("/new/estudios")
    public void agregarEstudio(@RequestBody Estudios est) {
        estServ.crearEstudios(est);
    }
    
    @GetMapping ("/ver/estudios")
    @ResponseBody
    public List<Estudios> verEstudios() {
        //return listaPersonas;
        return estServ.verEstudios();
    }
    
    @GetMapping ("/ver/estudios/{id}")
    @ResponseBody
    public Estudios buscarEstudios(@PathVariable Long id){
        return estServ.buscarEstudios(id);
    }
    
    @DeleteMapping ("/delete/estudios/{id}")
    public void borrarEstudio(@PathVariable Long id){
        estServ.borrarEstudios(id);
    }
    
    //PROYECTOS
    @Autowired
    private IProyectosService proServ;
    @PostMapping ("/new/proyectos")
    public void agregarProyecto(@RequestBody Proyectos pro) {
        proServ.crearProyecto(pro);
    }
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        //return listaPersonas;
        return proServ.verProyectos();
    }
    
    @DeleteMapping ("/delete/proyectos/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proServ.borrarProyecto(id);
    }
    
    //EXPERIENCIA
    @Autowired
    private IExperienciaService expServ;
    @PostMapping ("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp) {
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping ("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        //return listaPersonas;
        return expServ.verExperiencias();
    }
    
    @DeleteMapping ("/delete/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
}
