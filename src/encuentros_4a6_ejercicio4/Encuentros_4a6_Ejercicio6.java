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
import java.util.Scanner;

public class Encuentros_4a6_Ejercicio6 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero positivo: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero positivo: ");
        int num2 = scanner.nextInt();
        
        int opcion;
        boolean salir = false;
        
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El producto es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        System.out.println("El cociente es: " + (num1 / (double) num2));
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    char confirmacion = scanner.next().charAt(0);
                    if (Character.toUpperCase(confirmacion) == 'S') {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }

        } while (!salir);

        scanner.close();
    }
}