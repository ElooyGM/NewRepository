/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple2bucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exemple2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir número diferent de 0
        Scanner teclado = new Scanner(System.in);
        boolean finalBucle;
        int num, acumulandoSuma;
        do {
            System.out.print("Introduce número(pon + de 100 para terminar): ");
            num = teclado.nextInt();
            if (num > 0) {
                acumulandoSuma = acumulandoSuma + num;

            } else {
                finalBucle = true;
            }
        } while (!finalBucle);
        acumulandoSuma = num + acumulandoSuma;
        System.out.println("Sumar los numeros " + acumulandoSuma);

    }

}
