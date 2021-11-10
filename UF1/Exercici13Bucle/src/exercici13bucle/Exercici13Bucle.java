/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13bucle;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici13Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, cont, numadivina = 0, numpensado = 0;
        int minimo = 1;
        int maximo = 100;
        char respuesta, nummasmenos;

        do {
            numadivina = (minimo + maximo) / 2;
            System.out.println("El numero que piensas es este? " + numadivina);
            System.out.println("si(s) no(n)");

            respuesta = teclado.nextLine().charAt(0);
            if (respuesta == 'n' || respuesta == 'N') {
                System.out.println("Es mayor(m) o menor(f)? ");
                nummasmenos = teclado.nextLine().charAt(0);
                if (nummasmenos == 'm' || nummasmenos == 'M') {
                    minimo= numadivina;
                } else if (nummasmenos == 'f' || nummasmenos == 'F') {
                    maximo = numadivina;
                }
            }else if(respuesta=='s'|| respuesta=='S'){
                numpensado=numadivina;
            }

        } while (numpensado != numadivina);
        System.out.println("El numero adivinado es " + numadivina);

    }
}
