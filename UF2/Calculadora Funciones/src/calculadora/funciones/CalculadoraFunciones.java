/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CalculadoraFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        double resultado = 0; //operacion 
        int opcion;
        valor1 = numeroPositivo();
        System.out.println("Pon el segundo valor");
        valor2 = sc.nextInt();
        mostrarMenu();
        opcion = validarOpcion();
        
        if (opcion == 1) {
            resultado = Calcularsuma(valor1, valor2);
        } else if (opcion == 2) {
            resultado = Calcularresta(valor1, valor2);
        } else if (opcion == 3) {
            resultado = Calcularmulti(valor1, valor2);
        } else if (opcion == 4) {
            resultado = Calculardivi(valor1, valor2);
        }

        System.out.println("El resultado de la operación elegida es " + resultado);

    }

    /**
     *
     * @param valor1
     * @param valor2
     * @return
     */
    public static int Calcularsuma(int valor1, int valor2) {
        int suma = valor1 + valor2;
        return suma;
    }

    /**
     *
     * @param valor1
     * @param valor2
     * @return
     */
    public static int Calcularresta(int valor1, int valor2) {
        int resta = valor1 - valor2;
        return resta;
    }

    /**
     *
     * @param valor1
     * @param valor2
     * @return
     */
    public static double Calculardivi(int valor1, int valor2) {
        double divi = (double) valor1 / valor2;
        return divi;
    }

    /**
     *
     * @param valor1
     * @param valor2
     * @return
     */
    public static int Calcularmulti(int valor1, int valor2) {
        int multi = valor1 * valor2;
        return multi;
    }

    /**
     * Muestra el menu de calculadora
     */
    public static void mostrarMenu() {
        System.out.println("1.- Calcular suma");
        System.out.println("2.- Calcular resta");
        System.out.println("3.- Calcular multiplicación");
        System.out.println("4.- Calcular división");
        System.out.print("Pon opcion");
    }

    /**
     * Pedir numero del 1 al 4 Si no te lo volverá a pedir
     *
     * @return
     */
    public static int validarOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Pon opcion menu (1-4)");
            opcion = sc.nextInt();
            System.out.println("Opcion incorrecta TT");
            System.out.println("....................");
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }
    /**
     * Devuelve numero solo cuando es negativo
     * @return 
     */
    public static int numeroPositivo(){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Pon el primer valor"); 
             num = sc.nextInt();
            System.out.println("Opcion incorrecta TT");
            System.out.println("....................");
            
        }while(num<=0);
        return num;
    }
}
