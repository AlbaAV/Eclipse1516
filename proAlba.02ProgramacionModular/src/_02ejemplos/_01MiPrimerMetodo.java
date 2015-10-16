package _02ejemplos;

import java.util.Scanner;

public class _01MiPrimerMetodo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce el radio del circulo: ");
		double r = tec.nextDouble();
		
		double l = longitudCircunferencia(r);
		System.out.println("Longitud: " + l);
		
		System.out.println("Otra longitud:" +longitudCircunferencia(5.3));
	}
	
	public static double longitudCircunferencia(double  radio){
		double longitud = 2 * Math.PI * radio;
		return longitud;
	}
}
