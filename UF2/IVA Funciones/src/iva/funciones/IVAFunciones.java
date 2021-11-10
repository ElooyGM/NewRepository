/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iva.funciones;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class IVAFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
      double precio1, precio2, precio3, precio4, precio5, precioiva = 0, precio;
        System.out.println("Pon los 5 precios");
        precio1=teclado.nextInt();
        precio2=teclado.nextInt();
        precio3=teclado.nextInt();
        precio4=teclado.nextInt();
        precio5=teclado.nextInt();
        precio=precioConIVA( precio1,  precio2,  precio3,  precio4,  precio5,  precioiva);
        System.out.println("El precio con el iva total es " + precio);
    }
    
    public static double precioConIVA(double precio1, double precio2, double precio3, double precio4, double precio5, double precioiva){
        precioiva=precio1+precio1*0.21+precio2+precio2*0.21+precio3+precio3*0.21+precio4+precio4*0.21+precio5+precio5*0.21;
        return precioiva;
    }
    
}
