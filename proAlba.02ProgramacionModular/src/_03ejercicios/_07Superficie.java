package _03ejercicios;

import java.util.Scanner;

public class _07Superficie {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce el largo: ");
		double l = tec.nextDouble();
		System.out.println("Introduce el ancho: ");
		double a =tec.nextDouble();
		double s = superficie(l,a);
		System.out.println("La superficie es: " + s);}
	
	public static double superficie(double largo,double ancho){
		double sup = largo * ancho;
		return sup;
	}

}
