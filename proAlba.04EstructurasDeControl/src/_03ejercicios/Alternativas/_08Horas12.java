package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _08Horas12 {
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
		}else{
			System.out.println("La hora Introducida es incorrecta");
		}
		
		System.out.println();
		
		//Con format
//		if(hora<24 && min <60){
//			if(hora==0){
//				hora = 12;
//				System.out.format("%02d:%02d%AM",hora,min);
//			}else if(hora ==12){
//				System.out.format("%02d:%02d%PM",hora,min);
//			}else if(hora<12){
//				System.out.format("%02d:%02d%AM",hora,min);
//			}else {
//				hora = hora -12;
//				System.out.format("%02d:%02d%PM",hora,min);
//			}
//		}else
//			System.out.println("La hora Introducida es incorrecta");
	}
}
