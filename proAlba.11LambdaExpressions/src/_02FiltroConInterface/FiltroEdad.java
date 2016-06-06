package _02FiltroConInterface;

import personas.Persona;

public class FiltroEdad implements Filtro{
	
	@Override
	public boolean filtrar(Persona p){
		if(p.getEdad() < 31) return true;
		else return false;
	}
}
