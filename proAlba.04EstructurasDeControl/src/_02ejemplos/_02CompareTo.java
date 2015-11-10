package _02ejemplos;

import java.util.Scanner;

public class _02CompareTo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		//CompareTo devuelve un entero negativo si el primer String es menor
		System.out.println("aaa".compareTo("bb"));
		
		//el criterio de comparación no es la longitud, sino en base a los códigos numéricos de los caracteres
		System.out.println("a".compareTo("A"));
		System.out.println("Hola".compareTo("Hola"));
		
		//El usuario introduce dos nombres y los mostramos por orden alfabético
		System.out.println("Primer nombre: ");
		String nombre1 = tec.nextLine();
		System.out.println("Segundo nombre: ");
		String nombre2 = tec.nextLine();
		
		if(nombre1.compareTo(nombre2)<0){
			//nombre1 es menor
			System.out.println(nombre1);
			System.out.println(nombre2);
		} else if(nombre1.compareTo(nombre2)>0){
			//nombre2 es menor
			System.out.println(nombre2);
			System.out.println(nombre1);
		} else{
			//Son iguales
			System.out.println(nombre1);
		}
	}
}
