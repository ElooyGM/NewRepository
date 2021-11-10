/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor.de.bitcoin;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ConversorDeBitcoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cambio de monedas
        double euro, bitcoin, xmr, num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Mostrar monedas que tienes: ");
        System.out.println("Mostrar bitcoin: ");
        bitcoin = teclado.nextDouble();
        System.out.println("mostrar xmr: ");
        xmr = teclado.nextDouble();
        System.out.println("Menu de conversión "
                + "1 Bitcoins a euros "
                + "2 XMR a euros ");
        System.out.println("Escoger opción");
        num = teclado.nextDouble();
        
        if(num==1){
            System.out.println("cambiar de bitcoins a euros");
            euro= bitcoin*49561;
            System.out.println("Mostrar euros " +euro);
        }
        else if(num==2){
            System.out.println("cambiar de XMR a euros");
            euro= xmr*233.81;
            System.out.println("Mostrar euros " +euro);
        }
        else{
            System.out.println("ERROR");
        }
        
       
    }

}
