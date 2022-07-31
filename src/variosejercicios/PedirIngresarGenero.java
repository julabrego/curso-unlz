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
public class PedirIngresarGenero {

    /**
     * Pedir ingresar género 'f', 'm' o 'x'
     *
     * @param args
     */
    public static void main(String[] args) {
        // Datos de entrada
        char genero;
        Scanner scanner = new Scanner(System.in);

        // Declaro una variable testigo para verificiar que se ingresó un valor inválido
        boolean testigo = false;
        do {
            if(testigo)
                System.out.println("Valor ingresado no valido\n");
            
            System.out.println("Ingrese un caracter para indicar su genero:");
            System.out.println("'f': femenino");
            System.out.println("'m': masculino");
            System.out.println("'x': otro");
            
            // Tomo el primer caracter de la cadena leida
            genero = scanner.next().charAt(0);
            testigo = true;
        }while(genero != 'f' && genero != 'm' && genero != 'x');
        
        switch(genero){
            case 'f':
                System.out.println("Bienvenida");
                break;
            case 'm':
                System.out.println("Bienvenido");
                break;
            case 'x':
                System.out.println("Bienvenidx");
                break;
        }
    }
}
