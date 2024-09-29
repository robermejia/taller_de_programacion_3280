package Semana6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios_en_clase {

    public static void main(String[] args) {
        // EJERCICIO 8 DE PROPUESTOS
        /*
        int arreglo [] = {123, 456, 789, 101, 112};
        int digitoX = 1;
        int contador = 0;
        for (int numero : arreglo) {
            int numeroTemp = numero;

            while (numeroTemp != 0) {
                int digitoActual = numeroTemp % 10;

                if (digitoActual == digitoX) {
                    contador++;
                }
                numeroTemp /= 10;
            }
        }
        System.out.println("La cantidad de veces que aparece el dígito " + 
                digitoX + " es: " + contador);
        */
        
        
        // EJERCICIO 2 DE VECTORES Y MATRICES
        int[] sueldos = new int[20];
        int sumaSueldos = 0;
        double promedioSueldos = 0;

        Random random = new Random();

        //sueldos aleatorios entre 800 y 1700
        for (int i = 0; i < 20; i++) {
            sueldos[i] = random.nextInt(901) + 800;
            sumaSueldos += sueldos[i];
        }

        promedioSueldos = (double) sumaSueldos / 20;

        System.out.println("Empleado\tSueldo\t\tReajuste");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < 20; i++) {
            System.out.print(i + "\t\t" + sueldos[i] + "\t\t");

            if (sueldos[i] > promedioSueldos) {
                double reajuste = promedioSueldos - sueldos[i];
                System.out.println(reajuste + " (decremento)");
            } else if (sueldos[i] < promedioSueldos) {
                double reajuste = promedioSueldos - sueldos[i];
                System.out.println(reajuste + " (incremento)");
            } else {
                System.out.println("0");
            }
        }

        int contadorMayorPromedio = 0;
        int contadorMenorPromedio = 0;

        for (int i = 0; i < 20; i++) {
            if (sueldos[i] > promedioSueldos) {
                contadorMayorPromedio++;
            } else if (sueldos[i] < promedioSueldos) {
                contadorMenorPromedio++;
            }
        }

        double porcentajeMayorPromedio = (double) contadorMayorPromedio / 20 * 100;
        double porcentajeMenorPromedio = (double) contadorMenorPromedio / 20 * 100;

        System.out.println("----------------------------------------------");
        System.out.println("Cantidad de empleados que ganan más del promedio: " + 
                contadorMayorPromedio + " (" + porcentajeMayorPromedio + "%)");
        System.out.println("Cantidad de empleados que ganan menos del promedio: " + 
                contadorMenorPromedio + " (" + porcentajeMenorPromedio + "%)");
        
        

        
        // EJERCICIO 3 DE VECTORES Y MATRICES
        /*
        String jugadores [] = new String[11];
        int pesos [] = new int[11];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 11; i++) {
            System.out.print("Ingrese el nombre del jugador " + (i+1) + ": ");
            jugadores[i] = scanner.nextLine();

            System.out.print("Ingrese el peso del jugador " + (i+1) + ": ");
            pesos[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
        }

        int contador30_35 = 0;
        int contador36_40 = 0;
        int contadorMayor40 = 0;
        int sumaPesos = 0;
        int jugadorMayorPeso = 0;
        int pesoMayor = pesos[0];

        System.out.println("Listado de jugadores:");

        for (int i = 0; i < 11; i++) {
            System.out.println(jugadores[i] + " - Peso: " + pesos[i]);

            if (pesos[i] >= 30 && pesos[i] <= 35) {
                contador30_35++;
            } else if (pesos[i] >= 36 && pesos[i] <= 40) {
                contador36_40++;
            } else if (pesos[i] > 40) {
                contadorMayor40++;
            }

            sumaPesos += pesos[i];

            if (pesos[i] > pesoMayor) {
                jugadorMayorPeso = i;
                pesoMayor = pesos[i];
            }
        }

        double promedioPeso = (double) sumaPesos / 11;

        System.out.println("La cantidad de jugadores con peso entre 30 y 35 Kg: " + contador30_35);
        System.out.println("La cantidad de jugadores con peso entre 36 y 40 Kg: " + contador36_40);
        System.out.println("La cantidad de jugadores con peso mayor a 40 kg: " + contadorMayor40);
        System.out.println("El promedio de peso de los jugadores del equipo: " + promedioPeso);
        System.out.println("El jugador de mayor peso: " + jugadores[jugadorMayorPeso] + " - Peso: " + pesoMayor);
        */
        
        
    }
    
}
