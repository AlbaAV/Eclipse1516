package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _18Taxi {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce la hora (hh:mm) ");
		String hora = tec.nextLine();
		hora = hora.substring(0, 1);
		System.out.println("Introduce el dia de la semana (1-7): ");
		int dia = tec.nextInt();
		System.out.println("Introduce la distancia en km.");
		double km = tec.nextDouble();
		int h = Integer.parseInt(hora);
		final double tDia = 2.95;
		final double tNoche = 4;
		double pKm;
		double coste;
		
		if (dia < 6) {
			if (h >= 6 && h <= 22) {
				pKm = 0.73;
				coste = (tDia + (km * pKm) ) * 100;
				coste = Math.round(coste);
				coste = coste/100;
				if(coste<2.95)
					coste = tDia;
			} else {
				coste = tNoche;
				pKm = 0.84;
				coste = tNoche + (km * pKm)*100;
				coste = Math.round(coste);
				coste = coste/100;
				if(coste < tNoche)
					coste = tNoche;
			}
		} else {
			pKm = 0.93;
			coste = km * 0.93;
		}
		System.out.println("Coste trayecto: " + coste +"�");
	}
}
