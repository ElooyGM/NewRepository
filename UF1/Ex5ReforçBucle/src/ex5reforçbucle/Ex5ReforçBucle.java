/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5reforçbucle;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex5ReforçBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont;
        System.out.println("Elige la tabla del 1 al 10 ");
        int tabla = teclado.nextInt();
        for (tabla = 1; tabla <= 10; tabla++) {

            for (cont = 1; cont <= 10; cont++) {
                System.out.println(tabla + "*" + cont + "=" + (tabla * cont));
            }
        }
    }

}
