package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _15Calculadora {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce el numero 1");
		double num1 = tec.nextDouble();
		System.out.println("Introduce el operador (+,-,*,/):");
		String oper = tec.next();
		System.out.println("Introduce el numero 2");
		double num2 = tec.nextDouble();

		double total;
		if (oper.equals("+")) {
			total = num1 + num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + total);
		} else if (oper.equals("-")) {
			total = num1 - num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + total);
		} else if (oper.equals("*")) {
			total = num1 * num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + total);
		} else {
			total = num1 / num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + total);
		}

	}
}
