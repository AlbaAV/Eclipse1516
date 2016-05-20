package _02ejemplos;

import java.io.IOException;
import java.io.InputStreamReader;

public class _02LecturaOrientadaACaracter {
	// Realiza una operacion de lectura usando un Stream orientado a byte.
	// Se lee directamente de System.in, sin utilizar Scanner
	
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("Introduce una letra: ");
		int dato = isr.read();
		System.out.println("Numero: " + dato);
		System.out.println("Caracter: " + (char) dato);
	}
}
