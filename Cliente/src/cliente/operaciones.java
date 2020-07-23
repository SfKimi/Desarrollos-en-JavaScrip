/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Chokolate
 */
public class operaciones {
    
    String Nombre;
    int cedula; 
    


public operaciones ( ){

Nombre="pepito";

cedula=12000;


}


public operaciones(String Nombre,int cedula){
                    
                    this.Nombre=Nombre;
                            this.cedula=cedula;
                    
                    
                    }


public String obtenerNombre(){
                    
                    return Nombre;
                    }

public int obtenercedula(){
                    
                    return cedula;
                    }



public int ingresarcedula(){
                    
                              
cedula=Integer.parseInt(JOptionPane.showInputDialog("Numero de  cedula"));

 JOptionPane.showMessageDialog(null,"cedula  es"+ cedula);

 return cedula;
}

}