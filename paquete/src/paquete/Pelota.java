/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Chokolate
 */
public class Pelota {
    
    
    float base;
    
            float alto;
                    
                    public Pelota(){
                    
                    alto=100;
                    base= 250;
                    
                        
                    }
    
                    
                    public Pelota(float alto,float base){
                    
                    this.alto=alto;
                            this.base=base;
                    
                    
                    }
    
                    
    
                    public float obtenerbase(){
                    
                    return base;
                    }
                    
                    public float obteneralto(){
                    
                    return alto;
                    }
                    
                    
                    public void area(){
                    
        float area = alto*base;
                    System.out.println("area es"+ area);
                    
                    }
                    
                    
                    
                     public void Perimetro(){
        float perimetro = 2*base+2*alto;
                    
                    System.out.println("perimetro es"+ perimetro);
                    
                    }
                     
                     
                    
    
    
}




//class para clase
//new para objeto

