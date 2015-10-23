package _02ejemplos;

import java.util.Scanner;

public class _07BufferDeTeclado {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		//Vaciar intro
		tec.nextLine();
		System.out.println("Nombre: ");
		String nombre = tec.next();
		
		System.out.println("Estatura: ");
		double est = tec.nextDouble();
		
		String nombreMayus = nombre.toUpperCase();
		System.out.println(nombreMayus);
		
		System.out.println("Fin");
	}
}
