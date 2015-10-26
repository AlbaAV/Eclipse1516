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
		
		//ultima
		char fin =ultima(nombre);
		System.out.println("Ultimo caracter: " + fin);
		
		//Primera Palabra
		String primera = primeraPalabra(nombre);
		System.out.println(primera);
		
		//Segunda Palabra
		String segunda = segundaPalabra(nombre);
		System.out.println(segunda);
		
		//Segunda Palabra
		String tercera = terceraPalabra(nombre);
		System.out.println(tercera);
	}
	
	public static char inicial(String texto){
		String text = texto.toUpperCase();
		char ini = text.charAt(0);
		return ini ;
	}
	public static char ultima(String texto){
		String text = texto.toUpperCase();
		
		char fin = text.charAt(text.length()-1);
		return fin;
	}

	
	public static String primeraPalabra(String texto){
		String primera = texto.toUpperCase();
		int esp = primera.indexOf(' ');
		return primera.substring(0, esp);
	}
	
	public static String segundaPalabra(String texto){
		String segunda = texto.toUpperCase();
		int esp = segunda.indexOf(' ');
		int ultEsp = segunda.lastIndexOf(' ');
		return segunda.substring(esp+1, ultEsp);
	}
	
	public static String terceraPalabra(String texto){
		String segunda = texto.toUpperCase();
		int ultEsp = segunda.lastIndexOf(' ');
		return segunda.substring(ultEsp+1);
	}
}
