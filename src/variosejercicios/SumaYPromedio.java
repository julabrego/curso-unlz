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
public class SumaYPromedio {
    /**
     * Pedir 5 números e informar la suma acumulada y el promedio.
     * @param args 
     */
    public static void main(String[] args) {
        // Datos de entrada
        int numero, iteraciones, suma;
        float promedio;
        Scanner input = new Scanner(System.in);
        
        // Inicializo la variable contadora (iteraciones) y acumuladora (suma)
        // en 0
        iteraciones = 0;
        suma = 0;
        // Mientras iteraciones sea menor que 5
        while(iteraciones < 5){
            // Solicito un número al usuario
            System.out.println("Ingrese un numero");
            numero = input.nextInt();
            
            // Lo sumo a la variable acumuladora
            suma = suma + numero;
            // Acreciento en una unidad a las iteraciones
            iteraciones++;
        }
        
        // Imprimo los valores solicitados
        
        //Suma
        System.out.println("Suma de los numeros: " + suma);
        
        // Promedio
        promedio = suma / iteraciones;
        System.out.println("Promedio: " + promedio);
    }
}
 