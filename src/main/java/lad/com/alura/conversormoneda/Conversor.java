package lad.com.alura.conversormoneda;

import java.io.IOException;
import java.util.Scanner;

public class Conversor {

    public static void eleccionUserMenu() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sea bienvenido/a al Conversor de Moneda");
        System.out.println("1 - USD a ARS");
        System.out.println("2 - USD a BOB");
        System.out.println("3 - USD a BRL");
        System.out.println("4 - USD a CLP");
        System.out.println("5 - USD a COP");
        System.out.println("6 - USD a otra moneda");
        System.out.println("0 - Salir");
        System.out.print("Elija una opción válida: ");

        int opcion = scanner.nextInt();
        if (opcion == 0) {
            System.out.println("¡Gracias por usar el conversor!");
            return;
        }

        System.out.print("Ingrese el monto en USD: ");
        double monto = scanner.nextDouble();

        String monedaDestino = "";

        switch (opcion) {
            case 1 -> monedaDestino = "ARS";
            case 2 -> monedaDestino = "BOB";
            case 3 -> monedaDestino = "BRL";
            case 4 -> monedaDestino = "CLP";
            case 5 -> monedaDestino = "COP";
            case 6 -> {
                System.out.print("Ingrese el código de la moneda destino: ");
                monedaDestino = scanner.next().toUpperCase();
            }
            default -> {
                System.out.println("Opción no válida.");
                return;
            }
        }

        String apiKey = "4cb4c1e8c5b302c922541065";  // <- reemplaza esto con tu clave real
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/USD/" + monedaDestino;

        double tasa = ConversorApp.obtenerTasa(url);
        double resultado = monto * tasa;

        System.out.println("Tasa de conversión USD -> " + monedaDestino + ": " + tasa);
        System.out.println("Monto convertido: " + resultado);

        System.out.println("\n¿Desea hacer otra conversión? (s/n): ");
        String repetir = scanner.next();
        if (repetir.equalsIgnoreCase("s")) {
            eleccionUserMenu();
        } else {
            System.out.println("¡Hasta pronto!");
        }
    }
}
