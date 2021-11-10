/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mostrar numeros
       System.out.println("Mostrar los dos numeros");
       int num1,num2;
        Scanner teclado=new Scanner (System.in);
        num1=teclado.nextInt();
        num2=teclado.nextInt();
     if (num1<num2)
             {
                 System.out.println("Numero 2 es mas grande->" + num2);
             }
     else
     {
         System.out.println("Numero 1 es más grande->" + num1);
     }
    }
    
}
