package _03ejercicios._03contrarreloj;

public class ListaCorredores {
	private final static int MAXC = 200;
	private Corredor lista[];
	private int numCorredores;
	
	public ListaCorredores(){
		lista = new Corredor[MAXC];
		numCorredores = 0;
	}
	
	public void anyadir(Corredor c) throws ElementoDuplicadoException {
		if (numCorredores == lista.length) {
			// hacemos el array mas grande
			Corredor aux[] = new Corredor[lista.length * 2];
			for (int i = 0; i <lista.length; i++) {
				aux[i] = lista[i];
			}
			lista = aux;
		}
		// Buscamos al corredor c y si esta excepcion
		boolean enc = false;
		for (int i = 0; i < numCorredores && !enc; i++) {
			if (lista[i].equals(c))
				enc = true;
		}
		if (enc)
			throw new ElementoDuplicadoException("El corredor " + c.getDorsal() + " ya existe");
		lista[numCorredores] = c;
		numCorredores++;
	}
	public void insertarOrdenado(Corredor c){
		boolean enc = false;
		int pos=0;
		for (int i = 0; i < numCorredores && !enc; i++) {
			if (lista[i].getDuracion()>c.getDuracion())
			{
				enc = true;
				pos=i;
		}
		
		}
		if (enc){
			//DEsplazamos elementos a la derecha
			for(int i=numCorredores-1;i>=pos;i--){
				lista[i+1]=lista[i];
			}
			//Insertamos
			lista[pos]=c;
			numCorredores++;
		}else{
			//Añadimos corredor al final
			lista[numCorredores]=c;
			numCorredores++;
		}

	}
	public Corredor quitar(int dorsal) throws ElementoNoEncontradoException
	{
		boolean enc = false;
		int pos = 0;
		for(int i = 0; i < numCorredores && !enc; i++){
			if(lista[i].getDorsal() == dorsal) {
				enc = true;
				pos = i;
			}
		}
		if(enc){
			Corredor result = lista[pos]; //Guardamos el corredor que hay que devolver
			//Eliminamos de la lista la posicion pos
			for(int i = pos; i < numCorredores-1;i++){
				lista[i] = lista[i+1];
			}
			lista[numCorredores-1] = null;
			numCorredores--;
			return result;
		} else throw new ElementoNoEncontradoException("El corredor " + dorsal + " no existe");
	}
	
	@Override
	public String toString(){
		String res ="";
		for(int i = 0; i < numCorredores; i++){
			res += "Posicion " + (i+1) + ": " + lista[i].toString() + "\n"; 
		}
		return res;
	}
}
