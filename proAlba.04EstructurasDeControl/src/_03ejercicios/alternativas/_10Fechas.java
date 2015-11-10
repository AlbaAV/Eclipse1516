package _03ejercicios.alternativas;

import java.util.Scanner;

public class _10Fechas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce la fecha 1 (dd/mm/aaaa): ");
		String fec1 = tec.nextLine();
		System.out.println("Introduce la fecha 2(dd/mm/aaaa): ");
		String fec2 = tec.nextLine();
		
		String dia1 = fec1.substring(0,2);
		String mes1 = fec1.substring(3,5);
		String anyo1 = fec1.substring(6,10);
		
		String dia2 = fec2.substring(0,2);
		String mes2 = fec2.substring(3,5);
		String anyo2 = fec2.substring(6,10);
		
		int d1 = Integer.parseInt(dia1);//(fec1.substring(0,1))
		int m1 = Integer.parseInt(mes1);
		int a1 = Integer.parseInt(anyo1);
		
		int d2 = Integer.parseInt(dia2);
		int m2 = Integer.parseInt(mes2);
		int a2 = Integer.parseInt(anyo2);
		
		if(a1< a2){
			System.out.println( fec1 + " es menor que " + fec2);
		}else if(a1 == a2){
			if(m1<m2)
				System.out.println( fec1 + " es menor que " + fec2);
			else if(m1>m2)
				System.out.println( fec2 + " es menor que " + fec1);
			else if(m1==m2){
				if(d1 < d2)
					System.out.println( fec1 + " es menor que " + fec2);
				else if(d1>d2)
					System.out.println( fec2 + " es menor que " + fec1);
				else
					System.out.println( fec1 + " es igual que " + fec2);
			}
		}else{
			System.out.println( fec2 + " es menor que " + fec1);
				
		}
		
	}
}
