package _02ejemplos;

import java.util.Scanner;

public class _03CondicionalSimple {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		int edad = tec.nextInt();
		
		if(edad >= 18)
			System.out.println("Puedes obtener el carné de conducir");
		
		System.out.println("Introduce estatura: ");
		double est = tec.nextDouble();
		if(est > 1.90){
			System.out.println("Eres muy alto");
			System.out.println("Deberías jugar al baloncesto");
		}
		System.out.println("Introduce peso: ");
		double peso = tec.nextDouble();
		
		if(peso > 120){
			System.out.println("Tienes sobrepeso");
			System.out.println("Puedes practicar rugby");
		} else {
			System.out.println("Estas en forma");
		}
	}
}
