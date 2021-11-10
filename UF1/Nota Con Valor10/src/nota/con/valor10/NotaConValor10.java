/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nota.con.valor10;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NotaConValor10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, notamedia, sumanota=0;
        int nota = 0;
        int contaNotas = 0;
        boolean hubo10 = false;

        do {
            System.out.println("Pedir numero");
            nota = teclado.nextInt();
            if (nota >= 0 && nota <= 10) {
                if (nota == 10) {
                    hubo10 = true;
                } else {
                    hubo10 = false;
                }
            } else {
                System.out.println("Los numeros deben estar entre 0 y 10");
            }
            contaNotas++;
        } while (nota != -1);
        contaNotas = contaNotas - 1;
        if (hubo10 == true) {
            sumanota= sumanota+nota;
            System.out.println("Hay un 10");
        } else {
            System.out.println("No hay 10");
            
        }
       System.out.println("Has puesto" + contaNotas + "notas"); 
        notamedia= sumanota/contaNotas;
       System.out.print("La nota media es: " + notamedia);
    }

}
