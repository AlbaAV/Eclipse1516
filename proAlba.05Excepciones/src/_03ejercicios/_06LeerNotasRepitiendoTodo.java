package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06LeerNotasRepitiendoTodo {
	final static int S = 3;
	final static int A = 2;
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		boolean todoLeido = false;
		do{
			try {
				int contAlumno = 0;
				while (contAlumno < A){
					System.out.println("Alumno "+ (contAlumno + 1)+ ": " );
					
					//Pedir las notas de cada asignatura
					int contAsig = 0;
					while(contAsig < S){
						System.out.println("Intreoduce nota de la asignatura " + (contAsig + 1) + ": ");
						double nota = tec.nextDouble();
						
						contAsig ++;
					}
					//--
					contAlumno++;
				}
				todoLeido = true;
			} catch (InputMismatchException e) {
				System.out.println("Error en la nota");
				tec.nextLine(); // Vaciar buffer
			}
		} while(!todoLeido);
		// -----Con FOR
		todoLeido = false;
		do{
			try {
				for(int al = 0; al < A; al++){
					System.out.println("Alumno "+ (al + 1)+ ": " );
					for (int as = 0; as < S; as++){
						System.out.println("Intreoduce nota de la asignatura " + (as + 1) + ": ");
						double nota = tec.nextDouble();
					}
				}
				todoLeido = true;
			} catch (InputMismatchException e) {
				System.out.println("Error en la nota");
				tec.nextLine(); // Vaciar buffer
			}
		} while(!todoLeido);
		

	}
}