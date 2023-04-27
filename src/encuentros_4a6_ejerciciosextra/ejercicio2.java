/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_4a6_ejerciciosextra;

/**
 *
 * @author MiriamNahuel
 */
public class ejercicio2 {
   public static void main(String[] args) {
        //declaracion
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        
        //valores iniciales
        System.out.println("Valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);

        //rotacion
        int aux = A; // Guardar el valor de A en la variable auxiliar
        A = D; // A toma el valor de D
        D = B; // D toma el valor de B
        B = C; // B toma el valor de C
        C = aux; // C toma el valor que tenía A originalmente, guardado en la variable auxiliar
        
        //valores finales
        
        System.out.println("Valores finales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);

        
    }
}