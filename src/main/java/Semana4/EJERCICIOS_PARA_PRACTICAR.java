package Semana4;
import java.util.Random;
import java.util.Scanner;
public class EJERCICIOS_PARA_PRACTICAR {

    public static void main(String[] args) {
        // EJERCICIO 1
        /*
        Una adivinanza que la maquina tome un 
        número entre un valor de 1-80 que lo 
        acertara en 6 intentos por cada intento
        fallido se le dará una ayuda al usuario
        es mayor al valor ingresado
        es menor al valor ingresado
        */
        /*
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = (int) (Math.random() * 80) + 1;
        int intentosMaximos = 6;
        System.out.println("Adivina el número entre 1 y 80. Tienes 6 intentos.");
        for (int intento = 1; intento <= intentosMaximos; intento++) {
            System.out.printf("Intento %d: ", intento);
            int numeroIngresado = scanner.nextInt();
            if (numeroIngresado == numeroAdivinar) {
                System.out.println("¡Felicitaciones! ¡Has adivinado el número!");
                break;
            } else if (numeroIngresado < numeroAdivinar) {
                System.out.println("El número es mayor al valor ingresado.");
            } else {
                System.out.println("El número es menor al valor ingresado.");
            }
            if (intento == intentosMaximos) {
                System.out.println("Lo siento, has agotado todos los intentos. El número correcto era: " + numeroAdivinar);
            }
        }
        */
        
        // EJERCICIO 2
        /*
        Realizar 6 tiros de dados y mostrar 
        cuantas veces gano y cuantas veces
        perdio.
        */
        /*
        Random random = new Random();
        int tiros = 6;
        int ganados = 0;
        int perdidos = 0;
        System.out.println("Realizando 6 tiros de dados...");
        for (int i = 0; i < tiros; i++) {
            int resultado = random.nextInt(6) + 1;
            System.out.println("Tiro " + (i + 1) + ": " + resultado);

            if (resultado == 6) {
                ganados++;
            } else {
                perdidos++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Ganados: " + ganados);
        System.out.println("Perdidos: " + perdidos);
        */
        
        // EJERCICIO 3
        /*
        En el pago de compras la tienda ofrece
        una promociòn de descuento segun la bola
        obtenida al azar:
        1 - rojo (12%),
        2 - azul (5%),
        3 - verde (8%),
        4 - naranja (10%) 
        Muestre el descuento y el total pago 
        procede para varias personas con la opciòn
        continua s/n
        */
        // EJERCICIO 3
        /*
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String opcion = "s";
        while (opcion.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el monto total de la compra:");
            double montoCompra = scanner.nextDouble();
            int bola = random.nextInt(4) + 1;
            double descuento = 0;

            switch (bola) {
                case 1:
                    descuento = 0.12;
                    break;
                case 2:
                    descuento = 0.05;
                    break;
                case 3:
                    descuento = 0.08;
                    break;
                case 4:
                    descuento = 0.10;
                    break;
            }
            double montoDescuento = montoCompra * descuento;
            double totalPago = montoCompra - montoDescuento;

            System.out.println("Descuento obtenido: " + (descuento * 100) + "%");
            System.out.println("Total a pagar: " + totalPago);

            System.out.println("¿Desea continuar? (s/n)");
            opcion = scanner.next();
        }
        */
        
    }
    
}
