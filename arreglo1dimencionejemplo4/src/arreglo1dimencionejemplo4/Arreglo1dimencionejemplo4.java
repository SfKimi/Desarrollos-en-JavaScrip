/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo1dimencionejemplo4;

import java.util.Scanner;

public class Arreglo1dimencionejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int meses = 12;
        String mes = "";

        double[] venta = new double[meses];
        double max = 0, min = 9000, res = 0, suma = 0;
        Scanner num = new Scanner(System.in);

        for (int k = 0; k < meses; k++) {
            switch (k) {
                case 0:
                    mes = "Enero";
                    break;
                case 1:
                    mes = "Febrero";
                    break;
                case 2:
                    mes = "Marzo";
                    break;
                case 3:
                    mes = "Abril";
                    break;
                case 4:
                    mes = "Mayo";
                    break;
                case 5:
                    mes = "Junio";
                    break;
                case 6:
                    mes = "Julio";
                    break;
                case 7:
                    mes = "Agosto";
                    break;
                case 8:
                    mes = "Septiembre";
                    break;
                case 9:
                    mes = "Octubre";
                    break;
                case 10:
                    mes = "Noviembre";
                    break;
                case 11:
                    mes = "Diciembre";
                    break;

            }

            System.out.println("ingrese la venta  del mes de: " + mes + ":");
            venta[k] = num.nextDouble();

        }

        for (int i = 0; i < meses; i++) {

            if (venta[i] > max) {

                max = venta[i];

            } else if (venta[i] < min) {

                min = venta[i];

            }

            suma = suma + venta[i];
        }

        res = max - min;

        System.out.println("la  venta mayor  ss e dio en el mes de : " + mes + "con el monto de :" + max);
        System.out.println("las ventas  maximas  acendieron en : " + res);
        System.out.println("el total de   ventas en la  empresa es de : " + suma);
        System.out.println("el promedio de las  ventas es : " + suma / 12);

    }

}
