/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package azarexercici1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AzarExercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner teclado = new Scanner(System.in);
        int numMaquina = r.nextInt(50) + 1;
        int num = teclado.nextInt();
        System.out.println("numero generado es el " + numMaquina);
        System.out.println("numero pensado es " + num);
        do {
            if (num<numMaquina) {
                System.out.println("Este numero es menor");
            }else{
                
            }
                
            

        } while (numMaquina != numMaquina);

    }

}
