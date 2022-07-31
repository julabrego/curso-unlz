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
public class Edades {
    /**
     * Al ingresar una edad que sea igual a 15, mostrar el mensaje "niña bonita".
     * Al ingresar una edad debemos informar solo si la persona es mayor de edad
     * Al ingresar una edad debemos informar si la persona es mayor de edad, sino informar que es un menor de edad.
     * Al ingresar una edad debemos informar si la persona es adolescente, edad entre 13 y 17 años (inclusive) .
     * Al ingresar una edad solo debemos informar si la persona NO es adolescente.
     * Al ingresar una edad debemos informar si la persona es mayor de edad (mas de 18 años) o adolescente (entre 13 y 17 años) o niño (menor a 13 años).
     * @param args 
     */
    public static void main(String[] args) {
        // Datos de entrada
        int edad;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();
        
        if(edad == 15)
            System.out.println("Niña bonita");
        
        if(edad >= 18)
            System.out.println("Es mayor de edad");
        else{
            System.out.println("Es menor de edad");
        }
        
        if(edad >= 13 && edad <= 17)
            System.out.println("Es adolescente");
        else
            System.out.println("No es adolescente");
        
        if(edad < 13)
            System.out.println("Es niño/a");
    }
}
