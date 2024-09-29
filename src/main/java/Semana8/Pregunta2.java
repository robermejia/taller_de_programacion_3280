package Semana8;
import java.util.Random;
public class Pregunta2 {
    public static void main(String[] args) {
        // Creando los vectores de jugadores y pesos
        int numerosJugadores [] = new int[30];
        int pesosJugadores []= new int[30];

        // Llenar los vectores con valores aleatorios
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            numerosJugadores[i] = i + 1; // El número de jugador es la posición + 1
            pesosJugadores[i] = random.nextInt(49) + 2; // Valores aleatorios entre 2 y 50
        }
        // Contadores para cada rango de peso
        int contador30a35 = 0;
        int contador36a40 = 0;
        int contadorMayor40 = 0;

        // Suma de pesos para calcular el promedio
        int sumaPesos = 0;
        // Jugador de mayor peso y su posición
        int jugadorMayorPeso = -1;
        int pesoMayor = Integer.MIN_VALUE;
        // Mostrando los jugadores y sus pesos
        System.out.println("Listado de jugadores con su peso correspondiente:");
        for (int i = 0; i < 30; i++) {
            System.out.println("Jugador " + numerosJugadores[i] + ": " + pesosJugadores[i] + " kg");
            // Actualizar contadores y sumas
            sumaPesos += pesosJugadores[i];
            if (pesosJugadores[i] >= 30 && pesosJugadores[i] <= 35) {
                contador30a35++;
            } else if (pesosJugadores[i] >= 36 && pesosJugadores[i] <= 40) {
                contador36a40++;
            } else {
                contadorMayor40++;
            }
            // Actualizando jugador de mayor peso
            if (pesosJugadores[i] > pesoMayor) {
                jugadorMayorPeso = numerosJugadores[i];
                pesoMayor = pesosJugadores[i];
            }
        }
        // Calculando promedio de peso
        double promedioPeso = (double) sumaPesos / 30;
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("a) Cantidad de jugadores con peso entre 30 y 35 Kg: " 
                                + contador30a35);
        System.out.println("b) Cantidad de jugadores con peso entre 36 y 40 Kg: " 
                                + contador36a40);
        System.out.println("c) Cantidad de jugadores con peso mayor a 40 Kg: " 
                                + contadorMayor40);
        System.out.println("d) Promedio de peso de los jugadores del equipo: " 
                                + promedioPeso + " kg");
        System.out.println("e) Jugador de mayor peso: Jugador " + jugadorMayorPeso 
                                + " con " + pesoMayor + " kg");
    }   
}
