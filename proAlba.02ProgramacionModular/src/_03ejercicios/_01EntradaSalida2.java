package _03ejercicios;

import java.util.*;

public class _01EntradaSalida2 {
	public static void main(String[] args){
		/*
		 * Con 2 modulos
		 * 1º Lee un texto
		 * 2ºLee el entero; con declaracion de variable int
		 */
		System.out.println("leerTexto y leerEntero");
		leerTexto("Introduce un nº entero: ");
		int a = leerEntero();
		leerTexto("Introduce otro nº entero: ");
		int b = leerEntero();
		
		/*
		 * un solo modulo
		 * no hace falta declarar variables es todo texto
		 */
		
		System.out.println("leerEntero2");
		leerEntero2("Introduce un numero: " );
		leerEntero2("Introduce otro numero: " );
		

		System.out.println("leerEntero3");
		System.out.println(leerEntero3("Introduce un numero: " ));
		System.out.println(leerEntero3("Introduce otro numero: " ));
		
	}
	//Modulo leerTexto
	public static void leerTexto(String texto){
		System.out.println(texto);
		
	}
	//Modulo leerEntero
	public static int leerEntero(){
		Scanner tec = new Scanner(System.in);
		int num = tec.nextInt();
		//System.out.println(num);
		return num;
		
	}
	
	//Modulo leerEntero3 texto e int
	public static void leerEntero2(String texto){
		Scanner tec = new Scanner(System.in);
		String text;
		System.out.println(texto);
		String num = tec.next();

	}
	
//	Modulo leerEntero3 todo es texto
		public static int leerEntero3(String text){
		Scanner tec = new Scanner(System.in);
		System.out.println(text);
		int num = tec.nextInt();
		return num;

	}
	
	
}
