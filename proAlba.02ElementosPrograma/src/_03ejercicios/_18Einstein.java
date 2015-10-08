package _03ejercicios;

import java.util.*;
public class _18Einstein {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la masa: ");
		double m = tec.nextDouble();
		final double c = 2.997925E8;
		
		double energia = m * Math.pow(c, 2);
		System.out.println("La energia es: " + energia);
	}

}
