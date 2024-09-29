package Semana5;
import java.util.Scanner;
public class PRACTICA_CALIFICADA_2 {
    public static void main(String[] args) {
        // PROBLEMA 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        long numero = scanner.nextLong();
        ordenarNumeros(numero);
    }
    public static void ordenarNumeros(long numero) {
        String numeroString = Long.toString(numero);
        StringBuilder numeroOrdenado = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < numeroString.length(); j++) {
                char digito = numeroString.charAt(j);
                if (digito != '0' && Character.getNumericValue(digito) == i) {
                    numeroOrdenado.append(digito);
                }
            }
        }
        System.out.println("El número ordenado es: " + numeroOrdenado);
    }
}
/*
package Semana5;
import java.util.Random;
public class PRACTICA_CALIFICADA_2 {
    public static void main(String[] args) {
        // PROBLEMA 1
        Random random = new Random();
        int[] ventas = new int[12];
        double[] comisiones = new double[12];
        int sumaVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = random.nextInt(2501) + 500;
            sumaVentas += ventas[i];
            if (ventas[i] < 1200) {
                comisiones[i] = ventas[i] * 0.03;
                System.out.println("Mes " + (i + 1) + ": Venta " + ventas[i] + 
                                    ", Comisión 3%, Observación: Baja venta");
            } else if (ventas[i] >= 1200 && ventas[i] <= 2000) {
                comisiones[i] = ventas[i] * 0.06;
                System.out.println("Mes " + (i + 1) + ": Venta " + ventas[i] + 
                                ", Comisión 6%, Observación: Venta regular");
            } else {
                comisiones[i] = ventas[i] * 0.09;
                System.out.println("Mes " + (i + 1) + ": Venta " + ventas[i] + 
                                ", Comisión 9%, Observación: Buena venta");
            }
        }
        double ventaPromedio = (double) sumaVentas / ventas.length;
        System.out.println("Venta promedio: " + ventaPromedio);
    }
}
*/

/*
package Semana5;
import java.util.Random;
import java.util.Scanner;
public class PRACTICA_CALIFICADA_2 {
    public static void main(String[] args) {
        // PROBLEMA 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio contado de la computadora: ");
        double precioContado = scanner.nextDouble();
        System.out.print("Ingrese el número de meses para pagar: ");
        int meses = scanner.nextInt();
        double interesMensual = 0.02;
        double saldo = precioContado;
        double cuotaMensual = saldo / meses;
        System.out.println("Precio Final: " + precioContado);
        System.out.println("Mes    Cuota     Mensual       Saldo");
        System.out.println("=====================================");
        for (int i = 1; i <= meses; i++) {
            double interes = saldo * interesMensual;
            saldo += interes;
            saldo -= cuotaMensual;
            System.out.printf("%-4d   %-9.2f   %-12.2f   %-8.2f\n", 
                                i, cuotaMensual, interes, saldo);
        }
    }
}
*/

/*
package Semana5;
import java.util.Scanner;
public class PRACTICA_CALIFICADA_2 {
    public static void main(String[] args) {
        // PROBLEMA 3
        Scanner scanner = new Scanner(System.in);
        int numero;
        int cantidadNumeros = 0;
        int sumaPares = 0;
        int cantidadPares = 0;
        int sumaImpares = 0;
        int cantidadImpares = 0;
        System.out.println("Ingrese números de dos dígitos. "
                            + "Ingrese un número fuera de ese rango para terminar.");

        while (true) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            if (numero < 10 || numero > 99) {
                break;
            }
            cantidadNumeros++;

            if (numero % 2 == 0) {
                sumaPares += numero;
                cantidadPares++;
            } else {
                sumaImpares += numero;
                cantidadImpares++;
            }
        }
        double promedioPares = cantidadPares > 0 ? (double) sumaPares / cantidadPares : 0;
        double promedioImpares = cantidadImpares > 0 ? (double) sumaImpares / cantidadImpares : 0;
        System.out.println("Cantidad de números ingresados: " + cantidadNumeros);
        System.out.println("Promedio de los números pares: " + promedioPares);
        System.out.println("Promedio de los números impares: " + promedioImpares);
    }
}
*/