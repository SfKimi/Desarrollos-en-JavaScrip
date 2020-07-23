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
public class INTERFAZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        CARRO C = new CARRO();
        
        BICICLETA B =new BICICLETA();
        
        C.avanzar();
        C.detenerce();
        B.avanzar();
        B.detenerce();
        
    }
    
}
