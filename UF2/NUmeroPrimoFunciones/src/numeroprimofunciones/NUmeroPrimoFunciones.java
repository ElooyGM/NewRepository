/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroprimofunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NUmeroPrimoFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Mostrar numero: ");
        int num=teclado.nextInt();
        int i = 0;
        int primo= numeros(num,i);
       if(primo==-1){
           System.out.println("El numero no es primo ");
       }
       else if (primo==1){
           System.out.println("El numero es primo");
       }
    }
    /**
     * 
     * @param num
     * @param i
     * @return 
     */
    public static int numeros(int num, int i){
      for(i=num-1; i>=2; i-- ){
          if (num % i == 0) {// si no es primo 
              return -1;
          }
      }
        
        return 1;
    }       
}
