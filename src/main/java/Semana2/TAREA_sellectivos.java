package Semana2;
import java.util.Scanner;
public class TAREA_sellectivos {

    public static void main(String[] args) {
        // EJERCICIO 1 - PROGRAMA MOCHILA - (SELECTIVOS)
        /*
        int modelo = 0,cantidadMochilas = 0,chocolatesObsequio = 0;
        double descuento = 0,importePagar = 0,importeCompra = 0;
        
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el número del modelo de la mochila");
        System.out.println("1 - Sherman");
        System.out.println("2 - Faguo");
        System.out.println("3 - Aldo");
        System.out.println("4 - Suburban");
        modelo = t.nextInt();
        System.out.println("Ingrese la cantidad de mochilas que desea comprar");
        int cantidadMochila = t.nextInt();
        double precioMochila = switch (modelo){
            case 1 -> 149.9;
            case 2 -> 89.9;
            case 3 -> 119.9;
            case 4 -> 174.9;
            default -> 0;
        };
        importeCompra = precioMochila * cantidadMochila;
        //Descuento
        if (cantidadMochila < 5) {
            descuento = 0;
        }else if(cantidadMochila >= 5 && cantidadMochila < 10){
            descuento = importeCompra * 0.05;
        }else if(cantidadMochila >= 10 && cantidadMochila < 20){
            descuento = importeCompra * 0.07;
        }else{
            descuento = importeCompra * 0.09;
        }
        importePagar = importeCompra - descuento;
        //Obsequio
        if(importePagar < 200){
            chocolatesObsequio = 0;
        }else if(importePagar >= 200 && importePagar < 500){
            chocolatesObsequio = 1;
        }else if(importePagar >= 500 && importePagar < 700){
            chocolatesObsequio = 2;
        }else{
            chocolatesObsequio = 3;
        }
        
        System.out.println("El importe de la compra es de: " + importeCompra);
        System.out.println("El importe del descuento es de: " + descuento);
        System.out.println("El importe a pagar es de: " + importePagar);
        System.out.println("La cantidad de chocolates de obsequiados es de: " + chocolatesObsequio);
        */
        
        // EJERCICIO 2 - PROGRAMA LIBRERÍA - (SELECTIVOS)
        /*
        int cantidadCuadernos = 0;
        double importeCompra = 0,importeDescuento = 0,importePagar = 0,descuento = 0;
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el tipo de cuaderno segun la sgte categoría: ");
        System.out.println("1 - Standford");
        System.out.println("2 - Alpha");
        System.out.println("3 - Justus");
        System.out.println("4 - Loro");
        int tipoCuaderno = t.nextInt();
        System.out.println("Ingrese la cantidad de cuadernos que desea comprar");
        cantidadCuadernos = t.nextInt();
        double precioCuaderno = switch (tipoCuaderno){
            case 1 -> 4.85;
            case 2 -> 4.35;
            case 3 -> 3.50;
            case 4 -> 4.55;
            default -> 0;
        };
        importeCompra = precioCuaderno * cantidadCuadernos;
        //Descuento
        if(cantidadCuadernos >= 36){
            importeDescuento = importeCompra * 0.135;
        }else if(cantidadCuadernos >= 24 && cantidadCuadernos < 36){
            importeDescuento = importeCompra * 0.115;
        }else if(cantidadCuadernos >= 12 && cantidadCuadernos < 24){
            importeDescuento = importeCompra * 0.095;
        }else{
            importeDescuento = importeCompra * 0.075;
        }
        importePagar = importeCompra - importeDescuento;
        
        System.out.println("El importe de la compra es de: " + importeCompra);
        System.out.println("El importe del descuento es de: " + importeDescuento);
        System.out.println("El importe a pagar es de: " + importePagar);
        */
        
        // EJERCICIO 3 - PROGRAMA HOTEL - (SELECTIVOS)
        /*
        double importeSubtotal,importeDescuento,importeTotal;
        int lapiceros;
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el tipo de habitación segun la sgte categoría: ");
        System.out.println("1 - Simple");
        System.out.println("2 - Matrimonial");
        System.out.println("3 - Doble");
        System.out.println("4 - Triple");
        int tipoHabitacion = t.nextInt();
        System.out.println("Ingrese la cantidad de días que desea hospedar");
        int diasHospedados = t.nextInt();
        
        double precioHabitacion = switch (tipoHabitacion){
            case 1 -> 80.0;
            case 2 -> 130.0;
            case 3 -> 140.0;
            case 4 -> 180.0;
            default -> 0;
        };
        importeSubtotal = precioHabitacion * diasHospedados;
        //Descuento
        if(diasHospedados >= 12){
            importeDescuento = importeSubtotal * 0.075;
        }else if(diasHospedados >= 6 && diasHospedados < 12){
            importeDescuento = importeSubtotal * 0.05;
        }else if(diasHospedados >= 3 && diasHospedados < 6){
            importeDescuento = importeSubtotal * 0.025;
        }else{
            importeDescuento = importeSubtotal * 0;
        }
        importeTotal = importeSubtotal - importeDescuento;
        //Obsequio
        if(importeTotal < 100){
            lapiceros = 2;
        }else if(importeTotal >= 100 && importeTotal < 150){
            lapiceros = 3;
        }else{
            lapiceros = 4;
        }
        System.out.println("El importe subtotal es de: " + importeSubtotal);
        System.out.println("El importe del descuento es de: " + importeDescuento);
        System.out.println("El importe total es de: " + importeTotal);
        System.out.println("La cantidad de lapiceros de obsequiados es de: " + lapiceros);
        */
    }
    
}
