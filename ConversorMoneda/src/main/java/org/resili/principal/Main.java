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

        while (true) {
            try {
                System.out.print("""
                        Sea bienvenido/a al Conversor de Moneda =]

                        1) Dólar => Peso argentino
                        2) Peso argentino => Dólar
                        3) Dólar => Real brasileño
                        4) Real brasileño => Dólar
                        5) Dólar => Peso colombiano
                        6) Peso colombiano => Dólar
                        7) Salir
                        Elija una opción válida: """);

                int opcion = lectura.nextInt();

                if (opcion == 7) {
                    System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                    break;
                }

                if (opcion < 1 || opcion > 7) {
                    System.out.println("Opción no válida. Intenta nuevamente.");
                    continue;
                }

                String monedaBase;
                String monedaDestino;

                switch (opcion) {
                    case 1:
                        monedaBase = "USD";
                        monedaDestino = "ARS";
                        break;
                    case 2:
                        monedaBase = "ARS";
                        monedaDestino = "USD";
                        break;
                    case 3:
                        monedaBase = "USD";
                        monedaDestino = "BRL";
                        break;
                    case 4:
                        monedaBase = "BRL";
                        monedaDestino = "USD";
                        break;
                    case 5:
                        monedaBase = "USD";
                        monedaDestino = "COP";
                        break;
                    case 6:
                        monedaBase = "COP";
                        monedaDestino = "USD";
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta nuevamente.");
                        continue;
                }

                System.out.print("Ingrese el valor que deseas convertir: ");
                double monto = lectura.nextDouble();

                MonedaDTO monedaDTO = consulta.buscarMoneda(monedaBase, monedaDestino);
                Moneda moneda = new Moneda(monedaDTO);
                double resultado = moneda.calcularConversion(monto);
                System.out.printf("El valor %.2f %s corresponde al valor final de => %.2f %s%n",
                        monto, moneda.getCodigoBase(), resultado, moneda.getCodigoDestino());
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debes ingresar un número.");
                lectura.next();
            } catch (RuntimeException e) {
                System.out.println("Error al consultar la tasa de cambio: " + e.getMessage());
            }
        }

        lectura.close();
    }
}
