package _01pruebas;

import java.util.Scanner;

public class _03Intermedio {
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce 3 numeros: ");
		int n1 = tec.nextInt();
		int n2 = tec.nextInt();
		int n3 = tec.nextInt();
	//Forma 2
			if(n1<n2){
				if(n2>n3)
					System.out.println(n1 +" es el intermedio entre " + n2 + " y " + n3);
				else if(n2>n3)
					System.out.println(n2 +" es el intermedio entre " + n1 + " y " + n3);
				else
					System.out.println(n3 +" es el intermedio entre " + n1 + " y " + n2);
			} else if(n1<n2) {
				if(n2>n3)
					System.out.println(n1 +" es el intermedio entre " + n2 + " y " + n3);
				else if(n2<n1)
					System.out.println(n2 +" es el intermedio entre " + n1 + " y " + n3);
				else
					System.out.println(n3 +" es el intermedio entre " + n1 + " y " + n2);
			}
	}
}
