/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinacion;

import java.util.Scanner;
/**
 *
 * @author Chokolate
 */
public class Combinacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nNumN,nNumP, nCom;
        
        Scanner entrada = new Scanner (System.in);
        
       System.out.println("escriba n: ");
            nNumN = entrada.nextInt();
            
         System.out.println("escriba p: ");
            nNumP = entrada.nextInt();
            
            
            if(nNumN>nNumP){
            
            nCom=factorial(nNumN)/(factorial(nNumP)*(factorial(nNumN-nNumP)));
            
            System.out.println("   "+ nCom);
            
            }else{
            
            
            System.out.println("ERROR ");
            
            }
                
        
        
        
        
        
        
        
        
    }
    
    

public static int factorial(int nNum){
int nRes=1;
for(;nNum>1;nNum--){

nRes=nRes*nNum;

}


return nRes;
};

    
}
