package _03ejercicios;

import java.util.Scanner;

public class _10Fuerza {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce la masa 1: ");
		double masa1 = tec.nextDouble();
		System.out.println("Introduce la masa 2: ");
		double masa2 = tec.nextDouble();
		System.out.println("Introduce la distancia: ");
		double dist = tec.nextDouble();
		double F = fuerza(masa1,masa2,dist);
		System.out.println("La Fuerza es: " + F);
	}
	
	public static double fuerza(double m1, double m2, double d){
		final double G = 6.693E-11;
		double f = (m1*m2*G)/(d*d);
		return f ;
	}

}
