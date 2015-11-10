package _02ejemplos;

import java.util.Scanner;

public class _04Estaciones {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int mes = tec.nextInt();
		
		switch(mes){
		case 1:
		case 2:
		case 3:
			System.out.println("Invierno");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Primavera");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Verano");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("Otoño");
			
		}
	}
}
