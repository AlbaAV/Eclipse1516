package _03ejercicios.alternativas;

import java.util.Scanner;
public class _08Hora12 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce la hora: hh");
		int hora = tec.nextInt();	
		System.out.println("Introduce los minutos: mm");
		int min = tec.nextInt();
		
		
		//Forma larga; muchas sentencias if
		if (hora == 00){
			hora = 12;
			System.out.println("Hora: " + hora + ":"+min + " AM");
		}else if(hora < 12){
			System.out.println("Hora: " + hora + ":" + min + "PM");
		}else if(hora == 13){
			hora = 1;
			System.out.println("Hora: "+hora+":"+min+" PM");
		}else if(hora == 14){
			hora = 2;
			System.out.println("Hora: "+hora+":"+min+" PM");
		}
		else if(hora == 15){
			hora = 3;
			System.out.println("Hora: "+hora+":"+min+" PM");
		}
		else if(hora == 16){
			hora = 4;
			System.out.println("Hora: "+hora+":"+min+" PM");
		}
		else if(hora == 17){
			hora = 5;
			System.out.println("Hora: "+hora+":"+min+" PM");
		}
		else if(hora == 18){
			hora = 6;
			System.out.println("Hora: "+hora+":"+min+" PM");
		}else if(hora == 19){
			hora = 7;
			System.out.println("Hora: "+hora+":"+min+" PM");
		}else if(hora == 20){
			hora = 8;
			System.out.println("Hora: "+hora+":"+min+" PM");
		}else if(hora == 21){
			hora = 9;
			System.out.println("Hora: "+hora+":"+min+" PM");
		}else if(hora == 22){
			hora = 10;
			System.out.println("Hora: "+hora+":"+min+" PM");
		}else if(hora == 23){
			hora = 11;
			System.out.println("Hora: "+hora+":"+min+" PM");
		}
		
	}
}
