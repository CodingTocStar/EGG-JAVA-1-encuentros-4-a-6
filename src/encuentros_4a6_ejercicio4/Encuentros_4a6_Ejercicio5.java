/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_4a6_ejercicio4;

import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */


    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a
        continuación solicite números al usuario hasta que la suma de los
        números introducidos supere el límite inicial.*/
import java.util.Scanner;

public class Encuentros_4a6_Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un límite positivo: ");
        int limite = scanner.nextInt();
        
        int suma = 0;
        while (suma <= limite) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            suma += numero;
        }
        
        System.out.println("La suma de los números ingresados ha superado el límite.");
        System.out.println("SU suma es: " + suma);
        System.out.println("Su limite es: " + limite);
        scanner.close();
    }
}

