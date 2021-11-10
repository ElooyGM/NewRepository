/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero.par.impar.examen;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class NumeroParImparExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ordinograma
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Mostrar número: ");
        num = teclado.nextInt();
        
        if (num%2!=0) {
            System.out.println("numero impar" +num);
           
        }
        if (num%2==0){
            System.out.println("numero par" +num);
            if(num%3==0)
                System.out.println("Mostrar numero par divisible entre tres=" +num);
            else if(num%3!=0){
                System.out.println("Mostrar numero par" +num);
            }
                
        }
    }
    
}
