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
public class DECORADOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        //carroestandar carro = new carroestandar("chevy");
        automovil carro = new carroestandar("chevy");
        carro.start();
        carro.accel();
        carro.stop();
        
        carro = new autoelectrico(carro);
        carro.start();
        carro.accel();
         carro.stop();
        //automovil carro = new autoelectrico(automovil carro = new carroestandar("chevy"));
    }
    
}
