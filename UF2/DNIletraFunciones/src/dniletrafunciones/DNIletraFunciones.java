/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dniletrafunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DNIletraFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce DNI");
        int dni = teclado.nextInt();
        char letra = DNI(dni);
        System.out.println("La letra del dni es " + letra);
    }
    public static char DNI(int dni) {
        Scanner teclado = new Scanner(System.in);
        int dniDivision = dni % 23;
        char letra = 0;
        if (dniDivision == 0) {
            letra = 'T';

        } else if (dniDivision == 6) {
            letra = 'Y';
        }else if (dniDivision==18){
            letra='H';
        }
        return letra;
    }
}
