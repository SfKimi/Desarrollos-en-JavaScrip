
package trianguloarq;


public class Ejecutora {

   
    public static void main(String[] args) {
      TrianguloFactoryMethod factory = new TrianguloFactory();
        Triangulo triangulo = factory.createTriangulo(5, 3, 7);
        System.out.println(triangulo.getDescripcion());
        System.out.println("Perimetro = "+triangulo.getPerimetro());
        triangulo.dibujate();
    }
    
}
