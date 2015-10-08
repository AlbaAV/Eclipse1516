package _03ejercicios;


import java.util.Scanner;
public class _11Circulo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la circunferencia: ");
		double radio = tec.nextDouble();
		double longitud = 2* Math.PI * radio;
		double area = Math.PI * (radio * radio);
		//area = Math.PI * Math.pow(radio,2);
		System.out.println("La longitud de la circunferencia es: " + longitud);
		System.out.println("El area de la circunferencia es: " + area);
	}
}
