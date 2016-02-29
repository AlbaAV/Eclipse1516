package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02LeerDosEnteros {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		int num1, num2;
		boolean continuar;
		//Primer numero
		continuar = true;
		do {
			try {
				System.out.println("Introduce entero 1: ");
				num1 = tec.nextInt();
				continuar = false;
			} catch (InputMismatchException e) {
				System.out.println("Te has equivocado");
				tec.nextLine(); // vac�o buffer de teclado
			}
		} while (continuar);
		
		
		continuar = true;
		do {
			try {
				System.out.println("Introduce entero: ");
				num2 = tec.nextInt();
				continuar = false;
			} catch (InputMismatchException e) {
				System.out.println("Te has equivocado");
				tec.nextLine(); // vac�o buffer de teclado
			}
		} while (continuar);
	}

}