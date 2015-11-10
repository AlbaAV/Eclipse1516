package _03ejercicios.alternativas;

import java.util.Scanner;

public class _14Signo {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("Introduce un numero (positivo o negativo): ");
		int n1 = tec.nextInt();
		System.out.println("Introduce otro numero (positivo o negativo): ");
		int n2 = tec.nextInt();
		
		if((n1 < 0 && n2 > 0)||(n1 > 0 && n2 < 0))
			System.out.println("El producto de los 2 numeros es negativo");
		else
			System.out.println("El producto es positivo o nulo");
	}
}
