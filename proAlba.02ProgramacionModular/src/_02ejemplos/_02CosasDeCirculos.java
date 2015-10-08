package _02ejemplos;

import java.util.Scanner;

public class _02CosasDeCirculos {

	public static void main (String[] args){
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce el radio: ");
		double r = tec.nextDouble();
		
		System.out.println("Longitud: " + Circulos.longitud(r));
		System.out.println("Area: " + Circulos.area(r));
		System.out.println("Volumen: " + Circulos.volumen(r));
	}
}
