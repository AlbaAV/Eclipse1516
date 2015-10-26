package _03ejerciciosStrings;

import java.util.Scanner;

public class _02DosMitades {
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		System.out.println("Escribe un texto: ");
		String texto = tec.nextLine();
		int longitud = texto.length();
		int mitad = longitud/2;
		System.out.println("Primera Mitad: " +texto.substring(0,mitad));
		System.out.println("Segunda Mitad: " + texto.substring(mitad));		
	}
}
