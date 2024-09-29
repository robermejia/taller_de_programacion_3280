package Semana1;

import java.util.Scanner;

public class TAREA_ejercicios_de_tipo_secuencial {

    public static void main(String[] args) {
        /*
        //EJERCICIO1
        double b,ah,an,are, vol;
        Scanner t=new Scanner(System.in);
        System.out.print("ingrese base:");
        b=t.nextDouble();
        System.out.print("ingrese ancho:");
        an=t.nextDouble();
        System.out.print("ingrese altura:");
        ah=t.nextDouble();
        //proceso
        are=b*an;
        vol=are*ah/3;
        System.out.printf("area =%.2f  volumen=%.2f",are,vol);  
        */

        /*
        //EJERCICIO2
        double monto,jose,dani,tamar,caleb,david;
        Scanner t=new Scanner(System.in);
        System.out.print("monto a repartir:");
        monto=t.nextDouble();
        jose=0.27*monto;
        dani=0.25*monto;
        tamar=0.85*jose;
        caleb=0.23*(dani+jose);
        david=monto-(jose+dani+tamar+caleb);
        System.out.println("joseu="+jose);
        System.out.println("daniel="+dani);
        System.out.println("tamar="+tamar);
        System.out.println("caleb="+caleb);
        System.out.println("david="+david);
        */

        /*
        //EJERCICIO3
        String producto;
        int importe, cant;
        double descuento,total;
         
        Scanner t=new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        producto=t.next();
        System.out.println("Ingrese el monto del producto");
        importe=t.nextInt();
        System.out.println("Ingrese la cantidad de producto");
        cant=t.nextInt();
        
        descuento=cant *(importe * 0.11);
        total=cant*(importe - (importe * 0.11));
        System.out.println("El importe por " + cant +  " de " + producto + " es " + total);
        System.out.println("Y el descuento total es de: " + descuento);
        */

        /*
        //EJERCICIO4
        int cant, precio;
        double importe,importePagar,desc1,desc2,desct;
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el precio de la camisa");
        precio = t.nextInt();
        System.out.println("Ingrese la cantidad de camisas");
        cant = t.nextInt();
        
        importe = cant * precio;
        desc1 = importe * 0.07;
        desc2 = (importe - desc1) * 0.07;
        desct = desc1 + desc2;
        importePagar = importe - desct;
        
        System.out.println("El importe de compra es de: " + importe);
        System.out.printf("""
                          El primer importe del descuento es de %.2f
                          El segundo importe del descuento es de %.2f
                          El importe del descuento total es de %.2f
                          El importe a pagar es de %.2f""", desc1, desc2,desct,importePagar);
        */

        /*
        //EJERCICIO5
        int horasTrabajadas;
        double tarifaHoras,sueldoBasico,bonificacion,sueldoBruto,descuento,sueldoNeto;
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cuantas son las horas trabajadas?");
        horasTrabajadas=s.nextInt();
        System.out.println("¿Dime cúal es la tarifa por hora?");
        tarifaHoras=s.nextInt();
        sueldoBasico = horasTrabajadas * tarifaHoras;
        bonificacion = sueldoBasico * 0.20;
        sueldoBruto = sueldoBasico + bonificacion;
        descuento = sueldoBruto * 0.10;
        sueldoNeto = sueldoBruto - descuento;
        
        System.out.printf("""
                          El sueldo básico es de: %.2f
                          La bonificación es de: %.2f
                          El sueldo bruto es de: %.2f
                          El descuento es de: %.2f
                          El sueldo neto es de: %.2f
                          """, sueldoBasico,bonificacion,sueldoBruto,descuento,sueldoNeto);
        */

        /*
        //EJERCICIO6
        int debora,raquel,sefora,montoTotal;
        double porcentaje1,porcentaje2,porcentaje3,porcentajeTotal;
        Scanner s = new Scanner(System.in);
        System.out.println("Monto de Débora: ");
        debora=s.nextInt();
        System.out.println("Monto de Raquel: ");
        raquel=s.nextInt();
        System.out.println("Monto de Séfora: ");
        sefora=s.nextInt();
        montoTotal = debora + raquel + sefora;
        porcentajeTotal = 100.0;
        porcentaje1 = (debora * porcentajeTotal) / montoTotal;
        porcentaje2 = (raquel * porcentajeTotal) / montoTotal;
        porcentaje3 = (sefora * porcentajeTotal) / montoTotal;
        
        System.out.printf("""
                          El monto que dio Débora fue de: s/. %d, el porcentaje que dio fue de: %.2f%%
                          El monto que dio Raquel fue de: s/. %d, el porcentaje que dio fue de: %.2f%%
                          El monto que dio Séfora fue de: s/. %d, el porcentaje que dio fue de: %.2f%%
                          El monto total que dio Débora, Raquel y Séfora es: s/. %d, el porcentaje es de: %.2f%% 
                          """, debora,porcentaje1,raquel,porcentaje2,sefora,porcentaje3,montoTotal,porcentajeTotal);
        */
     
        /*
        //EJERCICIO7
        int cantidadDinero,edad1,edad2,edad3;
        double montoPersona1,montoPersona2,montoPersona3;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero");
        cantidadDinero = s.nextInt();
        System.out.println("Ingrese la edad de la persona 1");
        edad1 = s.nextInt();
        System.out.println("Ingrese la edad de la persona 2");
        edad2 = s.nextInt();
        System.out.println("Ingrese la edad de la persona 3");
        edad3 = s.nextInt();
        
        montoPersona1 = (edad1 * cantidadDinero) / (edad1 + edad2 + edad3);
        montoPersona2 = (edad2 * cantidadDinero) / (edad1 + edad2 + edad3);
        montoPersona3 = (edad3 * cantidadDinero) / (edad1 + edad2 + edad3);
        
        System.out.printf("""
                           El monto total es de: %d
                           La persona 1 tiene una edad de: %d y le corresponde: %.2f
                           La persona 2 tiene una edad de: %d y le corresponde: %.2f
                           La persona 3 tiene una edad de: %d y le corresponde: %.2f
                           """,cantidadDinero,edad1,montoPersona1,edad2,montoPersona2,edad3,montoPersona3);
        */
        
        
        //EJERCICIO8
        int donacion;
        double centroSalud,comedor,biblioteca,escuela,asiloAncianos;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de la donación");
        donacion = s.nextInt();
        
        centroSalud = donacion * 0.25;
        escuela = donacion * 0.35;
        comedor = escuela * 0.45;
        biblioteca = (comedor + escuela) * 0.17;
        asiloAncianos = donacion - (centroSalud + comedor + escuela + biblioteca);
        
        System.out.printf("""
                          El total de la donación es de: $%d
                          Al centro de salud le corresponde recibir el monto de: $%.2f
                          Al comedor le corresponde recibir el monto de: $%.2f
                          A la biblioteca le corresponde recibir el monto de: $%.2f
                          A la escuela le corresponde recibir el monto de: $%.2f
                          Al asilo de ancianos le corresponde recibir el monto de: $%.2f
                          """, donacion, centroSalud, comedor, biblioteca, escuela, asiloAncianos);
    }
    
}
