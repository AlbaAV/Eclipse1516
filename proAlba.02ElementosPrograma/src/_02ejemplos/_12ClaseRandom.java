package _02ejemplos;

import java.util.Random;
public class _12ClaseRandom {

	public static void main(String[] args) {
		Random r = new Random();
		
		//Permite generar numeros de distinto tipo
		System.out.println(r.nextInt());
		System.out.println(r.nextDouble());
		
		//Permite generear numeros enteros en un rango
		System.out.println(r.nextInt(100));
		
		
		//Permite reproducir un experimento aleatorio
		
		Random r2 = new Random(10);
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
	}
}
