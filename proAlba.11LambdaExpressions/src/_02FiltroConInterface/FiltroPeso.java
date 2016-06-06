package _02FiltroConInterface;

import personas.Persona;

public class FiltroPeso implements Filtro{
	
	@Override
	public boolean filtrar(Persona p){
		if(p.getPeso() > 60) return true;
		else return false;
	}
}
