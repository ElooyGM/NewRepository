/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package augmentsou;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Augmentsou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double sou_vinent, sou_actual;
        System.out.println("Mostrar sou actual");
        sou_actual = teclado.nextInt();

        if (sou_actual < 18000) {
            System.out.println("Haurà un increment del 12%");
            sou_vinent = sou_actual + (sou_actual * 12 / 100);
            System.out.println("El sou serà de " + sou_vinent);
        } else if (sou_actual >= 18000 && sou_actual < 30000) {
            System.out.println("Haurà un increment del 10%");
            sou_vinent = sou_actual + (sou_actual * 10 / 100);
            System.out.println("El sou serà de " + sou_vinent);
        }
        else if (sou_actual>=30000 && sou_actual<45000){
            System.out.println("Haurà un increment del 8%");
            sou_vinent=sou_actual+(sou_actual*8/100);
            System.out.println("El sou serà de " + sou_vinent);
        }
        else if (sou_actual>=45000){
            System.out.println("Haurà un increment del 6%");
            sou_vinent=sou_actual+(sou_actual*6/100);
            System.out.println("El sou serà de " + sou_vinent);
        }
    }

}
