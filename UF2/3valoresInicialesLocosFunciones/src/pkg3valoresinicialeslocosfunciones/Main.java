/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3valoresinicialeslocosfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, elmaximo;
        System.out.println("Pon el valor 1");
        n1 = teclado.nextInt();
        System.out.println("Pon el valor 2");
        n2 = teclado.nextInt();
        System.out.println("Pon el valor 3");
        n3 = teclado.nextInt();

        elmaximo = Valores(n1, n2);
        elmaximo = Valores(n3, elmaximo);
        System.out.println("El valor más grande es el " + elmaximo);
    }

    public static int Valores(int n1, int n2) {
        if (n1 < n2) {
            return n2;
        } else {
          return n1;
        }
         

    }
    


}
