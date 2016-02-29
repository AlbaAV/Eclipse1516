package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02CapturarExcepcion {
	public static void main(String[] args) {

		try {
			Scanner tec = new Scanner(System.in);
			System.out.println("DIVISION");
			System.out.println("Introduce DIVIDENDO: ");
			int a = tec.nextInt();

			System.out.println("Introduce DIVISOR: ");
			int b = tec.nextInt();

			// Sin evitar la excepción --> Terminación abrupta
			System.out.println("COCIENTE: " + (a / b));
		} catch (InputMismatchException e) {
			System.out.println("tienes que introducir valores enteros");
		}
		System.out.println(" ----- FIN DEL PROGRAMA ----");
	}

}