package _03ejerciciosStrings;

import java.util.Scanner;

public class _05DesplazarDerecha {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String palabra = tec.next();
		int lon = palabra.length()-1;
		char ult = palabra.charAt(lon);
		palabra = ult + palabra.substring(0,lon-1);
		System.out.println("Desplazar a la derecha: " +palabra);
	}
}
