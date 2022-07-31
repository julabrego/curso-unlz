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
public class IngresarNumeroDel0al9 {
    /**
     * Ingresar número del 0 al 9 inclusive
     * @param args 
     */
    public static void main(String[] args) {
        // Datos de inicio
        int numero;
        Scanner scanner = new Scanner(System.in);
        
        // Declaro una variable testigo para imprimir mensaje cuando la clave ingresada
        // no fue válida
        boolean ingresado = false;

        do {
            if (ingresado) {
                System.out.println("Numero fuera del rango aceptado");
            }
            // Solicito la clave al usuario
            System.out.println("Ingrese un numero entre 0 y 9");
            numero = scanner.nextInt();
            ingresado = true;

            // Verifico la validez de la clave     
        } while (numero < 0 || numero > 9);

        // Ingresó un numero válido
        System.out.println("Correcto");

    }
}
