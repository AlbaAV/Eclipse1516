package _03ejercicios;

import java.util.Scanner;
public class _04Por2 {
	public static void main(String[] args){	
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = tec.nextInt();
		
		//al vuelo
		System.out.println("// Con declaracion al vuelo num * 2");
		System.out.println("El doble de " + num + " es " + (num * 2));
		System.out.format("El doble de %d es %d%n",num, (num*2));
		
		//Declaracion de otra variable
		int num2= num * 2;
		System.out.println();
		System.out.println("// Con declaracion de otra variable num2");
		System.out.println("El doble de " + num + " es " + num2);
		System.out.format("El doble de %d es %d%n",num, num2);
		
		
	}

}
