package _03ejercicios._04Euromillones;

public class Euromillones {
	public static void main(String[] args) {
		System.out.println("APUESTA: ");
		Apuesta a = new Apuesta(5,2,50,11);
		System.out.println(a);
		System.out.println("\n---------------------------------------------\n");
		System.out.println("BOLETO: ");
		Boleto b = new Boleto(2,5,2,50,11);
		System.out.println(b);
		
	}
}
