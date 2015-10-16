package _01pruebas;

import java.util.*;
public class _01Media {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce la edad 1: ");
		int edad1 = tec.nextInt();
		System.out.println("Introduce la edad 2: ");
		int edad2 = tec.nextInt();
		System.out.println("Introduce la edad 3: ");
		int edad3 = tec.nextInt();
		
		double media = (edad1 + edad2 + edad3)/3.0;
		System.out.println("La media de las 3 edades es: " + media);
	}
}
