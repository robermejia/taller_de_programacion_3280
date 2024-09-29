package Semana3;

import java.util.Scanner;

public class PRACTICA_CALIFICADA_1 {

    public static void main(String[] args) {
        // EJERCICIO 1
        /*
        double montoPrestamo;
        double interes = 0.24;
        double montoTotalPagar;
        double montoCuotasEspeciales;
        double montoCuotasOrdinarias;

        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el monto del préstamo:");
        montoPrestamo = t.nextDouble();

        montoTotalPagar = montoPrestamo + (montoPrestamo * interes);
        montoCuotasEspeciales = (montoTotalPagar / 2) / 4;
        montoCuotasOrdinarias = (montoTotalPagar / 2) / 20;

        System.out.println("El monto total a pagar por el préstamo es: " + montoTotalPagar);
        System.out.println("El monto de las cuotas especiales es: " + montoCuotasEspeciales);
        System.out.println("El monto de las cuotas ordinarias es: " + montoCuotasOrdinarias);
        */

        
        // EJERCICIO 2
        /*
        int numeroEntero;
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        numeroEntero = t.nextInt();
        
        if (numeroEntero > 0 && numeroEntero % 2 == 0 ) {
            System.out.println("Par positivo");
        }else if (numeroEntero < 0 && numeroEntero % 2 == 0){
            System.out.println("Par negativo");
        }else if (numeroEntero > 0 && numeroEntero % 2 != 0){
            System.out.println("Impar Positivo");
        }else {
            System.out.println("Impar Negativo");
        }     
        */
        
        
        // EJERCICIO 3
        /*
        String categoria;
        int tipoProducto,unidadesProducidas;
        double bonificacion;
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el tipo de producto");
        System.out.println("1 - Tejas");
        System.out.println("2 - Losetas");
        tipoProducto = t.nextInt();
        System.out.println("Ingrese la categoría: A, B, C");
        categoria = t.next();
        System.out.println("Ingrese las unidades producidas");
        unidadesProducidas = t.nextInt();
        double pagoProducto = switch (tipoProducto) {
        case 1 -> categoria.equals("A") ? 2.50 : categoria.equals("B") ? 2.00 : 1.50;
        case 2 -> categoria.equals("A") ? 2.00 : categoria.equals("B") ? 1.50 : 1.00;
        default -> 0;
        };
        // Bonificación
        if (unidadesProducidas >= 1 && unidadesProducidas <= 250) {
            bonificacion = 0;
        } else if (unidadesProducidas >= 251 && unidadesProducidas <= 500) {
            bonificacion = 50.00;    
        } else if (unidadesProducidas >= 501 && unidadesProducidas <= 1000) {
            bonificacion = 100.00;    
        } else {
            bonificacion = 150.00;     
        }   
        double pagoObrero = pagoProducto * unidadesProducidas;
        double pagoObreroMasBonificacion = pagoObrero + bonificacion;
        double totalIngresos = pagoObreroMasBonificacion - 75;
        
        System.out.println("El pago de un obrero sin bonificacion es de: " + pagoObrero);
        System.out.println("El pago de un obrero con bonificación es de: " + pagoObreroMasBonificacion);
        System.out.println("El pago de un obrero total - seguro: " + totalIngresos);
        */
        
        
    }    
}


