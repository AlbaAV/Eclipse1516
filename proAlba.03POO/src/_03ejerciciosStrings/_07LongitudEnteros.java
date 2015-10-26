package _03ejerciciosStrings;

import java.util.Scanner;

public class _07LongitudEnteros {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un entero largo: ");
		long num = tec.nextLong();
		String valor = String.valueOf(num);
		System.out.println("Longitud: " + valor.length());
			
		
	}
}
