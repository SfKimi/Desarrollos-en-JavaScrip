    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comstructor;

/**
 *
 * @author Chokolate
 */
public abstract class PizzaBuilder {
    
    protected Pizza pizza;
    
    protected Pizza getPizza() {
    return pizza;
    }
    
    public void crearNuevaPizza(){
    pizza = new Pizza();
    }
    
    public abstract void buildMasa();
    public abstract void buildSalsa();
      public abstract void buildRelleno();
      
    
    
}
