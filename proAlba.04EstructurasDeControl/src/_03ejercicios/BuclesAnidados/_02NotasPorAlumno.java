package _03ejercicios.BuclesAnidados;

import java.util.Scanner;

public class _02NotasPorAlumno {

	final static int A = 2;
	final static int S = 3;

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int contAlumno = 0;
		int contS = 0;
		
		System.out.println("Bucles anidados while");
		
		while (contAlumno < A) {
			System.out.println("Alumno " + (contAlumno + 1) + ": ");

			// Pedir las notas de cada asignatura

			int contAsig = 0;
			while (contAsig < S) {
				System.out.println("Introdue nota de la asignatura " + (contAsig + 1) + ": ");
				double nota = tec.nextDouble();

				contAsig++;
			}

			// ------------
			contAlumno++;
		}
		System.out.println();
		System.out.println("Bucles anidados for");
		System.out.println();
		
		for (int al =0; al < A ; al++){
			System.out.println("Alumno " + (al + 1)+": ");
			for(int as =0; as < S; as++){
				System.out.println("Introduce la nota de la asignatura " + (as + 1) +": ");
				double nota = tec.nextDouble();
			}
		}
	}
}
