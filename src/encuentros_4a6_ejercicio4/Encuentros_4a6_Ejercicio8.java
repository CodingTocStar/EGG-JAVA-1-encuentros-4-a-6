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
public class Encuentros_4a6_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
        lo siguiente:*/
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el lado de su cuadrado:");
        int lado = lector.nextInt();
        
        //trazo cuadrado
        for(int i=0 ; i<=lado ; i++){
            for(int j=0 ; j<=lado ; j++){
                if( j==0 || j==lado || i==0 || i==lado){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
