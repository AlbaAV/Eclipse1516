package _03ejercicios._02Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLibros {
	private List<Libro> catalogo;
	
	public CatalagoLibros(Libro v[]){
		catalogo = new ArrayList<>();
		for(int i = 0; i<v.length;i++){
			catalogo.add(v[i]);
		}
	}
	
	public String buscar(Libro l){
		if(catalogo.contains(l))
			return l.getEstanteria();
		else return null;
	}
	
	@Override
	public String toString()
	{
		String res ="";
		for(Libro x: catalogo)
			res += x + "\n----------------\n";
		return res;
	}
	
}
