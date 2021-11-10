/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionmenu;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AplicacionMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("****** MENU ******\n"
                + "0-Salir\n"
                + "1-Escribir 10 veces \n"
                + "2-Cuenta atrás timbre\n"
                + "3-Numero pares entre 2 valores\n"
                + "");
        System.out.println("Elije tu opción");
        int cont;
        int opcion=teclado.nextInt();
        if (opcion == 0) {
            System.out.println("Fin del programa");
        }else if(opcion==1){
            for(cont=1; cont<=10; cont++){
                System.out.println  (cont+ " A clase se viene a trabajar ");
            }
        }else if (opcion==2){
            for(cont=10; cont>=0; cont--){
                System.out.print("" + cont);
        }
            System.out.println("Ring");
    }else if (opcion==3){
            System.out.println("Elige el primer numero");
        int Numero1=teclado.nextInt();
            System.out.println("Elige el segundo numero");
        int Numero2=teclado.nextInt();
          for(cont=Numero1; cont<Numero2; cont+=2){
              System.out.println(cont);
          }
    }

}}
