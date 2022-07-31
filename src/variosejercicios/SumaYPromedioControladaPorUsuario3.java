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
public class SumaYPromedioControladaPorUsuario3 {

    /**
     * Pedir números hasta que el usuario quiera, mostrar el número máximo y el
     * número mínimo ingresado.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Datos de entrada
        int numero, contador, maximo, minimo;
        char accion;
        boolean repetir = true;
        Scanner input = new Scanner(System.in);
        // Inicializo contador en 0
        contador = maximo = minimo = 0;

        // Mientras haya que repetir
        while (repetir) {
            // Pido al usuario ingresar un numero
            System.out.println("Ingrese un numero");
            numero = input.nextInt();

            // Si es la primera iteración seteo máximo y mínimo iguales
            if (maximo == 0 && minimo == 0) {
                maximo = numero;
                minimo = numero;
            } else {
                if (numero > maximo) {
                    maximo = numero;
                }

                if (numero < minimo) {
                    minimo = numero;
                }
            }

            // Acreciento el contador de iteraciones
            contador++;

            // Pregunto al usuario si desea sumar un nuevo número
            System.out.println("Desea ingresar un nuevo numero?");
            System.out.println("Indique 's' para ingresar un nuevo numero o cualquier otro valor para salir");

            // Leo únicamente el primer caracter ingresado por el usuario
            accion = input.next().charAt(0);

            // Si el valor ingresado es S significa que hay que repetir el bloque
            // si no, ya se puede salir 
            repetir = accion == 's' || accion == 'S';
        }

        // Imprimo los valores solicitados
        // Números máximos y mínimos
        System.out.println("Numero maximo ingresado: " + maximo);
        System.out.println("Numero minimo ingresado: " + minimo);
    }
}
