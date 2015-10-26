package _03ejerciciosStrings;

import java.util.Scanner;
public class _06QuitarEspacios {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un texto con muchos espacios en blanco: ");
		String palabras = tec.nextLine();
		palabras = palabras.trim();
		int posA = palabras.indexOf(' ');
		int posB = palabras.lastIndexOf(' ');
		String p1 = palabras.substring(0, posA);
		String p2 = palabras.substring(posB);
		System.out.println(p1 + p2);
		
	}	
}
