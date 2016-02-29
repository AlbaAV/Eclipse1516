package _03ejercicios._06juegodecartas;

public class JuegoCartas {
	public static void main(String[] args) {
		Carta c1 = new Carta(Carta.OROS, 8);

		for (int i = 0; i < 10; i++) {
			Carta c2 = new Carta();
			int triunfo = (int) (Math.random() * 4);

			int ganadora = Carta.ganadora(c1, c2, triunfo);

			// Mostramos información
			System.out.println("Carta 1: " + c1);
			System.out.println("Carta 2: " + c2);
			System.out.println("Triunfo: " + triunfo);
			if (ganadora == 0)
				System.out.println("Empate");
			else if (ganadora == -1)
				System.out.println("Ganadora: " + c1);
			else
				System.out.println("Ganadora: " + c2);
			System.out.println("---------------");
		}
	}
}
