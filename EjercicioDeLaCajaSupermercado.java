package ejercicio.de.la.caja.supermercado;

import java.util.Scanner;

public class EjercicioDeLaCajaSupermercado {

    public static void main(String[] args) {
        int cantidad;
        int precio;
              
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el precio: ");
        precio = scan.nextInt();
        System.out.println("Introduce la cantidad del cliente: ");
        cantidad = scan.nextInt();

        if (cantidad >= precio) {
            System.out.println("cantidad - precio -> ");
            System.out.println(cantidad - precio);
        } else {
            if (cantidad <= precio) {
                System.out.println("no hay suficiente dinero");
                
            }
        }
        

    }

}
