package _03ejercicios;

import java.util.*;
public class _07Superficie {
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce la longitud: ");
		double l = tec.nextDouble();
		
		System.out.println("Introduce la anchura: ");
		double a = tec.nextDouble();
		
		double s = l * a;
		System.out.println("La superficie es: " + s);
		
	}

}
