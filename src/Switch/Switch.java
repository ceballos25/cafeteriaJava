package Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        char codigoProducto;

        while (true) {
            System.out.print("Ingresa categoría: ");
            codigoProducto = consola.nextLine().toUpperCase().charAt(0);

            if (codigoProducto == 'B' || codigoProducto == 'F' ||
                    codigoProducto == 'C' || codigoProducto == 'P') {
                break;
            }

            System.out.println("La categoría ("+ codigoProducto + ") NO existe intenta nuevamente.");
        }

        switch (codigoProducto) {
            case 'B' -> System.out.println("Bebida caliente - IVA 0%");
            case 'F' -> System.out.println("Bebida fría - IVA 5%");
            case 'C', 'P' -> System.out.println("Comida/Postre - IVA 8%");
        }
    }
}