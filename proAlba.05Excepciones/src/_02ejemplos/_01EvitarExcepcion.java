package _02ejemplos;

import java.util.Scanner;

public class _01EvitarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("DIVISION");
		System.out.println("Introduce DIVIDENDO: ");
		int a = tec.nextInt();
		
		System.out.println("Introduce DIVISOR: ");
		int b = tec.nextInt();
		
		//Evitando la excepcion
		if(b != 0)
			System.out.println("COCIENTE: " + (a/b));
		else
			System.out.println("NO se puede dividir por cero");
		
		
		//Sin evitar la excepción --> Terminación abrupta
		System.out.println("COCIENTE: " + (a/b));
	}
}
