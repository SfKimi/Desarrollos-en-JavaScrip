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
public class autoelectrico extends automovildecorador {

 public autoelectrico (automovil auto){
 super(auto);
 }
    
    public void accel() {
        System.out.println("iniciando electricamente");
       regresaauto().accel();
       
    }

  
    public void stop() {
        System.out.println("controlando frenos electronicos");
        regresaauto().stop();
    }


    public void start() {
        System.out.println("iniciar sistema operativo");
       regresaauto().start();
    }
    
}
