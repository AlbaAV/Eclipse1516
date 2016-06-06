package _02FiltroConInterface;

import personas.Persona;

public class FiltroEstatura implements Filtro{

	@Override
	public boolean filtrar(Persona p){
		if(p.getEstatura() > 170) return true;
		else return false;
	}
}
