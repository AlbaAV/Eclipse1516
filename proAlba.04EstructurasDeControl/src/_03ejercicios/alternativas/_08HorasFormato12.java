package _03ejercicios.alternativas;

import java.util.Scanner;

public class _08HorasFormato12 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce la hora: (hh)");
		int hora = tec.nextInt();
		System.out.println("Introduce los minutos: (mm)");
		int min =tec.nextInt();
		
		if(hora<24 && min <60){
			if(hora==0){
				hora = 12;
				System.out.println("Hora: " + hora+":"+min+" AM");
			}else if(hora ==12){
				System.out.println("Hora: "+hora+":"+min+" PM");
			}else if(hora<12){
				System.out.println("Hora: "+hora+":"+min+" AM");
			}else {
				hora = hora -12;
				System.out.println("Hora: "+hora+":"+min+" PM");
			}
		}else
			System.out.println("La hora Introducida es incorrecta");
	}
}
