/*
 * Se importó la clase java.util.Scanner al principio del código para poder usarla
 * Se creó una función llamada main 
 * Se solicitó la entrada del jugador 1 y se almacenó en la variable j1.
 * Se solicitó la entrada del jugador 2 y se almacenó en la variable j2.
 * Se llamó a la función determinarGanador para calcular quién gana y se almacenó el resultado en la variable ganador.
 * Se agregó una estructura condicional (if-else) para mostrar el resultado del juego.
 * Se cerró el objeto Scanner al final del programa para liberar recursos.
 * Se creó una función llamada determinarGanador que toma dos cadenas como entrada y devuelve un entero para representar el resultado del juego.
 * 
 */
package com.generation;

import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args) {
        // Inicializamos un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos la entrada del jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scanner.nextLine();
        
        // Solicitamos la entrada del jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scanner.nextLine();
        
        // Llamamos a la función determinarGanador para calcular quién gana
        int ganador = determinarGanador(j1, j2);
        
        // Mostramos el resultado del juego
        if (ganador == 0) {
            System.out.println("Empate");
        } else {
            System.out.println("Gana el jugador " + ganador);
        }
        
        scanner.close();
    }
    
    public static int determinarGanador(String jugador1, String jugador2) {
       
        if (jugador1.equals(jugador2)) {
            return 0; // Empate
        } else if (
            (jugador1.equals("piedra") && jugador2.equals("tijeras")) ||
            (jugador1.equals("papel") && jugador2.equals("piedra")) ||
            (jugador1.equals("tijeras") && jugador2.equals("papel"))
        ) {
            return 1; // Jugador 1 gana
        } else {
            return 2; // Jugador 2 gana
        }
    }
}
