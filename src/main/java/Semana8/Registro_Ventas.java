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
public class Registro_Ventas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir un arreglo para almacenar las ventas por día de la semana
        double[] ventasSemanales = new double[7];
        
        // Leer el monto total de las ventas por día durante una semana
        for (int i = 0; i < ventasSemanales.length; i++) {
            System.out.print("Ingrese el monto total de las ventas para el día " + (i + 1) + ": ");
            ventasSemanales[i] = scanner.nextDouble();
        }
        
        // Encontrar el día de la semana en que se realizó la mayor venta
        double mayorVenta = ventasSemanales[0];
        int diaMayorVenta = 1; // Inicializamos con el primer día (lunes)
        for (int i = 1; i < ventasSemanales.length; i++) {
            if (ventasSemanales[i] > mayorVenta) {
                mayorVenta = ventasSemanales[i];
                diaMayorVenta = i + 1; // Sumamos 1 porque los días comienzan desde 1 (lunes)
            }
        }
        
        // Imprimir el resultado
        System.out.println("El día de la semana en que se realizó la mayor venta es el día " + diaMayorVenta);
    }  
}
