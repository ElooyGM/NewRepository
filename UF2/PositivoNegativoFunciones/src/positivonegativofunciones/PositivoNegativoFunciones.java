/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivonegativofunciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PositivoNegativoFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, valor;
        System.out.println("Pon el valor del numero");
        a = teclado.nextInt();
        valor = dimeSigno (a);
   System.out.println("El numero es " + valor);
    }
/**
 * 
 * @param a
 * @return 
 */
    public static int dimeSigno(int a) {
        if (a < 0) {
            System.out.println("Negativo");
            return a;
        } else if (a == 0) {
            System.out.println("Neutro");
            return a;
        } else {
            System.out.println("Positivo");
             return a;
        }
        
    }

}
