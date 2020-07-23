/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo1dimencionejemplo1;

/**
 *
 * @author Chokolate
 */
public class Arreglo1DIMENCIONEJEMPLO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
      
        int [] arreglo = new int [3];
        arreglo [0]=110;
        arreglo [1]=120;
        arreglo [2]=130;
        
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        
        
        
        String[] dias ={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo","Soranny"};
        System.out.println("El tamaño del arreglo es:"+dias.length); 
        System.out.println("Mi princesa es:"+dias[7]); 
        System.out.println("el ultimo dia  de la semana  es:"+dias[dias.length-2]); 
      
      
        
        
        int [] [] matriz = new int [2] [3];     
        
        matriz [0][0]=1;
        matriz [0][1]=2;
        matriz [0][2]=3;
        
         matriz [1][0]=4;
         matriz [1][1]=5;
         matriz [1][2]=6;
         
        System.out.println("el numero es:"+matriz[1][2]); 
         
        
    }
    
}
