package _03ejercicios;

import java.util.*;

public class _13UltimaCifra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int a = tec.nextInt();
		
		int ultimaCifra = a%10;
		System.out.println("La ultima cifra es: " + ultimaCifra);
		System.out.format("La ultima cifra de %d es %d$n",a,ultimaCifra);

	}

}
