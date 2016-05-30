package _03ejercicios._05ListaEspera;

import java.util.SortedSet;
import java.util.TreeSet;

public class ListaEsperaGravedad {

	private SortedSet<Paciente> listaEsperaG;
	
	public ListaEsperaGravedad(){
		listaEsperaG = new TreeSet<>();
	}
	
	public void anyadir(Paciente p){
			listaEsperaG.add(p);
	}
	public Paciente consulta(){
		return listaEsperaG.first();
	}
	
	public void quitar(){
		if(listaEsperaG.size() > 0){
			listaEsperaG.remove(consulta());
		}
	}
	
	public String toString(){
		String res = "";
		for(Paciente p : listaEsperaG){
			res += p.toString() + "\n";
		}
		return res;
	}
	
}
