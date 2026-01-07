package org.resili.principal;

import org.resili.modelos.Moneda;
import org.resili.modelos.MonedaDTO;
import org.resili.servicios.ConsultaMoneda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n***************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda");
            System.out.println("1) Dólar => Peso Argentino");
            System.out.println("2) Peso Argentino => Dólar");
            System.out.println("3) Dólar => Real Brasileño");
            System.out.println("4) Real Brasileño => Dólar");
            System.out.println("5) Dólar => Peso Colombiano");
            System.out.println("6) Peso Colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println("***************************************************");
            System.out.print("Elija una opción válida: ");

            int opcion;
            try {
                opcion = lectura.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida. Ingresa un número del 1 al 7.");
                lectura.nextLine();
                continue;
            }

            if (opcion == 7) {
                System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                salir = true;
                continue;
            }

            String monedaBase;
            String monedaTarget;

            switch (opcion) {
                case 1:
                    monedaBase = "USD";
                    monedaTarget = "ARS";
                    break;
                case 2:
                    monedaBase = "ARS";
                    monedaTarget = "USD";
                    break;
                case 3:
                    monedaBase = "USD";
                    monedaTarget = "BRL";
                    break;
                case 4:
                    monedaBase = "BRL";
                    monedaTarget = "USD";
                    break;
                case 5:
                    monedaBase = "USD";
                    monedaTarget = "COP";
                    break;
                case 6:
                    monedaBase = "COP";
                    monedaTarget = "USD";
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
                    continue;
            }

            System.out.print("Ingrese el valor que deseas convertir: ");
            double cantidad;
            try {
                cantidad = lectura.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debes ingresar un número.");
                lectura.nextLine();
                continue;
            }

            try {
                MonedaDTO monedaDTO = consulta.buscarMoneda(monedaBase, monedaTarget);
                Moneda moneda = new Moneda(monedaDTO);
                double total = cantidad * moneda.getTasaDeConversion();
                System.out.printf("El valor %.2f %s corresponde al valor final de => %.2f %s%n",
                        cantidad, moneda.getCodigoBase(), total, moneda.getCodigoDestino());
            } catch (RuntimeException e) {
                System.out.println("Error al consultar la tasa de cambio: " + e.getMessage());
            }
        }

        lectura.close();
    }
}
