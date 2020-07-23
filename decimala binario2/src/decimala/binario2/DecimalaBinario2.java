/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimala.binario2;

import java.util.Scanner;

/**
 *
 * @author Chokolate
 */
public class DecimalaBinario2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //int nDiv;
int nRes;
        int nCon;
        int nNumDec;
        int nDiv = 0;
        int nNumEnt[];
        nNumEnt = new int[8];

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Decimal: ");
        nNumDec = leer.nextInt();

        for (nCon = 0; nDiv != 1; nCon++) {
            nDiv = nNumDec / 2;
            nRes = nNumDec % 2;
            nNumEnt[nCon] = nRes;
            nNumDec = nDiv;
        }
        nNumEnt[nCon] = nNumDec;
        for (; nCon >= 0; nCon--) {
            System.out.println(nNumEnt[nCon]);
        }
    }

}
