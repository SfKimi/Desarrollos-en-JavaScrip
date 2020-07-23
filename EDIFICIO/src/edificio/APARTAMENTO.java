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
public class APARTAMENTO extends EDIFICIO {
    
    int NUMEROHABITACIONES;
    String ZONA;
    double PRECIODERENTA;
    String NOMBREDEADMINISTRADOR;
    
       public APARTAMENTO(){
       this.NUMEROHABITACIONES=2;
        this.NOMBRE="APARTAMNTO";
        this.ZONA="RESTREPO";
         this.PRECIODERENTA = 200000;
         this.NOMBREDEADMINISTRADOR="DANIEL";
         
    }
    
       public APARTAMENTO(String NOMBRE){
     this.NUMEROHABITACIONES=2;
        this.NOMBRE=NOMBRE;
        this.ZONA="RESTREPO";
         this.PRECIODERENTA = 200000;
         this.NOMBREDEADMINISTRADOR="DANIEL";
         
    }
       
       
       
    public String regresarzona (){ 
    return ZONA;
    } 
    public void cambiarzona(String ZONA){
    this.ZONA=ZONA;  
    }
    
    
     public String regresarnombredeadministrador (){ 
    return NOMBREDEADMINISTRADOR;
    } 
    public void cambiarnombredeadministrador(String NOMBREDEADMINISTRADOR){
    this.NOMBREDEADMINISTRADOR=NOMBREDEADMINISTRADOR;  
    }
    
    
     public int regresarnumerohabitaciones (){
    return NUMEROHABITACIONES ;
    } 
     public void cambiarnumerohabitaciones(int NUMEROHABITACIONES){
        this.NUMEROHABITACIONES=NUMEROHABITACIONES;
    }
    
       
      public double regresarprecioderenta (){
    return PRECIODERENTA ;
    } 
     public void cambiarprecioderenta(double PRECIODERENTA){
        this.PRECIODERENTA=PRECIODERENTA;
    }  
       
    
    
}
