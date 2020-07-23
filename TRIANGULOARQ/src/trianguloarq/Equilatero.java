package trianguloarq;
public class Equilatero extends Triangulo{
    public Equilatero(int ladoA, int ladoB, int ladoC){
        super(ladoA, ladoB, ladoC);
    }
    @Override
    public String getDescripcion(){
        return "Soy un Triangulo Equilatero";
    }
    @Override
    public double getPerimetro(){
        int a = super.getLadoA();
        int b = super.getLadoB();
        int c = super.getLadoC();
        double superf = a + b + c;
        return superf;
    }
    @Override
    public void dibujate(){
        System.out.println("Dibujo de un Equilatero");
    }
}
