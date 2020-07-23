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
public abstract class automovildecorador implements automovil {
    
    private automovil auto;
    
    public automovildecorador(automovil auto){
    this.auto=auto;
    }
    
    protected automovil regresaauto(){//solo lo pueden  usar  las  clases  que  hereden del automovildecorador
    return auto;
    }
    
}
