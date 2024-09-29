package Semana2;
import java.util.Scanner;
public class TAREA_condicionales_dobles {

    public static void main(String[] args) {
        // EJERCICIO 1 - CONDICIONAL-DOBLE 
        /*
        int precioDocenas = 0, cantidadDocenas = 0,lapiceros;
        double descuento,totalPagar;
        Scanner t = new Scanner (System.in);
        System.out.println("Ingrese la candidad de docenas");
        cantidadDocenas = t.nextInt();
        System.out.println("Ingrese la precio por docena");
        precioDocenas = t.nextInt();
        if (cantidadDocenas >= 10) {
            descuento = precioDocenas * 0.15;
        }else{
            descuento = precioDocenas * 0.11;
        }
        if (precioDocenas >= 200) {
            lapiceros = 2 * cantidadDocenas;
        }else{
            lapiceros = 0;
        }
        totalPagar = precioDocenas - descuento;
        
        System.out.println("El importe de la compra fue de: " + precioDocenas);
        System.out.println("El importe del descuento fue de: " + descuento);
        System.out.println("El importe a pagar es de: " + totalPagar);
        System.out.println("La cantidad de lapiceros obsequiados son de: " + lapiceros);
        */
       
        // EJERCICIO 2 - CONDICIONAL-DOBLE
        /*
        double precio = 0;
        String turno;
        int cantidadPasajes = 0,caramelos;
        double descuento,importePagar = 0,totalPagar;
        
        Scanner t = new Scanner (System.in);
        System.out.println("Ingrese el turno: \"m\" o \"n\"");
        turno = t.next();
        System.out.println("Ingrese cantidad de pasajes");
        cantidadPasajes = t.nextInt();
        
        if (turno.equalsIgnoreCase("m")) {
            precio = 37.5;
        }else{
            precio = 45.0;
        }
        if (cantidadPasajes >= 15) {
            descuento = cantidadPasajes * 0.08;
        }else{
            descuento = cantidadPasajes * 0.05;
        }
        importePagar = precio * cantidadPasajes;
        if (importePagar > 200) {
            caramelos = 2 * cantidadPasajes;
        }else{
            caramelos = 0;
        }
        
        totalPagar = importePagar - descuento;
        
        System.out.println("El importe de la compra fue de: " + importePagar);
        System.out.println("El importe del descuento fue de: " + descuento);
        System.out.println("El importe a pagar es de: " + totalPagar);
        System.out.println("La cantidad de caramelos obsequiados son de: " + caramelos);
        */
        
        // EJERCICIO 3 - CONDICIONAL-DOBLE
        /*
        double tarifaHoraria = 0;
        String categoria;
        int numeroHijos = 0,caramelos,cantidadHoras;
        double bonificacion,descuento,sueldoBruto=0,sueldoBasico=0,sueldoNeto=0;
        
        Scanner t = new Scanner (System.in);
        System.out.println("Ingrese la categoria: A , B");
        categoria = t.next();
        System.out.println("Ingrese la cantidad de horas trabajadas");
        cantidadHoras = t.nextInt();
        System.out.println("Ingrese la cantidad de hijos");
        numeroHijos = t.nextInt();
        
        if (categoria.equalsIgnoreCase("A")) {
            tarifaHoraria = 45.0;
        }else{
            tarifaHoraria = 37.5;
        }
        sueldoBasico = tarifaHoraria * cantidadHoras;
        if (numeroHijos <= 3) {
            bonificacion = numeroHijos * 40.5;
        }else{
            bonificacion = numeroHijos * 35.0;
        }
        sueldoBruto = sueldoBasico + bonificacion;
        if (sueldoBruto >= 3500) {
            descuento = 2 * sueldoBruto * 0.135;
        }else{
            descuento = 2 * sueldoBruto * 0.100;
        }
        sueldoNeto = sueldoBruto - descuento;
        
        System.out.println("El sueldo básio es de: " + sueldoBasico);
        System.out.println("El sueldo bruto es de: " + sueldoBruto);
        System.out.println("El descuento es de: " + descuento);
        System.out.println("El sueldo Neto es de: " + sueldoNeto);
        */
        
        // EJERCICIO 4 - CONDICIONAL-DOBLE
        /*
        int sueldoBasico=600,importeTotal=0,numeroHijos;
        double descuento,comision,bonificacion,sueldoBruto,sueldoNeto;
        
        Scanner t = new Scanner (System.in);
        System.out.println("Ingrese el importe total Vendido: ");
        importeTotal = t.nextInt();
        System.out.println("Ingrese el número de hijos: ");
        numeroHijos = t.nextInt();
        
        if (importeTotal > 15000) {
            comision = importeTotal * 0.07;
        }else{
            comision = importeTotal * 0.05;
        }
        if (numeroHijos < 5) {
            bonificacion = 25 * numeroHijos;
        }else{
            bonificacion = 22 * numeroHijos;
        }
        sueldoBruto = sueldoBasico + comision + bonificacion;
        if (sueldoBruto > 3500) {
            descuento = 0.15 * sueldoBruto; 
        }else{
            descuento = 0.11 * sueldoBruto; 
        }
        sueldoNeto = sueldoBruto - descuento;
        System.out.println("El sueldo básico es de: " + sueldoBasico);
        System.out.println("La comision es de: " + comision);
        System.out.println("La bonificación es de: " + bonificacion);
        System.out.println("El sueldo bruto es de: " + sueldoBruto);
        System.out.println("El descuento es de: " + descuento);
        System.out.println("El sueldo neto es de: " + sueldoNeto);
        */
        
        // EJERCICIO 5 - CONDICIONAL-DOBLE
        /*
        int montoDonacion;
        double centroSalud,comedorNinos,bolsa;
        
        Scanner t = new Scanner (System.in);
        System.out.println("Ingrese el monto de la donación");
        montoDonacion = t.nextInt();
        
        if (montoDonacion >= 10000) {
            centroSalud = montoDonacion * 0.30;
            comedorNinos = 0.5 * montoDonacion;
            bolsa = montoDonacion - (centroSalud + comedorNinos);
        }else{
            centroSalud = montoDonacion * 0.25;
            comedorNinos = montoDonacion * 0.60;
            bolsa = montoDonacion - (centroSalud + comedorNinos);
        }
        System.out.println("El monto que recibira el centor de salud es de: " + centroSalud);
        System.out.println("El monto que recibira el comedor de niños es de: " + comedorNinos);
        System.out.println("El monto que recibira la bolsa es de: " + bolsa);
        */       
        
        
        // EJERCICIO 6 - CONDICIONAL-MULTIPLE(NO ME SALIA CON CONDICIONAL DOBLE)
        /*
        int edad;
        String sexo, categoria;
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese el sexo (m = masculino, f = femenino):");
        sexo = t.next();

        System.out.println("Ingrese la edad:");
        edad = t.nextInt();

        if (sexo.equalsIgnoreCase("f") && edad < 23) {
            categoria = "FA";
        } else if (sexo.equalsIgnoreCase("f") && edad >= 23) {
            categoria = "FB";
        } else if (sexo.equalsIgnoreCase("m") && edad < 25) {
            categoria = "MA";
        } else if (sexo.equalsIgnoreCase("m") && edad >= 25) {
            categoria = "MB";
        } else {
            categoria = "Categoría no válida";
        }

        System.out.println("La categoría del postulante es: " + categoria);
        */
        
        // EJERCICIO 7 - CONDICIONAL DOBLE
        /*
        int cantidadPaquetes;
        double precioNormal;
        Scanner t = new Scanner (System.in);
        System.out.println("Ingrese el precio normal del paquete");
        precioNormal = t.nextInt();
        System.out.println("Ingrese la cantidad de paquetes");
        cantidadPaquetes = t.nextInt();
        if (cantidadPaquetes <= 20) {
            precioNormal = cantidadPaquetes;
        }else{
            precioNormal = cantidadPaquetes * 0.85;
        }
        if (cantidadPaquetes > 50) {
            cantidadPaquetes = cantidadPaquetes + 2;
        }
        System.out.println("El importe a pagar es de: " + precioNormal);
        System.out.println("La cantidad de paquetes que recibirá es de: " + cantidadPaquetes);
        */

        
}
    
}
