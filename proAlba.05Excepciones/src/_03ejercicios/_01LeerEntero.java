package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01LeerEntero {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		boolean continuar = true;
		do {
			try {
				System.out.println("Introduce entero: ");
				int num = tec.nextInt();
				continuar = false;
			} catch (InputMismatchException e) {
				System.out.println("Te has equivocado");
				tec.nextLine(); // vacío buffer de teclado
			}
		} while (continuar);
	}

}