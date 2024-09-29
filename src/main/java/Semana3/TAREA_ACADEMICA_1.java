package Semana3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TAREA_ACADEMICA_1 {
    public static void main(String[] args) {
        // HOJA - PROPUESTO-MIENTRAS
        // =====================================================================
        // EJERCICIO 9
        
    }
}


        

        // EJERCICIO 1
        /*
        int num = 20;
        while(num < 81){
            System.out.println("El número natural es de: " + num);
            num++;   
        }
        */

        // EJERCICIO 2
        /*
        int num = 40;
        while(num > 9){
            System.out.println("El número natural es de: " + num);
            num--;
        }
        */

        // EJERCICIO 3
        /*
        double num = 0;
        Scanner t = new Scanner (System.in);
        do{
            System.out.println("Imgrese un número y 0 para salir");
            num= t.nextDouble();
            num = num / 2;
            System.out.println("La mitad del número ingresado es de: " + num);
        }while(num != 0);
        */

        // EJERCICIO 4
        /*
        int num;
        Scanner t = new Scanner (System.in);
        do{
            System.out.println("Ingrese un número natural");
            num = t.nextInt();
            do{
                num--;
                System.out.println("El número es: " + num);
            }while(num > 1);
        }while(num != 1);
        */

        // EJERCICIO 5
        /*
        int num = 3;
        while(num != 153){
            System.out.println("Multiplo de 3 es: " + num);
            num=num+3;
        }
        */

        // EJERCICIO 6
        /*
        int num = 59,aux = 0;
        while(num > 0){
            aux = aux + 1;
            System.out.println("El número impar " + aux + " generado es de: " + num);
            num = num - 2;
        }
        */

        // EJERCICIO 7
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un número natural: ");
        int num = scanner.nextInt();
        scanner.close();
        int factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }   
        System.out.println("El factorial de " + num + " es: " + factorial);
        */

        // EJERCICIO 8
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número natural: ");
        int num = scanner.nextInt();
        scanner.close();
        int divisor = 1;  
        System.out.println("Los divisores de " + num + " son:"); 
        while (divisor <= num) {
            if (num % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }
        */

        // EJERCICIO 9
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el multiplicando: ");
        int multiplicando = scanner.nextInt();
        System.out.print("Digite el multiplicador: ");
        int multiplicador = scanner.nextInt();
        scanner.close();
        
        int producto = 0;
        int contador = 0;
        
        while (contador < multiplicador) {
            producto += multiplicando;
            contador++;
        }
        
        System.out.println("El producto de " + multiplicando + " y " + multiplicador + " es: " + producto);
        */

        // EJERCICIO 10
        /*
        System.out.println("Sexagesimales\tCentesimales\tRadianes");       
        int grados = 30;      
        while (grados <= 60) {
            double centesimales = grados * 0.9;
            double radianes = Math.toRadians(grados);    
            int centesimalesRedondeados = (int) Math.round(centesimales);
            int radianesRedondeados = (int) Math.round(radianes);
            System.out.println(grados + "\t\t" + centesimalesRedondeados + "\t\t" + radianesRedondeados);
            grados++;
        }
        */

        // EJERCICIO 11
        /*
        System.out.println("Número\t\tMitad\t\tCuadrado\tTriple");       
        int numero = 1;  
        while (numero <= 15) {
            double mitad = numero / 2.0;
            int cuadrado = numero * numero;
            int triple = numero * 3;    
            System.out.println(numero + "\t\t" + mitad + "\t\t" + cuadrado + "\t\t" + triple);
            numero++;
        }
        */

// HOJA - PROPUESTO-MIENTRAS
        // =====================================================================
        // EJERCICIO 1
        /*
        // a) Suma de la serie 3 + 5 + 7 + ... + 81
        int sumaA = 0;
        int numA = 3;
        int contadorA = 0;
        while (numA <= 81) {
            sumaA += numA;
            numA += 2;
            contadorA++;
        }
        System.out.println("La suma de la serie A es: " + sumaA);
        System.out.println("La cantidad de números en la serie A es: " + contadorA);

        // b) Suma de la serie 5 + 10 + 15 + ... + num
        int numB = 50;  // Puedes cambiar este valor
        int sumaB = 0;
        int iB = 5;
        while (iB <= numB) {
            sumaB += iB;
            iB += 5;
        }
        System.out.println("La suma de la serie B es: " + sumaB);

        // c) Suma de la serie 0.2 + 0.4 + 0.6 + ... (n términos)
        int nC = 10;  // Puedes cambiar este valor
        double sumaC = 0.0;
        double iC = 0.2;
        int contadorC = 0;
        while (contadorC < nC) {
            sumaC += iC;
            iC += 0.2;
            contadorC++;
        }
        System.out.println("La suma de la serie C es: " + sumaC);

        // d) Suma de la serie 1/2 + 1/3 + 1/4 + ... (n términos)
        int nD = 10;  // Puedes cambiar este valor
        double sumaD = 0.0;
        int iD = 2;
        int contadorD = 0;
        while (contadorD < nD) {
            sumaD += 1.0 / iD;
            iD++;
            contadorD++;
        }
        System.out.println("La suma de la serie D es: " + sumaD);
        */

        // EJERCICIO 2
        /*
         Scanner scanner = new Scanner(System.in);
    
        double sumaTallas = 0.0;
        int contador = 0;
        
        System.out.print("Digite la talla del postulante " + (contador + 1) + ": ");
        double talla = scanner.nextDouble();
        
        while (talla != 0) {
            sumaTallas += talla;
            contador++;
            
            System.out.print("Digite la talla del postulante " + (contador + 1) + ": ");
            talla = scanner.nextDouble();
        }
        scanner.close();
        
        double promedioTallas = sumaTallas / contador;
        
        System.out.println("Datos ingresados: " + contador);
        System.out.println("Talla Promedio => " + promedioTallas);
        */

        // EJERCICIO 3
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un número natural: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int sumaDigitos = 0;
        int productoDigitos = 1;
        
        while (num > 0) {
            int digito = num % 10;
            sumaDigitos += digito;
            productoDigitos *= digito;
            num /= 10;
        }
        
        System.out.println("La suma de los dígitos es: " + sumaDigitos);
        System.out.println("El producto de los dígitos es: " + productoDigitos);
        */

        // EJERCICIO 5
/*
        System.out.println("Ángulo\tSeno\tRaíz");
        
        int contador = 0;
        Random random = new Random();
        
        while (contador < 20) {
            int angulo = random.nextInt(61) + 30;
            double seno = Math.sin(Math.toRadians(angulo));
            double raiz = Math.sqrt(angulo);
            
            System.out.printf("%d\t%.4f\t%.2f%n", angulo, seno, raiz);
            
            contador++;
        }
        */

        // EJERCICIO 6
        /*
        // Definir la lista de notas de los alumnos
        List<Integer> notas = new ArrayList<>();
        notas.add(55);
        notas.add(34);
        // Agrega aquí las notas de los 25 alumnos

        // Contadores para alumnos aprobados y desaprobados
        int aprobados = 0;
        int desaprobados = 0;

        // Calcular el promedio de las notas y determinar si el alumno está aprobado o desaprobado
        int i = 0;
        while (i < notas.size()) {
            int nota = notas.get(i);
            if (nota >= 10) {
                aprobados++;
            } else {
                desaprobados++;
            }
            i++;
        }

        // Calcular los porcentajes
        int totalAlumnos = notas.size();
        double porcentajeAprobados = (aprobados / (double) totalAlumnos) * 100;
        double porcentajeDesaprobados = (desaprobados / (double) totalAlumnos) * 100;

        // Mostrar los resultados
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Número de desaprobados: " + desaprobados);
        System.out.println("Porcentaje de desaprobados: " + porcentajeDesaprobados + "%");
        */
        
        // EJERCICIO 7
        /*
        int[] velocidades = new int[20];
        int contador = 0;
        int i = 0;

        Random random = new Random();
        while (i < 20) {
            int velocidad = random.nextInt(61) + 30;  // Generar un número aleatorio entre 30 y 90
            velocidades[i] = velocidad;
            if (velocidad > 60) {
                contador++;
            }
            i++;
        }

        System.out.println("Nro Velocidad Exceso");
        int j = 1;
        while (j <= velocidades.length) {
            if (velocidades[j - 1] > 60) {
                System.out.println(j);
            }
            j++;
        }

        System.out.println("Nro de autos con papeletas => " + contador);
        */

        // EJERCICIO 8
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo: ");
        double monto = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de meses a pagar: ");
        int meses = scanner.nextInt();

        double cuota = monto * 0.01;  // Calcular la cuota mensual

        System.out.println("Mes\tCuota\tSaldo");
        int mes = 1;
        double saldo = monto;

        while (mes <= meses) {
            System.out.printf("%d\t%.2f\t%.2f\n", mes, cuota, saldo);
            saldo -= cuota;
            mes++;
        }
        */

        // EJERCICIO 9
        /*
        int velocidadPromedio = 55;
        int horas = 4;
        double distancia = 0;
        double tiempo = 0.5;

        System.out.println("Tiempo (horas)\tDistancia (km)");

        while (tiempo <= horas) {
            distancia = velocidadPromedio * tiempo;
            System.out.printf("%.1f\t\t%.1f\n", tiempo, distancia);
            tiempo += 0.5;
        }
        */
    