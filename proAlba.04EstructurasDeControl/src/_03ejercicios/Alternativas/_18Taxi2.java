package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _18Taxi2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Hora: ");
		int hora = tec.nextInt();
		System.out.println("Minutos: ");
		int min = tec.nextInt();
		
		System.out.println("Dia (1-7): ");
		int dia = tec.nextInt();
		System.out.println("kilometros: ");
		int km = tec.nextInt();
		
		boolean esDiurno = hora >=6 && hora <= 22;
		boolean esFestivo = dia ==6 || dia == 7;
	
		double precioKm;
		if(esFestivo) precioKm =0.93;
		else{
			if(esDiurno) precioKm = 0.73;
			else precioKm = 0.84;
		}
		
		double costeTrayecto = km * precioKm;
		
		//Tarifa minima
		if(esDiurno){
			if(costeTrayecto < 2.95) costeTrayecto = 2.95;
		} else {
			if(costeTrayecto < 4) costeTrayecto = 4;
		}
	}
}
