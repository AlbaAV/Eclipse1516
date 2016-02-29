package _03ejercicios._06juegodecartas;

public class JuegoCartas {
	public static void main(String[] args) {
		System.out.println("Introduce un ");
		Carta c1 = new Carta();
		Carta c2 = new Carta();
		
		System.out.println(c1);
		System.out.println(c2);
		
		int triunfo = (int) (Math.random()*4);
		System.out.println("La carta triunfo es: " + triunfo);
		
		int ganar = Carta.ganadora(c1,c2,triunfo);
		if(ganar == 1)
			System.out.println("Gana c2 " + "\n");
		else if(ganar == -1)
			System.out.println("Gana c1 " + "\n");
		else if(ganar == 0) 
			System.out.println("Caca " + "\n");
		
	}

}
