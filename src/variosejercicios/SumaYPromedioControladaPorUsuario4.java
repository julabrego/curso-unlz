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
public class SumaYPromedioControladaPorUsuario4 {
    /**
     * Pedir números hasta que el usuario quiera, mostrar:
           1-Suma de los negativos.
           2-Suma de los positivos.
           3-Cantidad de positivos.
           4-Cantidad de negativos.
           5-Cantidad de ceros.
           6-Cantidad de números pares.
           7-Promedio de positivos.
           8-Promedios de negativos.
           9-Diferencia entre positivos y negativos, (positvos-negativos).
     * @param args 
     */
    public static void main(String[] args) {
        // Datos de entrada
        // Contadores
        int cantidadNegativos, cantidadPositivos, cantidadCeros, cantidadPares;
        // Acumuladores
        int sumaNegativos, sumaPositivos;
        
        int numero, contador, diferenciaPositivosNegativos;
        float promedioPositivos, promedioNegativos;
        char accion;
        boolean repetir = true;
        Scanner input = new Scanner(System.in);
        
        // Inicializo suma y contador en 0
        contador = cantidadNegativos = cantidadPositivos = cantidadCeros = cantidadPares = sumaNegativos = sumaPositivos = 0;
        
        // Mientras haya que repetir
        while(repetir){
            // Pido al usuario ingresar un numero
            System.out.println("Ingrese un numero");
            numero = input.nextInt();
            
            // Determino cantidades y sumas de positivos, negativos y ceros
            if(numero < 0){
                sumaNegativos = sumaNegativos + numero;
                cantidadNegativos++;
            }else if (numero > 0){
                sumaPositivos = sumaPositivos + numero;
                cantidadPositivos++;
            }else{
                cantidadCeros++;
            }
            
            // Si es número par lo cuento
            if(numero % 2 == 0 && numero != 0)
                cantidadPares++;
            
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
        
        // 1-Suma de los negativos.
        System.out.println("Suma de negativos: " + sumaNegativos);
        
        // 2-Suma de los positivos.
        System.out.println("Suma de positivos: " + sumaPositivos);
        
        // 3-Cantidad de positivos.
        System.out.println("Cantidad de positivos: " + cantidadPositivos);
        
        // 4-Cantidad de negativos.
        System.out.println("Cantidad de negativos: " + cantidadNegativos);
        
        // 5-Cantidad de ceros.
        System.out.println("Cantidad de ceros: " + cantidadCeros);
        
        // 6-Cantidad de números pares.
        System.out.println("Cantidad de numeros pares: " + cantidadPares);
        
        // 7-Promedio de positivos.
        promedioPositivos = sumaPositivos / cantidadPositivos;
        System.out.println("Promedio de positivos: " + promedioPositivos);
        
        // 8-Promedios de negativos.
        promedioNegativos = sumaNegativos / cantidadNegativos;
        System.out.println("Promedio de negativos: " + promedioNegativos);
        
        // 9-Diferencia entre positivos y negativos, (positvos-negativos).
        diferenciaPositivosNegativos = sumaPositivos + sumaNegativos;
        System.out.println("Diferencia entre positivos y negativos: " + diferenciaPositivosNegativos);

    }
}
