package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _03IntermedioDeTres {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce 3 numeros: ");
		int n1 = tec.nextInt();
		int n2 = tec.nextInt();
		int n3 = tec.nextInt();
		
		if(n1 > n2){
			if(n1<n3)
				System.out.println(n1 + " es el intermedio de " + n2 +" y "+n3);
			else if(n2 > n3)
				System.out.println(n2 + " es el intermedio de " + n3 +" y "+n1);
			else
				System.out.println(n3 + " es el intermedio de " + n1 +" y "+n3);
		} else {
			if(n1 > n3)
				System.out.println(n1 + " es el intermedio de " + n3 +" y "+n2);
			else if(n2 > n3)
				System.out.println(n3 + " es el intermedio de " + n2 +" y "+n1);
			else 
				System.out.println(n2 + " es el intermedio de " + n1 +" y "+n3);
		}
			
}}
