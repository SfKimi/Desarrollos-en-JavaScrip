
package trianguloarq;

public abstract class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC){
        setLadoA(ladoA);
        setLadoB(ladoB);
        setLadoC(ladoC);
    }
    public void setLadoA(int ladoA){
        this.ladoA = ladoA;
    }
    public void setLadoB(int ladoB){
        this.ladoB = ladoB;
    }
    public void setLadoC(int ladoC){
        this.ladoC = ladoC;
    }    
    public int getLadoA(){
        return ladoA;
    } 
    public int getLadoB(){
        return ladoB;
    }        
    public int getLadoC(){
        return ladoC;
    }        
    public abstract String getDescripcion();
    public abstract double getPerimetro();
    public abstract void dibujate();
}


