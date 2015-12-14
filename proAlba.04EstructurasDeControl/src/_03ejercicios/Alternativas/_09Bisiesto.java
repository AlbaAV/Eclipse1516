package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _09Bisiesto {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce el anyo: ");
		int anyo = tec.nextInt();
		if(esBisiesto(anyo))System.out.println("El anyo " + anyo +" es bisiesto");
		else System.out.println("El anyo " + anyo+ " no es bisiesto");
	}
		public static boolean esBisiesto(int anyo){
			boolean Bisiesto = (anyo%400 == 0 || (anyo%4 ==0 && anyo%100 !=0));
			return Bisiesto;
		}
}
