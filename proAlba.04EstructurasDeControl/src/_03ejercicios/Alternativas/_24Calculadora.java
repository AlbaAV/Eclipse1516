package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _24Calculadora {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce el numero 1");
		int num1 = tec.nextInt();
		System.out.println("Introduce el operador");
		char op = tec.next().charAt(0);
		System.out.println("Introduce el numero 2");
		int num2 = tec.nextInt();
		
		switch(op){
		case '+': 
			System.out.println(num1 +" + " + num2 + " = "+ (num1+num2));
			break;
		case '-': 
			System.out.println(num1 +" - " + num2 + " = "+ (num1-num2));
			break;
		case '*':
			System.out.println(num1 +" * " + num2 + " = "+ (num1*num2));
			break;
		case '/':
			System.out.println(num1 +" / " + num2 + " = "+ (num1/num2));	
			break;
		default:
			System.out.println("Operador Incorrecto");
			break;
		}
	}
}
