/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millaskilometrosfunciones;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class MillasKilometrosFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner (System.in);
       double km = 0; 
       double millas;
       System.out.println("Pon el valor en millas ");
        millas= teclado.nextInt();
        km= millas_a_kilometros( millas, km);
        System.out.println("En " + millas + " millas hay " + km + " kilometros ");
    }
    public static double millas_a_kilometros(double millas, double km) {
       if(millas<0){
           System.out.println("Error");
       }
       else if(millas>0){
        km= millas*1.60934;
        return km;
       }
        return km;
    }
    
}
