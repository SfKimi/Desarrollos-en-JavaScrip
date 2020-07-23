/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

/**
 *
 * @author Chokolate
 */
public class carroestandar implements automovil {

    private String nombre;
    
    public carroestandar(String nombre){
    
    this.nombre=nombre;
    }
   
    public void accel() {
       System.out.println("aceleracion estandar");
    }


    public void stop() {
       System.out.println("frenar   ");
    }


    public void start() {
        System.out.println("prender el carro");
    }
    
}
