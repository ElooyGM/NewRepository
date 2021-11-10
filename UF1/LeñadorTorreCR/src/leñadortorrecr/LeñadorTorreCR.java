/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leñadortorrecr;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class LeñadorTorreCR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vt1 = 2534;
        int vt2 = 2786;
        int vt3 = 3052;
        int vt4 = 3346;
        int vt5 = 3668;
        int dl1 = 200;
        int dl2 = 220;
        int dl3 = 242;
        int dl4 = 266;
        int dl5 = 292;
        int contador = 0;
        int vida;
        System.out.println("Pedir nivel del leñador");
        int nleñador = teclado.nextInt();
        System.out.println("Pedir nivel de la torre");
        int ntorre = teclado.nextInt();
        switch (nleñador) {
            case 9:
                System.out.println("Su daño es de " + dl1);
                break;
            case 10:
                System.out.println("Su daño es de " + dl2);
                break;
            case 11:
                System.out.println("Su daño es de " + dl3);
                break;
            case 12:
                System.out.println("Su daño es de " + dl4);
                break;
            case 13:
                System.out.println("Su daño es de " + dl5);
                break;
            default:
                System.out.println("Este nivel esta fuera del rango");
                break;
        }
        switch (ntorre) {
            case 9:
                System.out.println("Su vida es de " + vt1);
                break;
            case 10:
                System.out.println("Su vida es de " + vt2);
                break;
            case 11:
                System.out.println("Su vida es de  " + vt3);
                break;
            case 12:
                System.out.println("Su vida es de  " + vt4);
                break;
            case 13:
                System.out.println("Su vida es de  " + vt5);
                break;
            default:
                System.out.println("Este nivel esta fuera del rango");
                break;

        }
        do {
            System.out.println("El leñador pega a la torre");
            switch (ntorre) {
                case 9:
                    contador++;
                    vida = vt1 - dl1;
                    System.out.println("la vida de la torre es " + vt1);
                    break;
                case 10:
                    contador++;
                    vida = vt2 - dl2;
                    System.out.println("la vida de la torre es " + vt2);

                    break;
                case 11:
                    contador++;
                    vida = vt3 - dl3;
                    System.out.println("la vida de la torre es " + vt3);

                    break;
                case 12:
                    contador++;
                    vida = vt4 - dl4;
                    System.out.println("la vida de la torre es " + vt4);

                    break;
                case 13:
                    contador++;
                    vida = vt5 - dl5;
                    System.out.println("la vida de la torre es " + vt5);

                    break;
                
            }
        } while (vt1 > 0 && vt2 > 0 && vt3 > 0 && vt4 > 0 && vt5 >0);
        System.out.println("Has eliminado la torre en " + contador + " golpes " );
    }

}
