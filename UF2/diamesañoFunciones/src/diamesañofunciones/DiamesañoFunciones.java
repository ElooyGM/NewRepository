/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diamesañofunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DiamesañoFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, año, Dias;
        System.out.println("Pon el dia");
        dia = teclado.nextInt();
        System.out.println("Pon el mes");
        mes = teclado.nextInt();
        System.out.println("Pon el año");
        año = teclado.nextInt();
Dias=calendario(dia, mes, año);
        System.out.println("Enseña el calendario " + Dias);
    }
public static int calendario(int dia, int mes, int año){
    if(dia>30){
        System.out.println("MAAAAAAL");
    }else{
        return dia;
    }
    
    if (mes>12){
        System.out.println("MAAAAAAL");
    }else{
        return mes;
    }
    if (año<1900){
        System.out.println("MAAAAAAL");
    }else{
      return año;  
    }
        return 0;
    
}
}
