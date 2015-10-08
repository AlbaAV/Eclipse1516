package _03ejercicios;

import java.util.Random;

public class _12Dados2 {
	public static void main(String[] args) {
		Random r = new Random();
		int dado1 = r.nextInt(6)+1;
		int dado2= r.nextInt(6)+1;
		
		System.out.println("Dado 1: " +dado1);
		System.out.println("Dado 2: " +dado2);
		System.out.println("Dado 1 y 2: " +(dado1+dado2));
	}
}
