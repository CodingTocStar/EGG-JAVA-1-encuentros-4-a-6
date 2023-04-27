/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_4a6_ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class Ejercicio1_Conversion_de_tiempo {

    /**
     * @param args the command line arguments
     */
    /*
    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
    ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
    equivalente: 1 día, 2 horas.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos a convertir:");
        int minutos = lector.nextInt();
        
        //conversiones
        int dias = minutos/(24*60);
        int horas = (minutos % (60 * 24)) / 60;
        
        //salida
        System.out.println("Los minutos convertidos dan: " + dias + " dias y " + horas + " horas.");
    }
    
}
