/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple.pkg1.bucle;

/**
 *
 * @author alumne
 */
public class Exemple1Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mi Primer Bucle 
        int cont;

        for (cont = 0; cont < 6; cont++) {
            System.out.println("numero" + cont);

        }
        //while
        cont = 0;
        while (cont <= 5) {
            System.out.println("numero" + cont);
            cont = cont + 1;
        }
        System.out.println("el do while");
        cont = 0;

    }
}
