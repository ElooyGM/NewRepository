/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ordenar numeros de forma ascendente
       
       int num1, num2;
        System.out.println("Mostrar numeros");
       Scanner teclado=new Scanner (System.in);
        num1= teclado.nextInt();
        num2= teclado.nextInt();
        
        if (num1<num2)
              {
                  System.out.println("Mostrar el primer numero: " + num1); 
                  System.out.println("Mostrar el segundo numero: " + num2);  
              }
       else
              {
                 System.out.println("Mostrar el primer numero: " + num2); 
                  System.out.println("Mostrar el segundo numero: " + num1);      
                      }
    }
    
}
