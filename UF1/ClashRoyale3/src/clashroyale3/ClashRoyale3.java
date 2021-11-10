/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ClashRoyale3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int copas;
        char opcion;
        System.out.print("Mostrar numero de copas: ");
        copas = teclado.nextInt();

        if (copas < 2000) {
            System.out.print("Mostrar opción: ");
            teclado.nextLine();
            opcion = teclado.nextLine().charAt(0);
            System.out.println("Elegir entre mago electrico y megaesbirro");
            if (opcion == 'e') {
                System.out.println("Mostrar mega esbirro");
            } else if (opcion == 'm') {
                System.out.println("Mostrar mago electrico");
            } else {
                System.out.println("ERROR");
            }

        }
        if (copas > 2000) {
            System.out.print("Mostrar opción: ");
            teclado.nextLine();
            opcion = teclado.nextLine().charAt(0);
            System.out.println("Elegir entre caballero y bandida");
            if (opcion == 'c') {
                System.out.println("Elegir caballero");
            } else if (opcion == 'b') {
                System.out.println("Elegir bandida");
            } else {
                System.out.println("ERROR");
            }

        }

    }
}
