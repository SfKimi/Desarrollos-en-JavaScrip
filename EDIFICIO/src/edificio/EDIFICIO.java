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
public class EDIFICIO {

  double AREA;
    int PISOS;
    
    double ANCHO;
    double LARGO;
    int BAÑOS;
    String NOMBRE;
    boolean COMPRADA=false;
    
   
    public EDIFICIO(){
       
        
        this.AREA=1.90;
                this.ANCHO=4;
                        this.LARGO=9;
                                this.NOMBRE="jfny";
                                        this.PISOS=4;
                                                this.BAÑOS= 1;
    
    }
    
     public EDIFICIO(String NOMBRE){
       
        
        this.AREA=1.90;
                this.ANCHO=4;
                        this.LARGO=9;
                                this.NOMBRE=NOMBRE;
                                        this.PISOS=4;
                                                this.BAÑOS= 1;
    
    }
    
      public void comprar (){
    
        
        this.COMPRADA=true;
         System.out.println("Esta comprada");
         
    
    }
    
     public void vender (){
    
        
        this.COMPRADA=false;
         System.out.println("disponible para la  venta");
         
    
    }
     
     
     
       public void estado (){
    
        
       if(this.COMPRADA== true)
           System.out.println("Esta comprada");
       else
         System.out.println("disponible para la  venta");
    
    }
       
       
       
       
       public double obtenerarea() 
    {
    return ANCHO*LARGO;
   }  
       
       
       
       
       
      public void cambiarancho(double ANCHO){
    this.ANCHO=ANCHO;  
    }   
       public double obtenerancho() 
    {
    return this.ANCHO;
   }  
       
       
       
       public void cambiarlargo(double LARGO){
    this.LARGO=LARGO;  
    }  
       public double obtenerlargo() 
    {
    return this.LARGO;
   }  
       
       
       
        public void cambiarpisos(int PISOS){
        this.PISOS=PISOS;
    }
       public int obtenerpisos() 
    {
    return this.PISOS;
   }  
       
       
       
       public void cambiarbaños(int BAÑOS){
        this.BAÑOS=BAÑOS;
    }
       public int obtenerbaños() 
    {
    return this.BAÑOS;
   }  
       
       
       
     public void cambiarnombre(String NOMBRE){
    this.NOMBRE=NOMBRE;  
    }   
    public String obtenernombre() 
    {
    return this.NOMBRE;
   }  
    
    
    
    
}
