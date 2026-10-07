//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner benjamin = new Scanner(System.in);

        int opcion;
        int cantidad;
        double precio = 0;
        double subtotal;
        double descuento = 0;
        double total;

        System.out.println("=================================");
        System.out.println("       CINEPLANET");
        System.out.println("    VENTA DE BOLETOS");
        System.out.println("=================================");

        // Seleccionar película
        System.out.println("Seleccione una película:");
        System.out.println("1. Avengers");
        System.out.println("2. Superman");
        System.out.println("3. Minecraft");
        System.out.println("4. Cómo entrenar a tu dragón");
        System.out.print("Ingrese una opción: ");
        opcion = benjamin.nextInt();

        String pelicula;

        switch (opcion) {
            case 1:
                pelicula = "Avengers";
                break;
            case 2:
                pelicula = "Superman";
                break;
            case 3:
                pelicula = "Minecraft";
                break;
            case 4:
                pelicula = "Cómo entrenar a tu dragón";
                break;
            default:
                pelicula = "Película no válida";
                break;
        }

        if (opcion < 1 || opcion > 4) {
            System.out.println("Opción no válida.");
            return;
        }

        // Seleccionar tipo de boleto
        System.out.println("\nSeleccione el tipo de boleto:");
        System.out.println("1. Adulto - S/ 20.00");
        System.out.println("2. Niño   - S/ 15.00");
        System.out.print("Ingrese una opción: ");
        opcion = benjamin.nextInt();

        switch (opcion) {
            case 1:
                precio = 20.00;
                break;
            case 2:
                precio = 15.00;
                break;
            default:
                System.out.println("Tipo de boleto no válido.");
                return;
        }

        // Cantidad de boletos
        System.out.print("\nIngrese la cantidad de boletos: ");
        cantidad = benjamin.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que 0.");
            return;
        }

        // Calcular subtotal
        subtotal = precio * cantidad;

        // Descuento por comprar 4 o más boletos
        if (cantidad >= 4) {
            descuento = subtotal * 0.10;
        }

        total = subtotal - descuento;

        // Mostrar comprobante
        System.out.println("\n=================================");
        System.out.println("       RESUMEN DE COMPRA");
        System.out.println("=================================");
        System.out.println("Película: " + pelicula);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio por boleto: S/ " + precio);
        System.out.println("Subtotal: S/ " + subtotal);
        System.out.println("Descuento: S/ " + descuento);
        System.out.println("TOTAL A PAGAR: S/ " + total);
        System.out.println("=================================");

        benjamin.close();
    }
}
