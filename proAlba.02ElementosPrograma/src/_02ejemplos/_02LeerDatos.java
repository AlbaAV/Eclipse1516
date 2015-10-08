package _02ejemplos;

import java.util.Scanner;

public class _02LeerDatos {
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		int edad = tec.nextInt();
		
		System.out.println("Introduce tu estatura: ");
		double estatura = tec.nextDouble();
		
		System.out.println("Introduce tu nombre: ");
		String nombre = tec.next();
		
		
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " años y mides " + estatura + " metros.");
		System.out.format("Te llamas %s, tienes %d años y mides %f metros%n", nombre,edad,estatura);
	}

}
