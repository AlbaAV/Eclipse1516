package _03ejerciciosStrings;

import java.util.Scanner;

public class _01Nombres {
	public static void main(String[] args) {
		System.out.println("Introduce el nombre completo (nombre, 1ºApellido y 2ºApellido): ");
		Scanner tec = new Scanner(System.in);
		String nombre = tec.nextLine() ;
		//inicial
		char ini =inicial(nombre);
		System.out.println("Primer Caracter " + ini);
		
			
		//Primera Palabra
		String primera = primeraPalabra(nombre);
		System.out.println(primera);
		
	}
	
	public static char inicial(String texto){
		String text = texto.toUpperCase();
		char ini = text.charAt(0);
		return ini ;
	}

	
	public static String primeraPalabra(String texto){
		String primera = texto.toUpperCase();
		int esp = primera.indexOf(' ');
		return primera.substring(0, esp);
	}
	
	//public static String segundaPalabra(String texto){
		
	}
}
