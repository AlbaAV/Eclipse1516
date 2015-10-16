package _03ejercicios;

import java.util.Scanner;
public class _09Segundos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce una cantidad de segundos: ");
		int seg = tec.nextInt();
		
		int min = seg/60;
		int restSeg = seg%60;
		
		int hora = min/60;
		int restMin = min%60;
		
		
		int dia = hora/24;
		int restHora = hora%24;
		
		System.out.println(seg + " son : ");
		System.out.println(dia + " dias");
		System.out.println(restHora + " horas");
		System.out.println(restMin + " minutos");
		System.out.println(restSeg + " seg");
		
		
	}

}
