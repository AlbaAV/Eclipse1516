package _03ejercicios.alternativas;

import java.util.Scanner;

public class _04NotasTexto {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce una nota entre 1-10: ");
		double nota = tec.nextDouble();
		if(nota < 5)
			System.out.println("Insuficiente");		
		else if(nota < 6)
				System.out.println("Suficiente");
		else if(nota < 7)
				System.out.println("Bien");
		else if(nota < 9)
				System.out.println("Notable");
		else
				System.out.println("Sobresaliente");
	}
}
