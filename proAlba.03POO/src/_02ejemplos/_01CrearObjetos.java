package _02ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class _01CrearObjetos {

	public static void main(String[] args) {
		Scanner tecPunto = new Scanner(System.in);
		tecPunto.useLocale(Locale.US);
		
		Scanner tecComa = new Scanner(System.in);
		
		System.out.println("Introduce tu estatura: ");
		double estatura = tecComa.nextDouble();
		System.out.println(estatura);
		
		
		System.out.println("Introduce perímetro craneal: ");
		double perimetro = tecPunto.nextDouble();
	}
}
