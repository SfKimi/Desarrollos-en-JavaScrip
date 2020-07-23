package adstracta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chokolate
 */
public abstract class ANIMAL {
    
    private String nombre;
    
    public ANIMAL(){}
    
    public void comer(){
    System.out.println("El"+nombre+"esta comiendo");
    }
    
    public abstract void moverse();
    
    public void cambiarnombre(String nombre){
    this.nombre=nombre;
    
    }
    
    public String darnombre(){
    return nombre;
    }
    
}
