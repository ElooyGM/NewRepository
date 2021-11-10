/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Clashroyale2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int copas, num;
        System.out.print("Mostrar numero de copas: ");
        copas = teclado.nextInt();
        System.out.print("Mostrar opción: ");
        num = teclado.nextInt();

        if (copas < 2000) {
            System.out.println("Elegir entre mago electrico y megaesbirro");
            if (num == 0) {
                System.out.println("Mostrar mega esbirro");
            } else if (num == 1) {
                System.out.println("Mostrar mago electrico");
            } else {
                System.out.println("ERROR");
            }

        }
        if (copas > 2000) {
            System.out.println("Elegir entre caballero y bandida");
            if (num == 0) {
                System.out.println("Elegir caballero");
            } else if (num == 1) {
                System.out.println("Elegir bandida");
            } else {
                System.out.println("ERROR");
            }

        }

    }
}
