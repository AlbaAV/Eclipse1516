package _02ejemplos;

import java.util.Scanner;

public class _04DosMetodosPropagarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("DIVIDENDO: ");
		int dividendo = tec.nextInt();
		System.out.println("DIVISOR: ");
		int divisor = tec.nextInt();
		try {
			int cociente = dividir(dividendo, divisor);
		
			System.out.println("Cociente: " + cociente);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir");
		}
	}
	
	public static int dividir(int a , int b) throws ArithmeticException {
		int c = 0;
		
		c = a / b;
	
		
		return c;
	}

}