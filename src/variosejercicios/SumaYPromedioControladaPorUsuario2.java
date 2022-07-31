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
public class SumaYPromedioControladaPorUsuario2 {
    /**
     * Pedir números hasta que el usuario quiera, sumar los que son positivos y multiplicar los negativos.
     * @param args 
     */
    public static void main(String[] args) {
        // Datos de entrada
        int numero, sumaPositivos, sumaNegativos, contador;
        char accion;
        boolean repetir = true;
        Scanner input = new Scanner(System.in);
        
        // Inicializo sumas y contador en 0
        sumaPositivos = sumaNegativos = contador = 0;
        
        // Mientras haya que repetir
        while(repetir){
            // Pido al usuario ingresar un numero
            System.out.println("Ingrese un numero");
            numero = input.nextInt();
            
            // Sumo el número al acumulador que corresponda
            if(numero >= 0){
                sumaPositivos = sumaPositivos + numero;
            }else{
                if(sumaNegativos == 0)
                    sumaNegativos = numero;
                else
                    sumaNegativos = sumaNegativos * numero;
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
        
        //Suma de números positivos
        System.out.println("Suma de los numeros positivos: " + sumaPositivos);
        
        //Multiplicación de números negativos
        System.out.println("Multiplicacion de los números negativos: " + sumaNegativos);
        
    }
}
