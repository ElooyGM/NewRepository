/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portaventura;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PortAventura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entradas PortAventura
        int mayores, menores, personas, precio_total;
        double descuento, entrada_gratuita, precio_descontado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Mostrar personas que quieren entradas");
        personas = teclado.nextInt();
        System.out.println("Mostrar cuantos son menores");
        menores = teclado.nextInt();

        mayores = personas - menores;
        System.out.println("Mostrar personas adultas" + mayores);

        precio_total = mayores * 20 + menores * 10;
        System.out.println("Mostrar precio total de las entradas " + precio_total);

        if (personas >= 10 && personas<25) {
            System.out.println("1Hay un descuento del 25%");
            descuento = precio_total * 25 / 100;
            precio_descontado = precio_total - descuento;
            System.out.println("1Mostrar precio con descuento " + precio_descontado);
        } else if (personas >= 25) {
            System.out.println("Hay un descuento del 25%");
            descuento = precio_total * 25 / 100;
            precio_descontado = precio_total - descuento;
            System.out.println("Mostrar precio con descuento" + precio_descontado);
            System.out.println("Además de esto hay una entrada gratuita");
            entrada_gratuita = precio_descontado - 20;
            System.out.println("Mostrar el precio que queda con la entrada gratuita " + entrada_gratuita);
        }
    }

}
