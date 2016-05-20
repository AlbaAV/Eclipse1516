package _02ejemplos;

import java.io.IOException;

public class _01LecturaOrientadaAByte {
	// Realiza una operacion de lectura usando un Stream orientado a byte.
	// Se lee directamente de System.in, sin utilizar Scanner
	
	public static void main(String[] args) throws IOException{
		System.out.println("Introduce una letra: ");
		int dato = System.in.read();
		System.out.println("Numero: " + dato);
		System.out.println("Caracter: " + (char) dato);
	}
}
