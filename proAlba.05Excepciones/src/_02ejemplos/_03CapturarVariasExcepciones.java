package _02ejemplos;

import java.util.Scanner;

public class _03CapturarVariasExcepciones {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		try {

			System.out.println("Introduce NIF (8 NUMEROS y 1 LETRA");
			String nif = tec.nextLine();

			String sNumeros = nif.substring(0, 8);
			char letra = nif.charAt(8);

			int numero = Integer.parseInt(sNumeros);
			if (numero > 50000000)
				System.out.println("Tienes un numero de nif alto");
			else
				System.out.println("Tienes un numero de nif bajo");
			
			
		} catch (NumberFormatException  | StringIndexOutOfBoundsException e) {
			
			System.out.println("El nif tiene una longitud incorrecta");
		} finally {
			System.out.println("Fin del programa");
		}
	}
}