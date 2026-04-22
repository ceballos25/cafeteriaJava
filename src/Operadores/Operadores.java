package Operadores;

public class Operadores {
//    Una cafetería aplica un descuento del 15% a los pedidos mayores a $30.000.
//    Dado un subtotal de $42.500,: calcula el valor del descuento, el total a pagar y si el cliente tiene
//    derecho al descuento (resultado booleano).
//    Muestra los tres valores con System.out.printf.

      public static void main(String[] args) {

            Double descuento = 15d;
            Double subTotal;
            Double topeDescuento = 30000d;
            Double totalPagar = 0d;
            Boolean aplicaDescuento = false;

            subTotal = 22500d;

            if (subTotal > topeDescuento){
                  aplicaDescuento = true;
                  totalPagar = subTotal - (subTotal * (descuento / 100));

                  System.out.println("***************************************************************************");
                  System.out.println(String.format("Subtotal: $%,.0f", subTotal));
                  System.out.println(String.format("Descuento Aplicado de: $%,.0f", subTotal * (descuento / 100)));
                  System.out.println(String.format("Total a Pagar: $%,.0f", totalPagar));
                  System.out.println("***************************************************************************");
            }else {
                  aplicaDescuento = false;
                  System.out.println("***************************************************************************");
                  System.out.println("Aplica desceunto: " +aplicaDescuento);
                  System.out.println(String.format("Total a Pagar: $%,.0f", subTotal));
                  System.out.println("***************************************************************************");
            }


      }





}
