package com.franciscoRodriguez.ejerciciosFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

// Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * Ejercicio 01.05 - Log
 * Crea un programa que añada a un fichero ”log.txt” una nueva línea en cada 
 * ejecución, que contendrá la fecha (en formato 19-09-2019), la hora (17:02:09) 
 * y el texto introducción por el usuario.
 */

public class App {
    public static void main( String[] args ) {
        
        System.out.println("INICIO");
        
        PrintWriter pw = null;
        Scanner sc = new Scanner(System.in);
        LocalDateTime dt = LocalDateTime.now();
        
        try {
            pw = new PrintWriter(new BufferedWriter(
                    new FileWriter("log.txt", true)));
            
            System.out.print("Introduce una cadena: ");
            pw.println( "(" + dt.getDayOfMonth() + "/" +
                    dt.getMonthValue() + "/" +
                    dt.getYear() + " " +
                    dt.getHour() + ":" +
                    dt.getMinute() + ":" +
                    dt.getSecond() + ") - " + 
                    sc.nextLine());
            
            sc.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            if (pw != null) {
                pw.close();
            }
            
            System.out.println("FIN");
        }
    }
}
