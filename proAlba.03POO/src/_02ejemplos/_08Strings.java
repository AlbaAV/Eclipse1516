package _02ejemplos;

import java.util.Scanner;

public class _08Strings {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		
		String nombre = tec.nextLine();
		
		//Inicial del nombre
		char inicial  = nombre.charAt(0);
		System.out.println("Inicial: " + inicial);
		
		//Quinto caracter del nombre
		char quinto = nombre.charAt(4);
		System.out.println("Quinto caracter: " + quinto);
		
		//Posicion de la primera letra 'a'
		int posA = nombre.indexOf('a');
		System.out.println("Posicion de a: " + posA);
		
		
		String texto = "Hola que tal";
		System.out.println(texto.substring(0,4)); // Posiciones 0,1,2,3
		System.out.println(texto.substring(8)); //Desde pos 8 hasta el finalc
	
		System.out.println(texto.trim());//Quita espacios en blanco de delante y detras
		
		System.out.println(nombre.length()); //Devuelve el numero de caracteres de la cadena
		
		//Conversion
		int num = 23432;
		String textoNum = String.valueOf(num);
		int numCifras = textoNum.length();
		
		//de otra forma
		int numCifras2 = String.valueOf(num).length();
		
	}
}
