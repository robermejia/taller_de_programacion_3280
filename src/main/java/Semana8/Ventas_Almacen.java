/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana8;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ventas_Almacen {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer las ventas mensuales de los 10 almacenes
        double[] ventas = new double[10];
        double sumaVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese las ventas mensuales del almacén " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
            sumaVentas += ventas[i];
        }
        
        // Calcular la media de las ventas
        double mediaVentas = sumaVentas / ventas.length;
        
        // Identificar los almacenes cuyas ventas mensuales son superiores a la media
        System.out.println("Almacenes cuyas ventas mensuales son superiores a la media:");
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > mediaVentas) {
                System.out.println("Almacén " + (i + 1) + ": " + ventas[i]);
            }
        }
        
        // Encontrar la mayor y la menor venta
        double mayorVenta = ventas[0];
        double menorVenta = ventas[0];
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > mayorVenta) {
                mayorVenta = ventas[i];
            }
            if (ventas[i] < menorVenta) {
                menorVenta = ventas[i];
            }
        }
        
        System.out.println("La mayor venta es: " + mayorVenta);
        System.out.println("La menor venta es: " + menorVenta);
        
        scanner.close();
    } 
}
