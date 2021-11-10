/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici12;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Exercici12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Numero positivo y negativo
        double num;
        System.out.println("Mostrar numero");
        Scanner teclado=new Scanner (System.in);
        num=teclado.nextDouble();
        
        if (num>=0)
                {
                    System.out.println("Numero es positivo");
                }
        else
        {
            System.out.println("Numero es negativo");
        }
    }
    
}
