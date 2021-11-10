/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conocermayorfunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ConocerMayorFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int valor1, valor2;
int mayor;       
        System.out.println("Pon valor 1 " );
        valor1=sc.nextInt();
        System.out.println("Pon valor 2 " );
        valor2=sc.nextInt();
        mayor=numeroMasGrande(valor1, valor2);
        System.out.println("El numero mas grande es " + mayor);
        
        
    }
    
    /**
     * 
     * @param valor1
     * @param valor2
     * @return 
     */
    public static int numeroMasGrande(int valor1, int valor2){
        
    if (valor1>=valor2){
        return valor1;
    }else {
        return valor2;
    }

        
    
}

   
}
