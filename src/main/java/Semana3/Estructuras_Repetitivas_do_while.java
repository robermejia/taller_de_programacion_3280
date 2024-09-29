package Semana3;
import java.util.Scanner;
public class Estructuras_Repetitivas_do_while {

    public static void main(String[] args) {
        // EJERCICIO 1
        /*
        Scanner t=new Scanner(System.in);
        int num,sm,res;
        System.out.println("ingrese un numero entero de cualquier longitud:");
        num=t.nextInt();
        sm=0;
        while(num>0){
          res=num%10;  
           sm=sm+res;
           num=num/10;
        }
        System.out.println("la suma de digitos :"+sm);
        */
        
        // EJERCICIO 2
        /*
        int num,sm=0;
        String res="";
        boolean continua;
        do{
            do{
                System.out.print("ingrese un numero de 1-100:");
                num=t.nextInt();
            }while(num<1||num>100);
            sm=sm+num;
            System.out.print("continua si o No:");
            res=t.next().toLowerCase();
            continua=res.equals("si");
        }while(continua);
        System.out.println("la suma es :"+sm);
        */
        
        // EJERCICIO 3
        /*
        Scanner t=new Scanner(System.in);
         int nota, sm=0, can=0,cap=0,cds=0;
         do{
             System.out.print("ingrese nota [-1=salir]:"); 
             nota=t.nextInt();
             if(nota>=0 && nota<=20){
              //si esta entre 0-20 contar y sumar
                sm=sm+nota; can++;
                if(nota>=12)cap++; else cds++;
             }
          }while(nota!= -1);
         double pg=sm/can;
         System.out.println("promedio global:"+pg);
         System.out.println("cantidad aprobados:"+cap);
         System.out.println("cantidad desaprobados::"+cds);
        */
        
        // EJERCICIO 4
        /*
        Scanner t=new Scanner(System.in);
        int intentos=1;
        String clave="";
        do{
            System.out.print("ingrese password:");
            clave=t.next();
            if(clave.equals("P@55w0rd")){
                System.out.println("Bienvenido al sistema");
                break;
             }else{
                System.out.println("Clave incorrecta");
            }
            intentos++;
        }while(intentos<=5);
        
        if(intentos>5)
            System.out.println("cuenta suspendida ");
        */
        
        // EJERCICIO 5
        double prestamo=14000;
        int mes=24;
        double interes=prestamo*mes*0.04;
        double saldo=prestamo+interes;
        double cuota=saldo/mes;
        System.out.println("mes\tcuota\tsaldo");
        int m=1;
        while(m<=mes){
            saldo=saldo-cuota;
            System.out.printf("%2d  %6.2f  %8.2f\n",m,cuota,saldo);
            m++;
        }
        
    }
    
}
