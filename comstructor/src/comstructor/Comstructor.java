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
public class Comstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        PizzaBuilder hawai_pizzabuilder =new HawaiPizzaBuilder();
        PizzaBuilder picante_pizzabuilder =new PicantePizzaBuilder();
        
        cocina.setPizzaBuilder(hawai_pizzabuilder);
        cocina.construirPizza();
        
        Pizza pizza = cocina.getPizza();
        // metodo mostrar es para identificar que  esta  funcionando y que  este  creando una  pizza  como hawai pizza builder
        pizza.mostrar();
    }
    
}
