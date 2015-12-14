package _03ejercicios.BuclesAnidados;

import java.util.Scanner;

public class _03NotasPorAsignatura{

	final static int A = 2;
	final static int S = 3;

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		
		for (int as =0; as < S ; as++){
			double media = 0;
			double suma = 0;
			System.out.println("Asignatura " + (as + 1)+": ");
			for(int al =0; al < A; al++){
				System.out.println("Introduce la nota del alumno " + (al + 1) +": ");
				double nota = tec.nextDouble();
				suma += nota;
			}
			media = (suma/A);
			System.out.println("Media: " + media);
		}
		
	}
}