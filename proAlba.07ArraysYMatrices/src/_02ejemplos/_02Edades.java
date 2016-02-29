package _02ejemplos;

import java.util.Scanner;

public class _02Edades {
	/**
	 * Pedir al usuario la edad de las personas que han venido a clase en un día cualquiera
	 * Y mostrar la media de edad
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Cuantos alumnos han venido?: ");
		int numAlumnos = tec.nextInt();
		
		//Array para las edades
		int edad[] = new int[numAlumnos];
		int suma = 0;		
		for(int i=0; i<numAlumnos ; i++){
			System.out.println("Edad " + (i+1) + ": ");
			edad[i] = tec.nextInt();
			suma += edad[i];
		}
		
		
	}
}
