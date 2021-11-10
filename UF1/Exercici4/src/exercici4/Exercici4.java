/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

/**
 *
 * @author alumne
 */import java.util.Scanner;

public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int x,y;
     int suma,resta,multi,divi;
      Scanner teclado = new Scanner(System.in);
       
        System.out.println("suma, resta, multiplica i dividex x i y");
        
        x=teclado.nextInt();
        y=teclado.nextInt();
       suma= x+y;
        resta = x-y;
          System.out.println("la resta es "+ resta);
          System.out.println("la suma es "+ suma);
          System.out.println("la resta es "+ multi);
          System.out.println("la resta es "+ divi);
         
    }
    
}
