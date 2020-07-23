
package edificio;


public class CASA extends EDIFICIO {
    
    String ESTADO;
    int ESTRATO;
    String MATERIALDEPISO;
    
    public CASA(){
    
        this.NOMBRE="CASA";
        this.ESTADO="en obra  gris";
         this.ESTRATO =2;
         this.MATERIALDEPISO="alfombra";
         
    }
    
     public CASA(String NOMBRE){
    
        this.NOMBRE=NOMBRE;
        this.ESTADO="en obra  gris";
         this.ESTRATO =2;
         this.MATERIALDEPISO="alfombra";
         
    }
    
    
    
     
    public String regresarmaterialdepiso (){
    
        
        
    return MATERIALDEPISO ;
    } 
    
     public void cambiarmaterialdepiso(String MATERIALDEPISO){
    
        this.MATERIALDEPISO=MATERIALDEPISO;
        
    }
    
    
    
    
    
    
    
    
    public int regresarestrato (){
    
        
        
    return ESTRATO ;
    } 
    
     public void cambiarestrato(int ESTRATO){
    
        this.ESTRATO=ESTRATO;
        
    }
    
    
     
    
    
    public String regresarestado (){
    
        
        
    return ESTADO ;
    } 
        
        
 
    
    public void cambiarestado(String ESTADO){
    
        this.ESTADO=ESTADO;
        
    }
    
    
}
