/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

public class Pelota {
    
    
    float radio;
    
            float peso;
                    
                    public Pelota(){
                    
                    radio=100;
                    peso= 250;
                    
                        
                    }
    
                    
                    public Pelota(float radio,float peso){
                    
                    this.peso=peso;
                            this.radio=radio;
                    
                    
                    }
    
    
                    public float obtenerRadio(){
                    
                    return radio;
                    }
                    
                    public float obtenerPeso(){
                    
                    return peso;
                    }
                    
                    
                    public void patearPelota(){
                    
                    
                    System.out.println("Haz pateado la  pelota");
                    
                    }
                    
                    
                    
                     public void AtraparPelota(){
                    
                    
                    System.out.println("Haz atrapado la  pelota");
                    
                    }
                     
                     
                    
    
    
}
