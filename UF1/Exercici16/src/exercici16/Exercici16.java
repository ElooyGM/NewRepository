/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici16;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Las notas de classe
        double nota;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Mostrar calificación del examen: ");
        nota = teclado.nextDouble();

        if (nota >= 0 && nota < 3) {
            System.out.println("La nota es muy deficiente ");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("La nota es insuficiente");
        }
        else if (nota >= 5 && nota < 6){
            System.out.println("La nota es un bien");
        }
        else if (nota >= 6 && nota < 9){
            System.out.println("La nota es notable");
        }
        else if (nota >= 9 && nota <= 10){
            System.out.println("La nota es excelente");
        }
        else {
            System.out.println("ERROR, solo se admiten numeros del 0 al 10");
        }
    } 

}
