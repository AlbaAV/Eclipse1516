package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04LeerNotasRepitiendoErronea {
	final static int S = 3;
	final static int A = 2;

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int contAlumno = 0;
		while (contAlumno < A) {
			System.out.println("Alumno " + (contAlumno + 1) + ": ");

			// Pedir las notas de cada asignatura
			int contAsig = 0;
			while (contAsig < S) {
				try {
					System.out.println("Intreoduce nota de la asignatura " + (contAsig + 1) + ": ");
					double nota = tec.nextDouble();
					contAsig++;
				} catch (InputMismatchException e) {
					System.out.println("Error en la nota");
					tec.nextLine(); // Vaciar buffer
				}
			}
			// --
			contAlumno++;
		}
		// -----Con FOR
		for (int al = 0; al < A; al++) {
			System.out.println("Alumno " + (al + 1) + ": ");
			for (int as = 0; as < S; as++) {
				try {
					System.out.println("Intreoduce nota de la asignatura " + (as + 1) + ": ");
					double nota = tec.nextDouble();
				} catch (InputMismatchException e) {
					System.out.println("Error en la nota");
					tec.nextLine(); // Vaciar buffer
					as--; //Para mantenernos en la misma asignatura
				}
			}
		}

		

	}
}