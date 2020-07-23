/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Chokolate
 */
public class Carro {
    
    
    double peso;
    double altura;
    
    double ancho;
    double largo;
    int numeroPuertas;
    String modelo;
    boolean encendido=false;
    
    public Carro(){
       
        
        this.altura=1.90;
                this.ancho=4;
                        this.largo=9;
                                this.modelo="jfny";
                                        this.numeroPuertas=4;
                                                this.peso= 1000;
    
    }
    
    
    
    public double obtenerpeso() 
    {
    return this.peso;
   }
    
    
    
    public void encender (){
    
        
        this.encendido=true;
         System.out.println("El carro esta Encendido");
         
    
    }
     
    public void apagar (){
    
        
        this.encendido=false;
         System.out.println("El carro esta Apagado");
         
    
    }
    
    
    public void estado (){
    
        
       if(this.encendido== true)
           System.out.println("El carro esta Encendido");
       else
         System.out.println("El carro esta Apagado");
    
    }
    
    
    
    
}
