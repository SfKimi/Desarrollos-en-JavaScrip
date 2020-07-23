/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificio;

/**
 *
 * @author Chokolate
 */
public class LOCAL extends EDIFICIO {
    
    String TIPODELOCAL;
    int NUMERODELOCAL;
    String DUEÑODELOCAL;
    int CANTIDADDEEMPLEADOS;
    
     public LOCAL(){
    
        this.NOMBRE="LOCAL";
        this.TIPODELOCAL="en obra  gris";
         this.NUMERODELOCAL =2;
         this.DUEÑODELOCAL="alfo";
          this.CANTIDADDEEMPLEADOS =1;
    }
    
     public LOCAL(String NOMBRE){
    
         this.NOMBRE= NOMBRE;
        this.TIPODELOCAL="en obra  gris";
         this.NUMERODELOCAL =2;
         this.DUEÑODELOCAL="alfo";
          this.CANTIDADDEEMPLEADOS =1;
         
    }
    
    
    public String regresartipodelocal (){ 
    return TIPODELOCAL;
    } 
    public void cambiartipodelocal(String TIPODELOCAL){
    this.TIPODELOCAL=TIPODELOCAL;  
    }
    
    
      public String regresardueñodelocal (){ 
    return DUEÑODELOCAL;
    } 
    public void cambiardueñodelocal(String DUEÑODELOCAL){
    this.DUEÑODELOCAL=DUEÑODELOCAL;  
    }
    
     public int regresarnumerodelocal (){
    return NUMERODELOCAL;
    } 
     public void cambiarnumerodelocal(int NUMERODELOCAL){
        this.NUMERODELOCAL=NUMERODELOCAL;
    }
    
    
     
      public int regresarcantidaddeempleados (){
    return CANTIDADDEEMPLEADOS;
    } 
     public void cambiarcantidaddeempleados(int CANTIDADDEEMPLEADOS){
        this.CANTIDADDEEMPLEADOS=CANTIDADDEEMPLEADOS;
    }
     
     
     
     
}
