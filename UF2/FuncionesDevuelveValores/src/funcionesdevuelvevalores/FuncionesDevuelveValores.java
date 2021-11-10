/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesdevuelvevalores;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FuncionesDevuelveValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un valor y lo doblaré por 2, luego el resultado lo multiplicaré");
        int numero = sc.nextInt();
        int ValorDoble = doblarNumero(numero);
        System.out.println("numero " + numero + " ValorDoble " + ValorDoble);
        int ValorTriple = triplicarNumero(ValorDoble);
        System.out.println("numero " + ValorDoble + " ValorTriple " + ValorTriple);
        System.out.println("El resultado es " + numero);
    }

    /**
     *
     * @param valor
     * @return
     */
    public static int doblarNumero(int valor) {
        int doble = valor * 2;
        return doble;

    }
/**
 * 
 * @param valor
 * @return 
 */
    public static int triplicarNumero(int valor) {
        int triple = valor * 3;
        return triple;
    }
}
