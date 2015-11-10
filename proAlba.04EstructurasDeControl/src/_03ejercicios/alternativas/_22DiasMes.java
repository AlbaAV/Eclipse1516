package _03ejercicios.alternativas;

import java.util.Scanner;

public class _22DiasMes {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce el mes (1-12)");
		int mes = tec.nextInt();
		int dias;
		
		switch(mes){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			System.out.println("Mes " + mes +"  "+ "Dias: " + dias);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			System.out.println("Mes " + mes +"  "+ "Dias: " + dias);
			break;
		case 2:
			dias = 28;
			System.out.println("Mes " + mes +"  "+ "Dias: " + dias);
			break;
		default:
			System.out.println("Numero de mes incorrecto");
			break;
		}
	}
}
