package com.franciscoRodriguez.ejerciciosFicheros;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * Ejercicio 01.04 - Escribir en ficheros de texto + finally
 * Crea un programa que escriba en un fichero ”rectangle.txt” un rectángulo 
 * hueco de asteriscos, del ancho y alto escogido por el usuario.
 */

public class App {
    public static void main( String[] args ) {
        PrintWriter pw = null;
        Scanner sc = new Scanner(System.in);
        int alto, ancho;
        
        try {
            pw = new PrintWriter("rectangle.txt");
            
            System.out.print("Introduce el alto: ");
            alto = sc.nextInt();
            
            System.out.print("Introduce el ancho: ");
            ancho = sc.nextInt();
            sc.close();
            
            for (int fila = 0; fila < alto; fila++) {
                for (int columna = 0; columna < ancho; columna++) {
                    if (fila == 0 || columna == 0 || 
                            fila == alto - 1 || columna == ancho - 1)
                        pw.print('*');
                    else
                        pw.print(' ');
                }
                
                pw.println();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
