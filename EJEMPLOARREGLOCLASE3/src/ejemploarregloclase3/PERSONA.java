
package ejemploarregloclase3;


public class PERSONA {
    
    private String nombre;
    private String piel;
    private int edad;
    private double estatura;
    
    public PERSONA (){
    nombre= "";
    piel= "";
    edad =0;
    estatura=0;
    }
    
    public PERSONA (String nombre,String piel,int edad,double estatura){
     this.nombre=nombre;
     this.piel=piel;
     this.edad=edad;
     this.estatura=estatura;
    }
    
    public void modificarnombre(String nombre){
    this.nombre=nombre;
    }
    
    public String odtenernombre(){
    return nombre;
    }
    
    public void modificarpiel(String piel){
    this.piel=piel;
    }
    
    public String odtenerpiel(){
    return piel;
    }
    
    public void modificaredad(int edad){
    this.edad=edad;
    }
    
    public int odteneredad(){
    return edad;
    }
    
    
     public void modificarestatura(double estatura){
    this.estatura=estatura;
    }
    
    public double odtenerestatura(){
    return estatura;
    }
    
}
