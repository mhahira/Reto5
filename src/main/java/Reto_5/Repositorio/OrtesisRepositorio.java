/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_5.Repositorio;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto_5.Modelo.Ortesis;
import Reto_5.Interface.InterfaceOrtesis;

/**
 *
 * @author USUARIO
 */
@Repository
public class OrtesisRepositorio {
      @Autowired
    private InterfaceOrtesis crud;
    

    public List<Ortesis> getAll(){
        return (List<Ortesis>) crud.findAll();       
    }
    
    public Optional <Ortesis> getOrthesis(int id){
        return crud.findById(id);
    }
    
    public Ortesis save(Ortesis ortesis){
        return crud.save(ortesis);
    }
      public void delete(Ortesis ortesis){
        crud.delete(ortesis);
    }
}
