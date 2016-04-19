package _03ejercicios._06conjuntos;

public class ConjuntoArray <T> implements Conjunto<T>{
	private final static int MAX = 10;
	private T[] elementos;
	private int numElementos;
	
	public ConjuntoArray(){
		elementos = (T[]) new Object[MAX];
		numElementos = 0;
	}
	
	public ConjuntoArray(T elem[]){
		elementos = elem;
		numElementos = elementos.length;
	}
	
	@Override
	public void anyadir(T e) throws ElementoDuplicado {
		if(numElementos == elementos.length){
			T[] aux = (T[]) new Object[numElementos * 2];
			for(int i = 0; i < elementos.length;i++){
				aux[i] = elementos[i];
			}
			elementos = aux;
		}
		
		//Comprobamos si es un duplicado
		boolean enc = false;
		for(int i = 0; i < numElementos;i++){
			if(elementos[i].equals(e)){
				enc = true;
			}
		}
		if(enc) throw new ElementoDuplicado();
		else{
			elementos[numElementos] = e;
			numElementos++;
		}
	}
	
	@Override
	public void quitar (T e)throws ElementoNoEncontrado{
		boolean enc = false;
		int pos = 0;
		for(int i = 0; i < numElementos && !enc; i++){
			if(elementos[i].equals(e)){
				enc = true;
				pos = i;
			}
		}
		if(enc){
			for(int i = pos; i < numElementos-1;i++){
				elementos[i] = elementos[i+1];
			}
			numElementos--;
		}else throw new ElementoNoEncontrado();
		
		// o ****
		/*
		 * if(!enc)throw new ElementoNoEncontrado();
		 * for(int i = pos; i < numElementos-1;i++){
		 * 		elementos[i] = elementos[i+1];
		 * }
		 * numElementos--;
		 */
	}
	
	@Override
	public Conjunto <T> interseccion(Conjunto<T> c) {
		Conjunto <T> result = new ConjuntoArray <>();
		for(int i = 0; i < numElementos; i++){
			if(c.pertenece(elementos[i])){
				try{
					result.anyadir(elementos[i]);
				}catch(ElementoDuplicado ex){
					
				}
			}
		}
		return result;
	}
	
	@Override
	public boolean pertenece(T e) {
		boolean enc = false;
		for(int i = 0; i < numElementos;i++){
			if(elementos[i].equals(e)){
				enc = true;
			}
		}
		return enc;
	}
	
	
}
