/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijerafunciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PiedraPapelTijeraFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nOr = 0, nUs = 0, tirada_jugador = 0, tirada_maquina = 0, contador = 0, jugada, contador_jugador = 0, contador_usuario;
        int Usuario = tirada_usuario(nUs);
        int Maquina = 0;
        mostrar_jugada (Maquina);
        Maquina = tirada_ordenador(nOr);
        int Partida = comprobar_quien_gana(tirada_jugador, tirada_maquina);
        System.out.println(Partida);
        int contad = aumentar_contador(contador);
        boolean s=seguir_jugando(0,5);
        System.out.println(s);
        int ganador = 0;
        if(ganador==1){
            aumentar_contador(contador_jugador);
        }else if(ganador==-1){
            contador_maquina=aumentar_contador(contador_maquina);
        }
    }

    public static int tirada_ordenador(int nOr) {
        Random r = new Random();
        nOr = r.nextInt(3) + 1;
        if (nOr == 1) {
            System.out.println(" La máquina ha tirado piedra ");
        } else if (nOr == 2) {
            System.out.println(" La máquina ha tirado papel ");
        } else if (nOr == 3) {
            System.out.println(" La máquina ha tirado tijera ");
        }
        return nOr;
    }

    public static int tirada_usuario(int nUs) {
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Elige un número del 1 al 3");
            nUs = teclado.nextInt();
        } while (nUs != 1 && nUs != 2 && nUs != 3);
        return nUs;
    }

    public static int comprobar_quien_gana(int tirada_jugador, int tirada_maquina) {
        if(tirada_jugador==tirada_maquina){
            return 0;
        }
        else if (tirada_jugador == 1 && tirada_maquina == 3) {
            return 1;
        } else if (tirada_jugador == 2 && tirada_maquina == 1) {
            return 1;
        } else if (tirada_jugador == 3 && tirada_maquina == 2) {
            return 1;
        } else if (tirada_jugador == 3 && tirada_maquina == 1) {
            return -1;
        } else if (tirada_jugador == 1 && tirada_maquina == 2) {
            return -1;
        } else if (tirada_jugador == 2 && tirada_maquina == 3) {
            return -1;
        } else {
            return 0;
        }

    }

    public static int aumentar_contador(int contador) {
        contador++;
        return contador;
    }

    public static void mostrar_jugada(int jugada) {
        switch (jugada) {
            case 1:
                System.out.println("piedra");
                break;
            case 2:
                System.out.println("papel");
                break;
            case 3:
                System.out.println("tijera");
                break;
            default:
                System.out.println("INCORRECTO");
                break;
        }
    }
    public static boolean seguir_jugando(int contadorj, int contadorm){
        boolean seguir=true;
        if (contadorj>=5||contadorm>=5){
            seguir=false;
        }
        return seguir;
    }
    
   
}
