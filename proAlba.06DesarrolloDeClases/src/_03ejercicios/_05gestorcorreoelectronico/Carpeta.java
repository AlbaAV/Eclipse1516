package _03ejercicios._05gestorcorreoelectronico;

public class Carpeta {
	private Mensaje listaMensajes[];
	private int numMensajes;
	private final static int MAXM = 1;
	private String nombre;
	
	public Carpeta(String nombre){
		this.nombre = nombre;
		listaMensajes = new Mensaje[MAXM];
		numMensajes = 0;
	}
	
	public void anyadir(Mensaje m){
		if(numMensajes == listaMensajes.length){
			Mensaje aux[] = new Mensaje[listaMensajes.length*2];
			
			for(int i = 0; i < listaMensajes.length; i++){
				aux[i] = listaMensajes[i];
			}
			
			numMensajes++;
		}
	}
	
	public void borrar(Mensaje m) throws ElementoNoEncontradoException {
		boolean enc = false;
		
		int i = 0;
		while (i < numMensajes && !enc){
			if(listaMensajes[i].equals(m)) enc = true;
			else i++;
		}
		if(!enc) throw new ElementoNoEncontradoException();
		
		for(int j = i; j < numMensajes-1; j++){
			listaMensajes[j] = listaMensajes[j+1];
		}
		numMensajes--;
	}
	
	public Mensaje buscar(int codigo) throws ElementoNoEncontradoException{
		boolean enc = false;
		int i = 0;
		while(i < numMensajes && !enc){
			if(listaMensajes[i].getCodigo() == codigo) enc = true;
			else i++;
		}
		if(!enc) throw new ElementoNoEncontradoException("Mensaje no encontrado");
		else return listaMensajes[i];
	}
	
	public String toString(){
		String res = "Nombre: " + nombre + 
				"\nMensajes: ";
		for(int i = 0; i < numMensajes; i++){
			res += "\n" + listaMensajes[i].toString();
		}
		return res;
	}
	
	public static void mover(Carpeta origen,Carpeta destino, int codigo) 
			throws ElementoNoEncontradoException{
		Mensaje m = origen.buscar(codigo);
		origen.borrar(m);
		destino.anyadir(m);
		
	}
}
