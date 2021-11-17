/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletafunciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RuletaFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tirada = Tirar_bola();
        int elegir = Pedir_numero_apuesta();
        int dinero_tengo = 0;
        int dinero = pedir_dinero_apuesta(dinero_tengo);
        int num_apostado = 0, bola = 0;
        boolean resultado = Comprobar_resultado(num_apostado, bola);
        int cantidad = 0;
        int calcular=Calcular_premio(num_apostado,cantidad);
        int dinero_tienes = 0, dinero_ganado = 0;
        boolean ganado = false;
        int actualizar= Actualizar_dinero( dinero_tienes, dinero_ganado, ganado);
        int dineroDisponible = 0;
        boolean seguimos=Seguir_jugando(dineroDisponible);
    }

    public static int Tirar_bola() {
        Random r = new Random();
        int bola = r.nextInt(37);
        return bola;
    }

    public static int Pedir_numero_apuesta() {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        if (numero >= 0 && numero <= 38) {
            return numero;
        } else {
            return -1;
        }
    }

    public static int pedir_dinero_apuesta(int dinero_tengo) {
        Scanner teclado = new Scanner(System.in);
        dinero_tengo=teclado.nextInt();
        int dinero_apostado = teclado.nextInt();
        if (dinero_apostado>0 && dinero_apostado<dinero_tengo){
            return dinero_apostado;
        }else{
            return -1;
        }
    }
    public static boolean Comprobar_resultado(int num_apostado, int bola){
       boolean ganado=true;
       if (num_apostado==bola){
           return ganado=true;
       }else if(num_apostado==37){
           if(bola%2!=0){
           return ganado=true;
           }
       }else if (num_apostado==38){
           if(bola%2==0){
              return ganado=true; 
           }
           
       }else{
           return ganado=false;
       }
       return ganado=false;
}

    public static int Calcular_premio(int num_apostado, int cantidad) {
        if (num_apostado==37 || num_apostado==38){
           int premio=cantidad*2; 
           return premio;
         }else{
           int premio=cantidad*36; 
           return premio;  
         }
    }
    public static int Actualizar_dinero(int dinero_tienes, int dinero_ganado, boolean ganado){
        if(ganado){
            dinero_tienes=dinero_tienes + dinero_ganado;
        }else{
            dinero_tienes=dinero_tienes - dinero_ganado;
        }
                return dinero_tienes;
    }
    public static boolean Seguir_jugando(int dineroDisponible){
       Scanner teclado=new Scanner(System.in);
        System.out.println("Quieres seguir jugando? s/n");
        char opcion=teclado.nextLine().charAt(0);
        if (dineroDisponible<=0 || opcion=='n' || opcion=='N'){
            return false;
        } else if (dineroDisponible>0 || opcion=='s' || opcion=='S'){
            return true;
        }else{
            return false;
        }
    }

}
