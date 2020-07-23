/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comstructor;

/**
 *
 * @author hokolate
 */
public class Pizza {
    
    private String masa = "";
       private String salsa = "";
       private String relleno = "";
       

public void setMasa(String masa){
this.masa=masa;
}       
       
       
public void setSalsa(String salsa){
this.salsa=salsa;
}

public void setRelleno(String relleno){
this.relleno=relleno;
}


public void mostrar(){
System.out.println("la masa de la pizza  es: "+ masa );
System.out.println("la salsa de la pizza  es: "+ salsa );
System.out.println("el relleno de la pizza  es: "+ relleno );
}
    
    
}

    

 