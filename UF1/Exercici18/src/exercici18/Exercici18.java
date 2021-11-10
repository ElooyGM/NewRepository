/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici18;
import java.util.Scanner;
/**sueldo_horas_extra
 *
 * @author alumne
 */
public class Exercici18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tarifa, horas, sueldo_bruto, sueldo_horas_normales, hora_extra, sueldo_horas_extra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce precio hora");
        tarifa=teclado.nextDouble();
        System.out.println("Introduce horas trabajadas");
        horas=teclado.nextDouble();
       
        if (horas<35){
            sueldo_bruto= tarifa*horas;
            System.out.println("Tu sueldo bruto es " + sueldo_bruto);
        }
        else{
            sueldo_horas_normales= 35*tarifa;
            hora_extra= horas-35;
            sueldo_horas_extra= hora_extra*tarifa*1.5;
            sueldo_bruto= sueldo_horas_extra + sueldo_horas_normales;
        }
        System.out.println("Tu sueldo bruto es " +sueldo_bruto);
        
        
        
    }
    
}
