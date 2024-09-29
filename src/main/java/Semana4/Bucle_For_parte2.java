package Semana4;

import java.util.Scanner;

public class Bucle_For_parte2 {
    static String nombre;
    static double saldo;
    static int cantidadDepositos;
    static int cantidadRetiros;

    public static void main(String[] args) {
        
        
    }
}
        // EJERCICIO 1 (PRIMERA FORMA)
        /*
        String ape = "", nomb = "", tipo = null;
       double sueldo = 0, desto, total;
       int opc, valida;
       Scanner t = new Scanner(System.in);
       do {
           System.out.println("**********************");
           System.out.println("*   Menu OPcion      *");
           System.out.println("**********************");
           System.out.println("1.-Ingresar Empleado  ");
           System.out.println("2.-Ingresar Salario   ");
           System.out.println("3.-Emitir Boleta      ");
           System.out.println("4.-Salir              ");
           System.out.print("ingrese opcion=>");
           opc = t.nextInt();
           switch (opc) {
               case 1:
                   System.out.print("Nombre:");
                   nomb = t.next();
                   System.out.println("Apellido:");
                   ape = t.next();
                   do {
                       System.out.print("Tipo contrato|estable:");
                       tipo = t.next().toLowerCase();
                       valida = "contratoestable".indexOf(tipo);
                   } while (valida < 0);
                   break;
               case 2:
                   do {
                       System.out.println("sueldo:");
                       sueldo = t.nextDouble();
                   } while (sueldo < 750);
                   break;
               case 3:
                   if (nomb.length() > 0 && ape.length() > 0 && sueldo > 0) {
                       System.out.println("*********************");
                       System.out.println("* Boleta de Pago    *");
                       System.out.println("*********************");
                       System.out.println("Apellido " + ape);
                       System.out.println("Nombre " + nomb);
                       System.out.println("tipo  " + tipo);
                       System.out.println("Salario:Ene " + sueldo + " Salario :Feb " + sueldo);
                       System.out.println("Salario:Mar " + sueldo + " Salario :Abr " + sueldo);
                       System.out.println("Salario:May " + sueldo + " Salario :Jun " + sueldo);
                       System.out.println("Salario:Jul " + sueldo + " Salario :Agos " + sueldo);
                       System.out.println("Salario:Set " + sueldo + " Salario :Oct " + sueldo);
                       System.out.println("Salario:Nov " + sueldo + " Salario :dic " + sueldo);
                       total=sueldo*12; desto=0.05*total;
                       System.out.println("Tota   "+total);
                       System.out.println("descuento  "+desto);
                   } else {
                       System.out.println("Datos incompletos");
                   }break;
            }
         
       }while (opc != 4);
       */
        
        // MISMO EJERCICIO (CON FUNCIONES)
        /*
        static String ape = "", nomb = "", tipo = "";
        static double sueldo = 0, desto, total;
        static int opc, valida;
        static Scanner t = new Scanner(System.in);

        static void ingreso1() {
            System.out.print("Nombre:");
            nomb = t.next();
            System.out.println("Apellido:");
            ape = t.next();
            do {
                System.out.print("Tipo contrato|estable:");
                tipo = t.next().toLowerCase();
                valida = "contratoestable".indexOf(tipo);
            } while (valida < 0);
        }

        static void ingreso2() {
            do {
                System.out.println("sueldo:");
                sueldo = t.nextDouble();
            } while (sueldo < 750);
        }

        static void boleta() {
            if (nomb.length() > 0 && ape.length() > 0 && sueldo > 0) {
                System.out.println("*********************");
                System.out.println("* Boleta de Pago    *");
                System.out.println("*********************");
                System.out.println("Apellido " + ape);
                System.out.println("Nombre " + nomb);
                System.out.println("tipo  " + tipo);
                System.out.println("Salario:Ene " + sueldo + " Salario :Feb " + sueldo);
                System.out.println("Salario:Mar " + sueldo + " Salario :Abr " + sueldo);
                System.out.println("Salario:May " + sueldo + " Salario :Jun " + sueldo);
                System.out.println("Salario:Jul " + sueldo + " Salario :Agos " + sueldo);
                System.out.println("Salario:Set " + sueldo + " Salario :Oct " + sueldo);
                System.out.println("Salario:Nov " + sueldo + " Salario :dic " + sueldo);
                total = sueldo * 12;
                desto = 0.05 * total;
                System.out.println("Tota   " + total);
                System.out.println("descuento  " + desto);
            } else {
                System.out.println("Datos incompletos");
            }
        }

        // public static void main(String[] args) 
            do {
                System.out.println("**********************");
                System.out.println("*   Menu OPcion      *");
                System.out.println("**********************");
                System.out.println("1.-Ingresar Empleado  ");
                System.out.println("2.-Ingresar Salario   ");
                System.out.println("3.-Emitir Boleta      ");
                System.out.println("4.-Salir              ");
                System.out.print("ingrese opcion=>");
                opc = t.nextInt();
                switch (opc) {
                    case 1:
                        ingreso1();
                        break;
                    case 2:
                        ingreso2();
                        break;
                    case 3:
                         boleta();
                        break;
                }
            }while (opc != 4);
        */
        
        // EJERCICIO 3
        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        */
        
        