/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superficiecasa;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SuperficieCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int Metroscuadradoshabitación = 0;

        int suma = 0;

        char respuesta;

        boolean finalbucle = true;
        do {
            System.out.println("Hay mas habitaciones?(s) si  (n) no");
            respuesta = teclado.nextLine().charAt(0);
            if (respuesta == 's' || respuesta == 'S') {
                System.out.println("Cuantos metros cuadrados tiene?");
                Metroscuadradoshabitación = teclado.nextInt();
                teclado.nextLine();
                suma = Metroscuadradoshabitación + suma;
                finalbucle = false;
            } else if (respuesta == 'n' || respuesta == 'N') {
                System.out.println("No hay mas FIN");
                finalbucle = true;
            }
        } while (!finalbucle);
        System.out.println("La suma total de superficie es " + suma);

    }

}
