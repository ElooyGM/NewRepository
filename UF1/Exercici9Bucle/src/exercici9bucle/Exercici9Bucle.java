/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9bucle;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici9Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma10 = 0;
        int producto10 = 1;

        for (numero = 1; numero <= 10; numero++) {
            System.out.println("suma10" + "+" + "numero");
            suma10 = suma10 + numero;
            System.out.println("producto10" + "*" +numero);
            producto10 = numero * producto10;
            System.out.println("fin vuelta");
        }

        System.out.println("La suma total es " + suma10);
        System.out.println("El producto total es " + producto10);

    }

}
