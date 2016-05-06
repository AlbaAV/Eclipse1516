package _03ejercicios._04Euromillones;

import java.util.TreeSet;

public class Apuesta {
	private TreeSet<Integer> numeros;
	private TreeSet<Integer> estrellas;
	
	public Apuesta(int numNumeros,int numEstrellas,int maxNumero,int maxEstrella){
		numeros = new TreeSet<>();
		estrellas = new TreeSet<>();
		
		while(numeros.size() < numNumeros){
			numeros.add((int) (Math.random()*maxNumero)+1);
		}
		while(estrellas.size() < numEstrellas){
			estrellas.add((int) (Math.random()*maxEstrella)+1);
		}
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Apuesta)) return false;
		Apuesta a = (Apuesta) o;
		return this.numeros.equals(a.numeros) && this.estrellas.equals(a.estrellas);
	}
	
	public String toString(){
		String res = "";
		for(Integer i : numeros){
			res += String.format("%02d ",i);
		}
		res += "(";
		for (Integer i: estrellas){
			res += String.format("%02d ",i);
		}
		res += ")";
		return res;
	}

}
