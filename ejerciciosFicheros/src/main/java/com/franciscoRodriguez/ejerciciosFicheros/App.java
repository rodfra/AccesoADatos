package com.franciscoRodriguez.ejerciciosFicheros;

import java.io.IOException;
import java.io.PrintWriter;

// Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * Ejercicio 01.02 - Escribir en ficheros de texto
 * Crea un programa que escriba los números impares del 1 al 10 en un fichero
 *  de texto, cada uno en una línea.
 */

public class App {
    public static void main( String[] args ) {
    	
		PrintWriter pw = null;

    	try {
    		pw = new PrintWriter("ejercicio0102.txt");
    		
    		for (int i = 1; i <= 9; i+=2) {
    			pw.println(i);
    		}
    		
    		pw.close();
    		
    	} catch (IOException e) {
    		System.err.println("Error escribiendo: " + e.getMessage());
    	}
    }
}
