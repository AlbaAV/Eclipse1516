package _03ejercicios;

import java.util.*;

public class _01EntradaSalida {
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		leerEntero("Introduce nº entero ");
		int a = tec.nextInt();
		leerEntero("Introduce otro nº entero ");
		int b = tec.nextInt();
	}
	
	public static void leerEntero(String texto){
		System.out.println(texto);
	}
}
