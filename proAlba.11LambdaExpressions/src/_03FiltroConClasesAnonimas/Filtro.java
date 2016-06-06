package _03FiltroConClasesAnonimas;

import personas.Persona;

public interface Filtro {
	/**
	 * Devuelve true si la persona cumple el filtro deseado y false en caso contrario
	 * @param p La persona que se va a evaluar
	 * @return
	 */
	boolean filtrar(Persona p);
}
