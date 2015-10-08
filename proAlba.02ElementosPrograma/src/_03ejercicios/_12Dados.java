package _03ejercicios;


public class _12Dados {

	public static void main(String[] args) {
		System.out.println("Suma lanzamiento de 2 dados: ");
		int dado1 = (int)(Math.random()*6+1);
		int dado2 = (int)(Math.random()*6+1);
		System.out.println("Dado 1: " + dado1 + " y " + "Dado 2: " + dado2);
		System.out.println(dado1+dado2);
	}
}
