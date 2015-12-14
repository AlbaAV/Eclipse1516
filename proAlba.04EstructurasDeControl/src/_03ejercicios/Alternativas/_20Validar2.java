package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _20Validar2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		char x = tec.next().charAt(0);
		System.out.println("Introduce un numero 1-10");
		int y = tec.nextInt();
		
		boolean esXA = x == 'a';
		boolean esXB = x == 'b';
		boolean esYImpar= y %2 != 0;
		
		if((esXA && esYImpar) ||(esXB && !esYImpar) ) System.out.println("VALIDO");
		else System.out.println("NO VALIDO");
	}
}
