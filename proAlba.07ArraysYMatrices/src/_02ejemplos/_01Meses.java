package _02ejemplos;

import java.util.Scanner;

public class _01Meses {
	public static void main(String[] args) {
		String nombreMes[] = {"", "enero", "febrero","marzo","abril","mayo","junio",
				"julio","agosto","wsep","oct","nov","dic"};
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero de mes");
		int mes = tec.nextInt();
		
		
		
		System.out.println("Nombre del mes: " + nombreMes[mes]);
		switch(mes){
		case 1: System.out.println("enero"); break;
		case 2: System.out.println("febrero"); break;
		}
	}
}
