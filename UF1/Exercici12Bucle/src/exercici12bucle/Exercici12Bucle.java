/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici12bucle;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici12Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A,B,cont,resultado=1;
        System.out.println("Introducir el número A");
        A=teclado.nextInt();
        System.out.println("Introducir el numero B");
        B=teclado.nextInt();
        
for(cont=1; B>=cont; cont++){
   resultado= resultado*A; 
    System.out.println("resultado " + resultado);
}
        System.out.println("El resultado es " + resultado);     
    }

}
