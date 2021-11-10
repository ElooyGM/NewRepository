/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale1;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class ClashRoyale1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Mostar opción");
        num1=teclado.nextInt();
        if (num1==1){
            System.out.println("Mostrar mago electrico");   
        }
        else if(num1==0){
            System.out.println("Mostrar mega esbirro");
        }
        else{
            System.out.println("ERROR");
        }
    }
    
}
