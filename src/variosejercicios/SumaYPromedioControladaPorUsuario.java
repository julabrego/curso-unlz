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
public class SumaYPromedioControladaPorUsuario {
    /**
     * Pedir números hasta que el USUARIO QUIERA e informar la suma acumulada y el promedio.
     * @param args 
     */
    public static void main(String[] args) {
        // Datos de entrada
        int numero, suma, contador;
        float promedio;
        char accion;
        boolean repetir = true;
        Scanner input = new Scanner(System.in);
        
        // Inicializo suma y contador en 0
        suma = contador = 0;
        // Mientras haya que repetir
        while(repetir){
            // Pido al usuario ingresar un numero
            System.out.println("Ingrese un numero");
            numero = input.nextInt();
            
            // Sumo el número al acumulador
            suma = suma + numero;
            
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
        
        //Suma
        System.out.println("Suma de los numeros: " + suma);
        
        // Promedio
        promedio = suma / contador;
        System.out.println("Promedio: " + promedio);
    }
}
