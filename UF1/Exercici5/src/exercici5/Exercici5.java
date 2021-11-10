/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5;

/**
 *
 * @author alumne
 */import java.util.Scanner;
public class Exercici5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double radio,pi;
        double Longitud,Area,Volumen;
        System.out.println("Pon el radio del circulo");
        radio= teclado.nextDouble();
        System.out.println("radio es" +radio);
        pi=3.1416;
        System.out.println("pi es" +pi);
        //calculos
        Longitud= 2*pi*radio;
        Area= pi*radio*radio;
        Volumen= (4/3)*pi*radio*radio*radio;
        //Mostrar usuario
        System.out.println("Longitud es" +Longitud);
        System.out.println("Volumen es" +Volumen);
        System.out.println("Area es" +Area);
    }
    
}
