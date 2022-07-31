/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variosejercicios;

/**
 *
 * @author abreg
 */
public class NotaRandom {
    /**
     * asignar una nota RANDOM al examen y mostrar:
     * "EXCELENTE" para notas igual a 9 o 10,
     * "APROBÓ" para notas mayores a 4,
     * "Vamos, la proxima se puede" para notas menores a 4
     * @param args 
     */
    public static void main(String[] args) {
        // Datos de entrada
        double numeroRandom;
        int nota;
        
        // Obtengo un numero aleatorio entre 1 y 10
        numeroRandom = Math.random() * 10 + 1;
        
        // Asigno ese numero aleatorio como nota y lo redondeo
        // casteo el valor como int para poder trabajarlo como tal
        nota = (int)Math.floor(numeroRandom);
        
        if(nota == 9 || nota == 10)
            System.out.println("EXCELENTE: " + nota);
        else if(nota >= 4)
            System.out.println("APROBADO: " + nota);
        else
            System.out.println("Vamos, la proxima se puede: " + nota);
    }
}
