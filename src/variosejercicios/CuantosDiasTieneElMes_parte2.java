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
public class CuantosDiasTieneElMes_parte2 {

    public static void main(String[] args) {
        // Datos de entrada
        int mesElegido;
        Scanner scanner = new Scanner(System.in);

        // Imprimo listado de meses para que el usuario pueda elegir
        System.out.println("Elija el numero del mes que desee saber cuantos dias tiene:");
        System.out.println("1: enero");
        System.out.println("2: febrero");
        System.out.println("3: marzo");
        System.out.println("4: abril");
        System.out.println("5: mayo");
        System.out.println("6: junio");
        System.out.println("7: julio");
        System.out.println("8: agosto");
        System.out.println("9: septiembre");
        System.out.println("10: octubre");
        System.out.println("11: noviembre");
        System.out.println("12: diciembre");

        // Pido al usuario que ingrese el número
        mesElegido = scanner.nextInt();

        // Valido las posibles opciones usando un switch
        switch (mesElegido) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("El mes " + mesElegido + " tiene 31 dias");

                // Si es alguno de los meses especificados se muestra un mensaje especial
                if (mesElegido == 1) {
                    System.out.println("Que comiences bien el año");
                } else if (mesElegido == 3) {
                    System.out.println("A clases!");
                } else if (mesElegido == 7) {
                    System.out.println("Se vienen las vacaciones!");
                } else if (mesElegido == 12) {
                    System.out.println("Felices fiestas!");
                }
                break;
            case 4, 6, 9, 11:
                System.out.println("El mes " + mesElegido + " tiene 30 dias");
                break;
            case 2:
                System.out.println("El mes " + mesElegido + " tiene 28 dias");
                break;
            default:
                System.out.println("Opcion no valida");

        }
    }
}
