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
public class OFICINA extends EDIFICIO {
    
    
    String NOMBREEMPRESA;
    int EMPLEADOS;
    String servicio;
    
    
    public OFICINA(){
    
        this.NOMBRE="LOCAL";
        this.NOMBREEMPRESA="gris";
         this.EMPLEADOS =2;
         this.servicio="alfo";

    }
    
     public OFICINA(String NOMBRE){
    
         this.NOMBRE=NOMBRE;
        this.NOMBREEMPRESA="gris";
         this.EMPLEADOS =2;
         this.servicio="alfo";
         
    }
    
     
     
     public String regresarnombreeempresa (){ 
    return NOMBREEMPRESA;
    } 
    public void cambiarnombreempresa(String NOMBREEMPRESA){
    this.NOMBREEMPRESA=NOMBREEMPRESA;  
    }
    
    
    
       public String regresarservicio (){ 
    return servicio;
    } 
    public void cambiarservicio(String servicio){
    this.servicio=servicio;  
    }
    
    
    
    
    public int regresarempleados (){
    return EMPLEADOS;
    } 
     public void cambiarempleados(int EMPLEADOS){
        this.EMPLEADOS=EMPLEADOS;
    }
    
    
}
