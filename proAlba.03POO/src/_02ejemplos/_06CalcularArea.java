package _02ejemplos;

import java.util.Scanner;

import figuras.Circulo;

public class _06CalcularArea {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce el radio del círculo: ");
		double radio = tec.nextDouble();
		
		double area = Circulo.area(radio);
		System.out.println("El area es: " + area);
		
		Circulo c = new Circulo(0,0,10);
		double longitud = c.longitud();
		System.out.println("La longitud es: " + longitud);
		//No deja por ser NO estático double longitud = Circulo.longitud();
	}
}
