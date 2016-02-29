package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05LeerNotasRepitiendoAlumno {
	final static int S = 3;
	final static int A = 2;

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int contAlumno = 0;
		while (contAlumno < A) {
			System.out.println("Alumno " + (contAlumno + 1) + ": ");
			int contAsig = 0;
			try {
				// Pedir las notas de cada asignatura

				while (contAsig < S) {
					System.out.println("Introduce nota de la asignatura " + (contAsig + 1) + ": ");
					double nota = tec.nextDouble();

					contAsig++;
				}
				// --
				contAlumno++;
			} catch (InputMismatchException e) {
				System.out.println("Error en la nota");
				tec.nextLine(); // Vaciar buffer
				contAsig = 0; // Volver a la primera asignatura
			}
		}
		// -----Con FOR
		for (int al = 0; al < A; al++) {
			try {
				System.out.println("Alumno " + (al + 1) + ": ");
				for (int as = 0; as < S; as++) {
					System.out.println("Introduce nota de la asignatura " + (as + 1) + ": ");
					double nota = tec.nextDouble();
				}
			} catch (InputMismatchException e) {
				System.out.println("Error en la nota");
				tec.nextLine(); // Vaciar buffer
				al--; // Para permanecer en el mismo alumno
			}
		}

	}
}