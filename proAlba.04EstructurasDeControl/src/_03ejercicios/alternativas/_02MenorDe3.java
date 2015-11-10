package _03ejercicios.alternativas;

import java.util.Scanner;

public class _02MenorDe3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce 3 numeros ");
		
		int n1 = tec.nextInt();
		int n2 = tec.nextInt();
		int n3 = tec.nextInt();
		
		if(n1 < n2 && n1 < n3)
			System.out.println(n1 + " es menor que "+n2 + " y "+n3);
		else if(n2 < n1 && n2 < n3)
			System.out.println(n2 + " es menor que "+n1 + " y "+n3);
		else
			System.out.println(n3 + " es menor que "+n1 + " y "+n2);
		
		System.out.println();
		
		if(n1 < n2){
			if(n1 < n3)
				System.out.println(n1 + " es menor que "+n2 + " y "+n3);
			else
				System.out.println(n3 + " es menor que "+n1 + " y "+n2);
		}
		else if(n2 < n3)
				System.out.println(n2 + " es menor que "+n1 + " y "+n3);
		else if(n3 < n1)
			if(n3<n2)
				System.out.println(n3 + " es menor que "+n1 + " y "+n2);
		
		System.out.println();
		
		if(n1<n2){//n2 no es el menor
			if(n1<n3)System.out.println(n1 + " es menor que "+n2 + " y "+n3);
			else System.out.println(n3 + " es menor que "+n1 + " y "+n2);
		} else{//n1 es el menor
			if(n3<n2)System.out.println(n3 + " es menor que "+n1 + " y "+n2);
			else System.out.println(n2 + " es menor que "+n1 + " y "+n3);
		}
	}
}