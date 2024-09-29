package Semana4;
import java.util.Scanner;

public class TAREA_MENUS {

    public static void main(String[] args) {
       

    }
}

/*
// EJERCICIO 1
package Semana4;
import java.util.Scanner;

public class TAREA_MENUS {
    static String nombre;
    static double saldo;
    static int cantidadDepositos;
    static int cantidadRetiros;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("CUENTA CORRIENTE");
            System.out.println("1. APERTURA DE UNA CUENTA CORRIENTE");
            System.out.println("2. DEPOSITO");
            System.out.println("3. RETIRO");
            System.out.println("4. REPORTE ESTADO DE CUENTA");
            System.out.println("5. SALIR");
            System.out.print("INGRESE OPCION => ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    abrirCuenta(scanner);
                    break;
                case 2:
                    realizarDeposito(scanner);
                    break;
                case 3:
                    realizarRetiro(scanner);
                    break;
                case 4:
                    mostrarEstadoCuenta();
                    break;
                case 5:
                    System.out.println("SALIR");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println("************************************************");
        } while (opcion != 5);

        System.out.println("Fin del programa.");
    }

    static void abrirCuenta(Scanner scanner) {
        System.out.println("APERTURA DE UNA CUENTA CORRIENTE");
        System.out.print("Nombre: ");
        scanner.nextLine(); // Limpiar el buffer del scanner
        nombre = scanner.nextLine();
        System.out.print("Saldo actual: ");
        saldo = scanner.nextDouble();
        cantidadDepositos = 0;
        cantidadRetiros = 0;
        System.out.println("Cuenta abierta exitosamente.");
    }

    static void realizarDeposito(Scanner scanner) {
        System.out.println("DEPOSITO");
        System.out.print("Monto a depositar: ");
        double montoDeposito = scanner.nextDouble();
        saldo += montoDeposito;
        cantidadDepositos++;
        System.out.println("Depósito realizado correctamente.");
    }

    static void realizarRetiro(Scanner scanner) {
        System.out.println("RETIRO");
        System.out.print("Monto a retirar: ");
        double montoRetiro = scanner.nextDouble();
        if (montoRetiro <= saldo) {
            saldo -= montoRetiro;
            cantidadRetiros++;
            System.out.println("Retiro realizado correctamente.");
        } else {
            System.out.println("No tiene saldo suficiente para realizar el retiro.");
        }
    }

    static void mostrarEstadoCuenta() {
        System.out.println("REPORTE ESTADO DE CUENTA");
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo actual: " + saldo);
        System.out.println("Cantidad de depósitos: " + cantidadDepositos);
        System.out.println("Cantidad de retiros: " + cantidadRetiros);
    
    }
    
}


*/

// EJERCICIO 2
/*
package Semana4;
import java.util.Scanner;

public class TAREA_MENUS {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("1.- CALCULO DEL IMC");
            System.out.println("2.- CONVERTIR CELCIUS A FARANHEIT");
            System.out.println("3.- OBTENER EL AREA DE CUALQUIER TRIANGULO");
            System.out.println("4.- SALIR");
            System.out.print("INGRESE OPCION=> ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    calcularIMC();
                    break;
                case 2:
                    convertirCelsiusAFahrenheit();
                    break;
                case 3:
                    obtenerAreaTriangulo();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (option != 4);
        
        scanner.close();
    }

    static void calcularIMC() {
        System.out.print("Ingrese su peso en kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.println("Su IMC es: " + bmi);
    }

    static void convertirCelsiusAFahrenheit() {
        System.out.print("Ingrese grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("En Fahrenheit: " + fahrenheit);
    }

    static void obtenerAreaTriangulo() {
        System.out.print("Ingrese la base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        double triangleHeight = scanner.nextDouble();
        double area = (base * triangleHeight) / 2;
        System.out.println("El area del triangulo es: " + area);
    }
}
*/