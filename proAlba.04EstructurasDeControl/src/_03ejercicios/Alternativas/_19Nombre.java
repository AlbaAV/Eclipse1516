package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _19Nombre {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un nombre: ");
		String nombre = tec.nextLine();
		char ini = nombre.charAt(0);
		char fin = nombre.charAt(nombre.length()-1);
		
		if(ini == fin)
			System.out.println("Los caracteres inicial y final del nombre: " + nombre + " son iguales.");
		else
			System.out.println("Los caracteres inicial y final del nombre: " + nombre + " son distintos.");
	}
}
