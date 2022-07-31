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
public class EstadoCivil {

    /**
     * Al ingresar una edad menor a 18 años y un estado civil distinto a
     * "Soltero", NO HACER NADA, pero si no es asi, y es soltero y no es menor,
     * mostrar el siguiente mensaje: 'Es soltero y no es menor.'
     *
     * @param args
     */
    public static void main(String[] args) {
        // Datos de entrada
        int edad;
        String estadoCivil;
        Scanner scanner = new Scanner(System.in);

        // Pido la edad
        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();

        // Fuerzo a que scanner tome un salto de línea (vacío).
        // Si no lo hago, toma el int como parte del siguiente nextLine() y no espera la entrada del usuario
        scanner.nextLine();

        // Pido el estado civil al usuario
        System.out.println("Ingrese su estado civil");
        estadoCivil = scanner.nextLine();

        if (edad >= 18 && estadoCivil.equalsIgnoreCase("Soltero")) {
            System.out.println("Es soltero y no es menor");
        }else if (edad < 18 && !estadoCivil.equalsIgnoreCase("Soltero"))
            System.out.println("Es muy pequeño para NO ser soltero");
    }
}
