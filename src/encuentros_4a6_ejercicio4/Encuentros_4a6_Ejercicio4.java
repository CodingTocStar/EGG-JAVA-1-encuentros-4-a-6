/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_4a6_ejercicio4;

/**
 *
 * @author MiriamNahuel
 */


    /**
     * @param args the command line arguments
     */

import java.util.Scanner;

public class Encuentros_4a6_Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una frase o palabra: ");
        String input = scanner.nextLine();
        
        String primeraLetra = input.substring(0, 1);
        boolean esA = primeraLetra.equalsIgnoreCase("A");
        
        if (esA) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
        scanner.close();
    }
}
