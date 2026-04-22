package VariablesTipoDatos;

public class VariablesTiposDatos {
    public static void main(String[] args) {

        String nombre = "arroz";
        Double precio = 2500000d;
        Integer cantidad = 5;
        boolean disponible = true;
        Character codigoProducto = 'a';

        System.out.println(String.format("Nombre Producto: %S", nombre));

        System.out.println(String.format("Precio Producto: $%,.0f", precio));

        System.out.println("Cantidad: " + cantidad);
        System.out.println(String.format("Disponible: %B", disponible));
        System.out.println(String.format("Código producto: %S", codigoProducto));

    }
}