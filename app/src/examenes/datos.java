/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes;

/**
 *
 * @author Chokolate
 */
public class datos {
    
     private String nombre;
    private String piel;
    private int edad;
    private double estatura;
    
    public datos (){
    nombre= "";
    piel= "";
    edad =0;
    estatura=0;
    }
    
    public datos (String nombre,String piel,int edad,double estatura){
     this.nombre=nombre;
     this.piel=piel;
     this.edad=edad;
     this.estatura=estatura;
    }
    
    public void modificarnombre(String nombre){
    this.nombre=nombre;
    }
    
    public String odtenernombre(){
    return nombre;
    }
    
    public void modificarpiel(String piel){
    this.piel=piel;
    }
    
    public String odtenerpiel(){
    return piel;
    }
    
    public void modificaredad(int edad){
    this.edad=edad;
    }
    
    public int odteneredad(){
    return edad;
    }
    
    
     public void modificarestatura(double estatura){
    this.estatura=estatura;
    }
    
    public double odtenerestatura(){
    return estatura;
    }
    
    
    
}
