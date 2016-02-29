package _03ejercicios._04gestionlibreria;

public class ListaReservas {
	public final static int MAXR = 100;
	private Reserva lista[];
	private int numReservas;
	
	public ListaReservas(){
		lista = new Reserva[MAXR];
		numReservas = 0;
	}
	
	public void reservar(String nif, String nombre, String tel, int libro, int ejemplares)
		throws ListaLlenaException, ElementoDuplicadoException
	{
		//if(numReservas == MAXR)
		if(numReservas == lista.length) throw new ListaLlenaException("Lista Llena");
		
		Reserva r = new Reserva(nif,nombre,tel, libro, ejemplares);
		
		//Comprobamos si es un duplicado
		boolean enc = false;
		
		for(int i = 0; i < numReservas && !enc; i++){
			if(lista[i].equals(r)) enc = true;
		}
		
		if(enc) throw new ElementoDuplicadoException(" La reserva ya existe");
		
		//Anyadimos la reserva
		lista[numReservas] = r;
		numReservas++;
		
		// o bien...
		// lista[numReservas++] = r;
	}
	
	public void cancelar(String nif, int libro) throws ElementoNoEncontradoException{
		boolean enc = false;
		for(int i = 0; i < numReservas && !enc; i++){
			if(lista[i].getNif().equals(nif) && lista[i].getCodigo() == libro)
			{
				enc = true;
				
				//Eliminar la reserva de la posicion i
				for(int j = i; j < numReservas-1; j++){
					lista[j] = lista[j+1];
				}
				numReservas--;
			}
			if(!enc) throw new ElementoNoEncontradoException("La reserva no existe");
		}
	}

	public String toString(){
		String res = " ";
		for(int i = 0; i < numReservas; i++){
			res += lista[i].toString() + "\n";
		}
		return res;
	}
	
	public int numEjemplaresReservadosLibro(int codigo){
		int cont = 0;
		for(int i = 0; i < numReservas; i++){
			if(lista[i].getCodigo() == codigo){
				cont += lista[i].getEjemplares();
			}
		}
		return cont;
	}
	
	public void reservasLibro(int codigo){
		for(int i = 0; i < numReservas; i++){
			if(lista[i].getCodigo() == codigo){
				System.out.println("Nombre : " + lista[i].getNombre());
				System.out.println("Telefono : " + lista[i].getTel());
				System.out.println("---------------------");
			}
		}
	}
}
