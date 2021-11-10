/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6bucle;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Exercici6bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner teclado= new Scanner(System.in);
   int num,cont;
        System.out.print("Mostrar numero: ");
        num=teclado.nextInt();
        boolean negativo=false;
        for(cont=1; cont<=10; cont++){
            System.out.println("Pon un numero");
            num=teclado.nextInt();
            if (num<0){
            negativo=true;
        } 
            
        }
        
        if(negativo==true){
            System.out.println("Has puesto un negativo");
        }
       
    }
    
}
