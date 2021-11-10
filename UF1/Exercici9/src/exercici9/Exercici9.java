/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Exercici9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer edad
        int edad;
        Scanner teclado = new Scanner (System.in);
        edad=teclado.nextInt();
       if (edad<18) 
        {
      
            System.out.println("eres menor de edad");
        }   
        else
        {
            System.out.println("eres mayor de edad");    
                }
        
    }
    
    
}
