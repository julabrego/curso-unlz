/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variosejercicios;

import java.util.Scanner;

/**
 *
 * @author abreg
 */
public class IngresarHora {
    /**
     * Al ingresar una hora, informar:
     * si está entre las 7 y las 11 : "Es de mañana.".
     * si está entre las 12 y las 19 : "Es de tarde.".
     * si está entre las 20 y las 24 o entre las 0 y las 6 : "Es de noche.".
     * si NO está entre las 0 y las 24 : "la hora no existe.".
     */
    public static void main(String[] args){
        // Declaración de datos de entrada
        int hora;
        Scanner scanner = new Scanner(System.in);
        
        // Pido al usuario que ingrese una hora
        System.out.println("Ingrese una hora: ");
        hora = scanner.nextInt();
        
        // Valido los posibles rangos horarios e imprimo el mensaje correspondiente
        if(hora >= 7 && hora <= 11){
            System.out.println("Es de mañana");
        }else if(hora >= 12 && hora <= 19){
            System.out.println("Es de tarde");
        }else if(hora >= 20 && hora <= 24 || hora >= 0 && hora <= 6){
            System.out.println("Es de noche");
        }else{
            System.out.println("La hora no existe.");
        }
    }
}
