/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucletabla5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class BucleTabla5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tabla5
        int cont, tabla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("que tabla de multiplicar quieres");
        tabla = teclado.nextInt();
        for (cont = 1; cont <= 10; cont++) {
            System.out.println(+tabla + "*" + cont + "=" + (tabla * cont));
        }
        cont = 1;
        int multi;
        while (cont <= 10) {
            multi = tabla * cont;
            System.out.println(tabla + "*" + cont + "=" + multi);
            cont = cont + 1;
        }
        cont=1;
        do{
           multi=tabla*cont; 
           System.out.println(tabla + "*" + cont + "=" + multi);
           cont=cont+1;
        }while(cont<10);
    }

}
