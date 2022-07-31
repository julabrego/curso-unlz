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
public class PedirLaClave {

    /**
     * Pedir al usuario ingresar una clave (1234) Si la clave es incorrecta
     * vuelvo a pedirle al usuario que la ingrese
     *
     * @param args
     */
    public static void main(String[] args) {
        // Datos de inicio
        String claveValida = "1234";
        String claveIngresada;
        Scanner scanner = new Scanner(System.in);

        // Declaro una variable testigo para imprimir mensaje cuando la clave ingresada
        // no fue válida
        boolean ingresado = false;

        do {
            if (ingresado) {
                System.out.println("Clave incorrecta");
            }
            // Solicito la clave al usuario
            System.out.println("Ingrese su clave");
            claveIngresada = scanner.next();
            ingresado = true;

            // Verifico la validez de la clave     
        } while (!claveIngresada.equals(claveValida));

        // Ingresó la clave correcta
        System.out.println("Bienvenido");

    }
}
