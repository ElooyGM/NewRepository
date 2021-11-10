/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundofunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class HolaMundoFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        HolaMundoFunciones();
        String nombre = "Eloy Gonzalez";
        HolaMundoFuncionesNombre(nombre);
        int valor = 5;
        System.out.println("valor no clonado antes de la función " + valor);
        aumentaendos(valor);
        System.out.println("valor no clonado antes de la función " + valor);

    }

    /**
     * Función que muestra por pantalla Hello World void no devuelve ningún
     * valor al mail
     */
    public static void HolaMundoFunciones() {
        System.out.println("Hello World in functions");
    }//Helloworld

    /**
     * Escribe Hello world
     *
     * @param nom Variable nombre
     */
    public static void HolaMundoFuncionesNombre(String nom) {
        System.out.println("Hello World " + nom + " How are you? ");
    }

    /**
     * aumenta valor q te pasan en dos
     *
     * @param valor numero q me pasan des de el main
     */
    private static void aumentaendos(int valor) {
        valor = valor + 2;
        System.out.println("valor clonado antes de la función " + valor);
    }
}
