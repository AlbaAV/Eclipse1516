package _03ejercicios._04Euromillones;

import java.util.LinkedHashSet;

public class Boleto {
	private LinkedHashSet<Apuesta> apuestas;
	
	public Boleto(int numApuestas,int numNumeros, int numEstrellas, int maxNumeros,int maxEstrellas){
		apuestas = new LinkedHashSet<>();
		while (apuestas.size() < numApuestas){
			apuestas.add(new Apuesta(numNumeros,numEstrellas,maxNumeros,maxEstrellas));
		}
	}
	
	public String toString(){
		String res = "";
		for (Apuesta a : apuestas){
			res += a.toString() + "\n";
		}
		return res;
	}
}
