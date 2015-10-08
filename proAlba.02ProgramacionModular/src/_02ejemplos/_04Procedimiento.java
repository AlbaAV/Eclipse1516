package _02ejemplos;

import java.util.Scanner;

public class _04Procedimiento {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		pedir("nombre");
		String n = tec.next();
		pedir("edad");
		int e = tec.nextInt();
		pedir("estatura");
		double a = tec.nextDouble();
	}
	
	public static void pedir(String texto){
		System.out.println("Por favor, introduzca " + texto);
	}
	
	public static void despedir(){
		System.out.println("Despedido");
	}
}
