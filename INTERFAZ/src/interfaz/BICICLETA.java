/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Chokolate
 */
public class BICICLETA implements Rueda, SILLA {
    
    public BICICLETA(){
    
    
    }

  
    public void avanzar() {
        System.out.println("El bicicleta esta  avanzando");
    }


    public void detenerce() {
        System.out.println("El bicicleta  se  detiene");
    }

    
    public void sentarse() {
        System.out.println("tiene  pasajeros");
    }
    
    
    
    
    
}
