package _03ejercicios._06conjuntos;

public interface Conjunto <T> {
	void anyadir(T e)throws ElementoDuplicado;
	
	void quitar(T e)throws ElementoNoEncontrado;

	Conjunto <T> interseccion(Conjunto<T> c);
	
	boolean pertenece(T e);
}
