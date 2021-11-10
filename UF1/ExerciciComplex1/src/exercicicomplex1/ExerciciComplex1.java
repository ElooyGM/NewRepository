/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicicomplex1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExerciciComplex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Horas, minutos y segundos
        int hora, minuto, segundo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Mostrar hora");
        hora = teclado.nextInt();
        System.out.println("Mostrar minuto");
        minuto = teclado.nextInt();
        System.out.println("Mostrar segundo");
        segundo = teclado.nextInt();

        segundo=segundo+1; //segundo++;
        
       if(segundo==60)  {
           System.out.println("He pasado 60");
           segundo=0;
           minuto=minuto+1;
           if(minuto==60){
               
           }
           else //No ha pasado de 60
           {
                      System.out.println("Hora" +hora+"minutos" +minuto+"segundos" +segundo);

           }
       }
       else // no he pasado de 60 horas
       {
      System.out.println("Hora" +hora+"minutos" +minuto+"segundos" +segundo);

       }


    }

}
