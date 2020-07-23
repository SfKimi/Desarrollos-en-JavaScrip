/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author Chokolate
 */
public class Triangulo {

    protected float ANGULOA, ANGULOB, ANGULOC;
    protected float LADOA, LADOB, LADOC;
    protected float PERIMETRO, AREA;
    protected double ALTURAA, ALTURAB, ALTURAC;
    protected double s;
    double ANGULOT=ANGULOA+ANGULOB+ANGULOC;
    double LADOT=LADOB+LADOC;

    public static void main(String[] args) {

        Triangulo tr = new Triangulo();

        int opcion = 0;
        float valor = 0;
        String op = "";// esta variable esta para  haccer  el menu en el constructor en vez  de hacerlo en  otra clase

        while (opcion != 9) {
            //menu listo y esta  entrando en el switch case
            op = JOptionPane.showInputDialog("Seleccione Una Opcion: \n "
                    + "1 Modificar Triangulo \n"
                    + "2 Solo algunos Datos \n"
                    + "3 Datos del Triangulo \n"
                    + "4 salir \n");
            opcion = Integer.parseInt(op);
            switch (opcion) {
                case 1:

                    int opcion1 = 0;

                    String opc = "";// esta variable esta para  haccer  el menu en el constructor en vez  de hacerlo en  otra clase

                    while (opcion1 != 7) {
                        //menu listo y esta  kgb+entrando en el switch case
                        opc = JOptionPane.showInputDialog("Seleccione parte a modificar: \n "
                                + "1 Modificar LADO A \n"
                                + "2 MODIFICAR LADO B \n"
                                + "3 MODIFICAR LADO C \n"
                                + "4 MODIFICAR ANGULO A \n"
                                + "5 MODIFICAR ANGULO B \n"
                                + "6 MODIFICAR ANGULO C \n"
                                + "7 salir \n");
                        opcion1 = Integer.parseInt(opc);

                        switch (opcion1) {
                            case 1:

                                valor = Integer.parseInt(JOptionPane.showInputDialog("LADO A"));
                                tr.setLADOA(valor);

                                break;

                            case 2:

                                valor = Integer.parseInt(JOptionPane.showInputDialog("LADO B"));
                                //agragar con un iff la condiciones  del triangulo
                                //angulos 180 grados
                                //la suam de  dos lados  debe ser mayor  al restante
                                
                                tr.setLADOB(valor);

                                break;
                            case 3:

                                valor = Integer.parseInt(JOptionPane.showInputDialog("LADO C"));
                                tr.setLADOC(valor);

                                break;
                            case 4:

                                valor = Integer.parseInt(JOptionPane.showInputDialog("ANGULO A"));
                                tr.setANGULOA(valor);

                                break;
                            case 5:

                                valor = Integer.parseInt(JOptionPane.showInputDialog("ANGULO B"));
                                tr.setANGULOB(valor);

                                break;
                            case 6:

                                valor = Integer.parseInt(JOptionPane.showInputDialog("ANGULO C"));
                                tr.setANGULOC(valor);

                                break;
                            case 7:

                                break;

                        }
                    }
                    //double saldo=0;
                    //valor = consignar();//metodo consignar 
                    //saldo = saldo + valor;//por que  no se  inicializa saldo

                    //mensaje(5,0);//por que  aqui va 0 en vez de saldo
                    break;

                case 2:
                    
                    
                    int opcion2 = 0;

                    String opcc = "";// esta variable esta para  haccer  el menu en el constructor en vez  de hacerlo en  otra clase

                    while (opcion2 != 4) {
                        //menu listo y esta  entrando en el switch case
                        opcc = JOptionPane.showInputDialog("operaciones para completrar angulo: \n "
                                + "1 Posee tres lados \n"
                                + "2 posee dos lados y el angulo de lado faltante \n"
                                + "3 posee dos angulos y un lado de un angulo \n"
                                
                                + "4 SALIR \n"
                                );
                        opcion2 = Integer.parseInt(opcc);

                        switch (opcion2) {
                            case 1:
                                
                                tr.getANGULOA();
                                tr.getANGULOB();
                                tr.getANGULOC();
                                tr.s ();
                                //tr.AREAA();
                                tr.viewTriangulo();
                                 
                                //valor = Integer.parseInt(JOptionPane.showInputDialog("LADO A"));
                                //tr.setLADOA(valor);

                                break;

                            case 2:
                                tr.getLADOA();
                                tr.getANGULOB();
                                tr.getANGULOC();
                                tr.s ();
                                tr.viewTriangulo();

                                break;
                                
                            case 3:
                                tr.getLADOB();
                                tr.getLADOC();
                                tr.getANGULOC();
                                tr.s ();
                                tr.viewTriangulo();

                                break;
                            
                            
                            
                            case 4:
                               System.exit(0);

                                break;    
                                
                                
                                  default:// cualquier otra  opcion que  no este  en el menu

                                   break;
                        }
                    }
                    
                    
                    

                    break;

                case 3://mostrar  saldo que lo hago en un mensaje directamente,se  muestra el   interes  y el total que  se  tiene  en la  cuenta
                               
                   
                     tr.viewTriangulo();
                    
                    break;

                case 4:// salir
                    System.exit(0);
                    break;

                default:// cualquier otra  opcion que  no este  en el menu

                    break;

            }
        }

        //tr.setANGULOA(opcion);
        //tr.Triangulo();
        //tr.viewTriangulo();
        //tr.setLADOA(80);
        //tr.viewTriangulo();
        //Triangulo tr.setLADOA();
    }

    //oki= new Triangulo(60,25,2);
    public void Triangulo() {

        ANGULOA = 60;
        ANGULOB = 60;
        ANGULOC = 60;
        LADOA = 5;
        LADOB = 5;
        LADOC = 5;

    }

    //public void Triangulo(float ANGULOX, float LADOX, float LADOY) {

        //ANGULOX = ANGULOA;
        //LADOX = LADOC;
       // LADOY = LADOB;
//
       // LADOA = (float) sqrt(LADOC);//ley de  cosenos

    //}

    public void viewTriangulo() {
        
        if(ANGULOT==180 && LADOT>LADOA){
         System.out.println("Lado A es: " + this.LADOA);
        System.out.println("Lado B es: " + this.LADOB);
        System.out.println("Lado C es: " + this.LADOC);
        System.out.println("Ángulo A es: " + getANGULOA());
        System.out.println("Ángulo B es: " + this.ANGULOB);
        System.out.println("Ángulo C es: " + this.ANGULOC);
        System.out.println("Perimetro es: " + this.PERIMETRO());
          System.out.println("ALTURA A es: " + this.ALTURAA());
        System.out.println("ÁLTURA B es: " + this.ALTURAB());
        System.out.println("ÁLTURA C es: " + this.ALTURAC());
        System.out.println("ÁREA-A es: " + this.AREAA());
        System.out.println("ÁREA-B es: " + this.AREAB());
        System.out.println("ÁREA-C es: " + this.AREAC());
      
        System.out.println("S es: " + this.s());
        
        }else{
            System.out.println("Alguno de los  datos  ingresados  es  invalido, RECUERDE \n"+"La sumatoria de los angulos internos debe  correspor a 180\n"+"La suma de dos lados debe ser mayor al tercer lado");
        System.out.println("Lado A es: " + this.LADOA);
        System.out.println("Lado B es: " + this.LADOB);
        System.out.println("Lado C es: " + this.LADOC);
        System.out.println("Ángulo A es: " + getANGULOA());
        System.out.println("Ángulo B es: " + this.ANGULOB);
        System.out.println("Ángulo C es: " + this.ANGULOC);
        System.out.println("Perimetro es: " + this.PERIMETRO());
          System.out.println("ALTURA A es: " + this.ALTURAA());
        System.out.println("ÁLTURA B es: " + this.ALTURAB());
        System.out.println("ÁLTURA C es: " + this.ALTURAC());
        System.out.println("ÁREA-A es: " + this.AREAA());
        System.out.println("ÁREA-B es: " + this.AREAB());
        System.out.println("ÁREA-C es: " + this.AREAC());
      
        System.out.println("S es: " + this.s());
        }
    }

    public void setLADOA(float LADOA) {

        this.LADOA = LADOA;
        

    }

    public void setLADOB(float LADOB) {

        this.LADOB = LADOB;

    }

    public void setLADOC(float LADOC) {

        this.LADOC = LADOC;

    }

    public void setANGULOA(float ANGULOA) {

        this.ANGULOA = ANGULOA;

    }

    public void setANGULOB(float ANGULOB) {

        this.ANGULOB = ANGULOB;

    }

    public void setANGULOC(float ANGULOC) {

        this.ANGULOC = ANGULOC;

    }

    public float getANGULOA() {

        ANGULOA = (float) Math.toDegrees(Math.acos(((Math.pow(LADOA, 2)) - (Math.pow(LADOB, 2)) - (Math.pow(LADOC, 2)))/ (-2 * (LADOB) * (LADOC))));
       
        return ANGULOA;

    }

    float getANGULOB() {

        ANGULOB = (float) Math.toDegrees(Math.acos(((Math.pow(LADOA, 2)) - (Math.pow(LADOB, 2)) - (Math.pow(LADOC, 2))) / (-2 * (LADOA) * (LADOC))));

        return ANGULOB;

    }

    float getANGULOC() {
        
         ANGULOC = (float) Math.toDegrees(Math.acos(((Math.pow(LADOA, 2)) - (Math.pow(LADOB, 2)) - (Math.pow(LADOC, 2))) / (-2 * (LADOA) * (LADOB))));

        return ANGULOC;

    }

    float getLADOA() {
        
        
     LADOA= (float) sqrt(Math.pow(LADOB, 2)+Math.pow(LADOC, 2)-(2*LADOB*LADOC*(Math.cos(ANGULOA))));
     
        
       

        return LADOA;

    }

    float getLADOB() {
        
           LADOB=(float)   (LADOA*(Math.sin(ANGULOB))/(Math.sin(ANGULOA)));

        return LADOB;

    }

    float getLADOC() {
        
           LADOC= (float) sqrt(Math.pow(LADOB, 2)+Math.pow(LADOA, 2)-(2*LADOB*LADOA*(Math.cos(ANGULOA+ANGULOB-180))));

        return LADOC;

    }

    public float PERIMETRO() {

        PERIMETRO = LADOA + LADOB + LADOC;

        return PERIMETRO;
    }

    public float AREAA() {

        AREA = (float) ((LADOA * ALTURAA) / 2);

        return AREA;
    }

    public float AREAB() {

        AREA = (float) ((LADOB * ALTURAB) / 2);

        return AREA;
    }

    public float AREAC() {

        AREA = (float) ((LADOC * ALTURAC) / 2);

        return AREA;
    }

    public double ALTURAA() {

        ALTURAA = (2 / LADOA) * Math.sqrt((s * (s - LADOA) * (s - LADOC) * (s - LADOB)));

        return ALTURAA;
    }

    public double ALTURAB() {

        ALTURAB = (2 / LADOB) * Math.sqrt((s * (s - LADOA) * (s - LADOC) * (s - LADOB)));
        //(2/LADOA)*
        return ALTURAB;
    }

    public double ALTURAC() {

        ALTURAC = (2 / LADOC) * Math.sqrt((s * (s - LADOA) * (s - LADOC) * (s - LADOB)));
        //(2/LADOA)*
        return ALTURAC;
    }

    public float s() {

        s = (LADOA + LADOB + LADOC) / 2;
        this.s = s;

        return (float) s;
    }

}
