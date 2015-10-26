package _03ejerciciosStrings;

import java.util.Scanner;

public class _04DesplazarIzquierda {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		String texto = tec.next();
		char inicial  = texto.charAt(0);
		String cpTexto = texto.substring(1)+inicial;
		System.out.println("Desplazar a la izquierda: " + cpTexto);
		
	}
}
