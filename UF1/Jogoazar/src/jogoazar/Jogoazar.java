/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogoazar;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Jogoazar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int numAleatorio = r.nextInt(10)+21;
        System.out.println("numero generado es el " + numAleatorio);
        numAleatorio = r.nextInt(21)+20;
        System.out.println("numero generado es el " + numAleatorio);
         numAleatorio = r.nextInt(10)+150; //del 150 al 159
        System.out.println("numero generado es el " + numAleatorio);
        
        
    }
}
