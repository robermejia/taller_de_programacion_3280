package Semana4;
import java.util.Scanner;
public class TAREA_REPETITIVOS_3 {
    public static void main(String[] args) {
        // EJERCICIO 5
        Scanner scanner = new Scanner(System.in);
        int cobreTotal = 0;
        int bronceTotal = 0;
        int silverTotal = 0;
        int goldTotal = 0;
        System.out.print("Ingrese el número de ventas: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Venta " + (i + 1));
            System.out.print("Ingrese el tipo de licencia (cobre, bronce, silver, gold): ");
            String tipoLicencia = scanner.next();
            System.out.print("Ingrese el número de licencias vendidas: ");
            int cantidadLicencias = scanner.nextInt();
            int importeVenta = 0;
            switch (tipoLicencia) {
                case "cobre":
                    importeVenta = 510 * cantidadLicencias;
                    cobreTotal += importeVenta;
                    break;
                case "bronce":
                    importeVenta = 1500 * cantidadLicencias;
                    bronceTotal += importeVenta;
                    break;
                case "silver":
                    importeVenta = 3100 * cantidadLicencias;
                    silverTotal += importeVenta;
                    break;
                case "gold":
                    importeVenta = 4500 * cantidadLicencias;
                    goldTotal += importeVenta;
                    break;
                default:
                    System.out.println("Tipo de licencia inválido.");
                    continue;
            }
            System.out.println("Importe a pagar: " + importeVenta);
            System.out.println("Importe total recaudado (cobre): " + cobreTotal);
            System.out.println("Importe total recaudado (bronce): " + bronceTotal);
            System.out.println("Importe total recaudado (silver): " + silverTotal);
            System.out.println("Importe total recaudado (gold): " + goldTotal);
            System.out.println("Número de licencias vendidas (cobre): " + cobreTotal / 510);
            System.out.println("Número de licencias vendidas (bronce): " + bronceTotal / 1500);
            System.out.println("Número de licencias vendidas (silver): " + silverTotal / 3100);
            System.out.println("Número de licencias vendidas (gold): " + goldTotal / 4500);
            System.out.println("Número de ventas efectuadas (cobre): " + (cobreTotal / 510));
            System.out.println("Número de ventas efectuadas (bronce): " + (bronceTotal / 1500));
            System.out.println("Número de ventas efectuadas (silver): " + (silverTotal / 3100));
            System.out.println("Número de ventas efectuadas (gold): " + (goldTotal / 4500));
        }
    }
}

// EJERCICIO 1
/*
package Semana4;
import java.util.Scanner;
public class TAREA_REPETITIVOS_3 {
    public static void main(String[] args) {
        // EJERCICIO 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int n = scanner.nextInt();
        String nombreMax = "";
        int edadMax = -1;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = scanner.next();

            System.out.print("Ingrese la edad del estudiante " + (i + 1) + ": ");
            int edad = scanner.nextInt();

            if (edad > edadMax) {
                edadMax = edad;
                nombreMax = nombre;
            }
        }
        System.out.println("El estudiante con la edad máxima es " + nombreMax + 
                            " con " + edadMax + " años.");

        scanner.close();
    }
}
*/

/*
package Semana4;
import java.util.Scanner;
public class TAREA_REPETITIVOS_3 {
    public static void main(String[] args) {
        // EJERCICIO 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int n = scanner.nextInt();
        String nombreMin = "";
        int edadMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = scanner.next();
            System.out.print("Ingrese la edad del estudiante " + (i + 1) + ": ");
            int edad = scanner.nextInt();

            if (edad < edadMin) {
                edadMin = edad;
                nombreMin = nombre;
            }
        }
        System.out.println("El estudiante con la edad mínima es " + nombreMin + 
                           " con " + edadMin + " años.");
        scanner.close();
    }
}
*/

/*
package Semana4;
import java.util.Scanner;
public class TAREA_REPETITIVOS_3 {
    public static void main(String[] args) {
        // EJERCICIO 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        System.out.println("Los 10 siguientes números son:");
        for (int i = numero + 1; i <= numero + 10; i++) {
            System.out.println(i);
        }
    }
}
*/

/*
package Semana4;
import java.util.Scanner;
public class TAREA_REPETITIVOS_3 {
    public static void main(String[] args) {
        // EJERCICIO 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de varillas: ");
        int n = scanner.nextInt();
        int varillasFueraDeRango = 0;
        double sumaDiametros = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el diámetro de la varilla " 
                                + (i + 1) + ": ");
            double diametro = scanner.nextDouble();
            if (diametro < 2.5 || diametro > 4.0) {
                varillasFueraDeRango++;
            }
            sumaDiametros += diametro;
        }
        double diametroPromedio = sumaDiametros / n;
        double porcentajeFueraDeRango = (varillasFueraDeRango * 100.0) / n;
        System.out.println("Diámetro promedio: " + diametroPromedio);
        System.out.println("Número de varillas fuera del rango: " + 
                            varillasFueraDeRango);
        if (porcentajeFueraDeRango > 10) {
            System.out.println("El lote es rechazado.");
        } else {
            System.out.println("El lote es aceptado.");
        }
    }
}
*/

/*
package Semana4;
import java.util.Scanner;
public class TAREA_REPETITIVOS_3 {
    public static void main(String[] args) {
        // EJERCICIO 5
        Scanner scanner = new Scanner(System.in);
        int cobreTotal = 0;
        int bronceTotal = 0;
        int silverTotal = 0;
        int goldTotal = 0;
        System.out.print("Ingrese el número de ventas: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Venta " + (i + 1));
            System.out.print("Ingrese el tipo de licencia (cobre, bronce, silver, gold): ");
            String tipoLicencia = scanner.next();
            System.out.print("Ingrese el número de licencias vendidas: ");
            int cantidadLicencias = scanner.nextInt();
            int importeVenta = 0;
            switch (tipoLicencia) {
                case "cobre":
                    importeVenta = 510 * cantidadLicencias;
                    cobreTotal += importeVenta;
                    break;
                case "bronce":
                    importeVenta = 1500 * cantidadLicencias;
                    bronceTotal += importeVenta;
                    break;
                case "silver":
                    importeVenta = 3100 * cantidadLicencias;
                    silverTotal += importeVenta;
                    break;
                case "gold":
                    importeVenta = 4500 * cantidadLicencias;
                    goldTotal += importeVenta;
                    break;
                default:
                    System.out.println("Tipo de licencia inválido.");
                    continue;
            }
            System.out.println("Importe a pagar: " + importeVenta);
            System.out.println("Importe total recaudado (cobre): " + cobreTotal);
            System.out.println("Importe total recaudado (bronce): " + bronceTotal);
            System.out.println("Importe total recaudado (silver): " + silverTotal);
            System.out.println("Importe total recaudado (gold): " + goldTotal);
            System.out.println("Número de licencias vendidas (cobre): " + cobreTotal / 510);
            System.out.println("Número de licencias vendidas (bronce): " + bronceTotal / 1500);
            System.out.println("Número de licencias vendidas (silver): " + silverTotal / 3100);
            System.out.println("Número de licencias vendidas (gold): " + goldTotal / 4500);
            System.out.println("Número de ventas efectuadas (cobre): " + (cobreTotal / 510));
            System.out.println("Número de ventas efectuadas (bronce): " + (bronceTotal / 1500));
            System.out.println("Número de ventas efectuadas (silver): " + (silverTotal / 3100));
            System.out.println("Número de ventas efectuadas (gold): " + (goldTotal / 4500));
        }
    }
}
*/