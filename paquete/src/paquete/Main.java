/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;
import paquete.Pelota;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //OPCION  1  DE  DECLARAR UNODJETO//
        //Pelota p;
        
        //p= new Pelota();
        
        //OPCION 2  DE DECLARAR UN OBJETO//
        Pelota p= new Pelota();
        Pelota pa= new Pelota(300,300);
        Pelota pb= new Pelota(500,500);
        
        p.Perimetro();
        p.area();
      
        
        
        
        //float var = p.obtenerPeso();
        //System.out.println("la pelota pesa: "+var);

        
        
        
        //System.out.println("la pelota pesa: "+p.obtenerPeso());

        
        
        
        float var1 = pa.obtenerPeso();
        System.out.println("la pelota pesa: "+var1);
        
              float var2 = pb.obtenerPeso();
        System.out.println("la pelota pesa: "+var2);
        

    }
    
}
