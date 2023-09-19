package com.franciscoRodriguez.ejerciciosFicheros;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Francisco Rodríguez - 2ºDAM Semipresencial

/**
 * Ejercicio 01.03 - Escribir en ficheros de texto + throws
 * Crea un programa que escriba en un fichero ”triangle.txt” un triángulo 
 * creciente de asteriscos, del ancho y alto escogido por el usuario.
 */

public class App {
    public static void main( String[] args ) throws IOException {
    	
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter("triangle.txt");
		int altoYAncho;
		
		System.out.print("Introduce el ancho y el alto: ");
		altoYAncho = sc.nextInt();
		
		for (int fila = 0; fila < altoYAncho; fila++) {
			for (int columna = 0; columna <= fila; columna++) {
				pw.print('*');
			}
			pw.println();
		}
		
		pw.close();
    }
}
