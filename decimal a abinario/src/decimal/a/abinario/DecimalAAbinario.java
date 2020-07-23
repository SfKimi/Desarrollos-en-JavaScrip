/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal.a.abinario;

import java.util.Scanner;

/**
 *
 * @author Chokolate
 */
public class DecimalAAbinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese Decimal: ");
        long decimal=leer.nextLong();//me lee el decimal
        long aux=decimal;//creo una  variable extra  para  no modificar el  decimal inicial que  proporciono el ususario
        String binario="";//defino  binario
        
        
        while (aux>0){//trabajo con  aux  para no modificar la  variable DECIMAL
        
            binario=aux%2 + binario;//se hace la  divicion  entre  2   y me  quedo con el residuo, como esta   definido como string 
                                    //la variable binario me  va  guardando datos  sin generar una lista 
            
            aux=aux/2;//actualizo aux  que en otras palabras  es   decimal  para cuando se vuelva  ajecutar la divicion el valor 
                      //este cambiado
        
        
        }
        
        System.out.println("Numero Decimal"+ decimal+" Numero Binario "+binario);
        
        
    }
    
}

//int nDiv;
//int nRes;
//int nCon
//int nNumDec;
// int nNumEnt [];
// nNumENT = new int[8];





//for(ncon=0;nDiv!=1;ncon++){
//ndiv=nNumDec/2;
//nRes=nNumDec%2;
//nNumEnt[nCon]=nRes;
//nNumDec=nDiv;
//}
//nNumEnt[ncon]=nNumDec;
//for (;ncon <=0;ncon--){
//System.out.print(nNumEnt[ncon]);
//}