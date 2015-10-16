package _03ejercicios;

import java.util.*;

public class _14PenultimaCifra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = tec.nextInt();
		int penultimaCifra = num / 10%10;
		int penultimaCifra2 = num % 100 / 10;
		
		System.out.println("La penultima cifra es: " + penultimaCifra);
		System.out.println("La penultima cifra es: " + penultimaCifra2);
		
		/*
		 * Si se introduce un numero de una sola cifra el valor de la penultima cifra
		 * el valor que se le signará será 0
		 */
		
		
	}




}
