package _02ejemplos;

import java.util.Scanner;

public class _01CompararStrings {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = tec.nextLine();
		
		
		//Felicitamos al usuario si es su santo
		if(nombre.toUpperCase().equals("MARCIANA")){
			System.out.println("felicidades !! hoy es tu santo");
		}
		
		//con equalsIgnoreCase
		if (nombre.equalsIgnoreCase("MARCIANO") ||
				nombre.equalsIgnoreCase("MARCIANA")){
			
			System.out.println("felicidades !! hoy es tu santo");
		}
		
		//si no es tu santo, mensaje de consolacion
		if (!(nombre.equalsIgnoreCase("MARCIANO") ||
				nombre.equalsIgnoreCase("MARCIANA"))){
			
			System.out.println("No es tu santo pero lo será pronto");
		}
	}
}
