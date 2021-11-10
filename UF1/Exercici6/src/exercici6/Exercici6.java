/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;

/**
 *
 * @author alumne
 */import java.util.Scanner;
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double PrecioArt,PrecioVenta;
        System.out.println("Pon el PrecioArt");
           PrecioArt= teclado.nextDouble();  
         System.out.println("PrecioArt es" +PrecioArt);  
         System.out.println("Pon precio que has comprado"); 
         PrecioVenta= teclado.nextDouble();
           System.out.println("PrecioVenta es" +PrecioVenta);
           //Calculos
           double descuento = ((PrecioArticulo-precioventa)*100)/PrecioArticulo;
           
           
    }
    
}
