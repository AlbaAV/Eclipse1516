package _03ejercicios._05ListaEspera;

import java.util.LinkedList;
import java.util.List;

public class ListaEsperaNormal {
	private List<Paciente> listaEspera;
	
	public ListaEsperaNormal(){
		listaEspera = new LinkedList<>();
	}
	
	public void anyadir(Paciente p){
		if(!listaEspera.contains(p))
			listaEspera.add(p);
	}
	
	public Paciente consulta(){
		if(listaEspera.size() > 0) return listaEspera.get(0);
		else return null;
	}
	public void quitar(){	
		listaEspera.remove(0);
	}
	
	public String toString(){
		String res = "DNI:		" +"Nombre		" + "Edad	" + "Estado	";
		res +="\n-----		" +"---------	"+ "-----	" + "-------	\n";
		for(Paciente p : listaEspera){
			res += p.toString() + "\n";
		}
		return res;
	}
	
}
