package _03ejercicios.alternativas;

import java.util.Scanner;

public class _15Calculadora2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce numero operador y numero");
		double num1 = tec.nextDouble();
		char op = tec.next().charAt(0);
		double num2 = tec.nextDouble();
		
		if(op == '+') System.out.println(num1 + num2 );
		else if(op == '-') System.out.println(num1 + num2 );
		else if(op == '*') System.out.println(num1 + num2 );
		else if(op == '/') System.out.println(num1 + num2 );
		else System.out.println("Operador incorrecto");
	}
}
