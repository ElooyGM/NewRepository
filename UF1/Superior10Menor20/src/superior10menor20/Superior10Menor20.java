/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superior10menor20;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Superior10Menor20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int cont1020=0;
        int num;
        int suma=0;
        do {
            System.out.println("Fica un numero");

            num = teclado.nextInt();
            if (num >= 10 && num <= 20) {
                suma=num+suma;
                cont++;
                cont1020++;
            } else {
                System.out.println("segueix");
                cont++;
            }
        } while (cont1020<3);
        System.out.println("Has introducido " + cont + " numeros ");
        System.out.println("La suma de los tres numeros es " + suma);
        
        
    }

}
