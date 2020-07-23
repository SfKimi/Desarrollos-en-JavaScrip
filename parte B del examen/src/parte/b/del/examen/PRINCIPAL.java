/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte.b.del.examen;

/**
 *f
 * @author Chokolate
 */
public class PRINCIPAL {
    
    public static void main(String[] args) {
        
        
        
     claseA clA =new claseA();
     CLASEB clB=new CLASEB();
     CLASEC clC=new CLASEC();
     
     System.out.printf("la variable 1 es: %d\n", clA.regresarvar1() );
    clA.regresarvar1();
    System.out.printf("la variable 2 es: %d\n", clA.regresarvar2() );
    clA.regresarvar2();
    System.out.printf("la variable 3 es: %d\n",  clB.regresarvar3() );
    clB.regresarvar3();
     System.out.printf("la variable 4 es: %d\n",  clC.regresarvar4() );
    clC.regresarvar4();
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    System.out.printf("la suma  entre variable 1 y variable 2: %d\n",  clA.suma() );
    clA.suma();
    System.out.printf("la variable 3 es: %d\n", clB.cuadrado() );
    clB.cuadrado();
    System.out.printf("la suma  entre variable 2 y variable 4: %d\n", clC.suma()  );
    clC.suma();
    
}
    
    
    
    
    
}
