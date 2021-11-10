/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegonuevo;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class JuegoNuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NewGame
        Scanner teclado=new Scanner (System.in);
        int opción;
        System.out.println("Mostrar opción escojida");
        opción=teclado.nextInt();
        
        switch (opción) {
            case 0:
                System.out.println("Salir del juego");
                break;
            case 1:
                System.out.println("Jugar nueva partida");
                break;
            case 2:
                System.out.println("Cargar partida guardada");
                break;
            case 3:
                System.out.println("Ver records");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
    
}
