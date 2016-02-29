package ejercio4;

public class Catalogo {
	private final static int MAXM = 50;
	private Modelo lista[];
	private int numModelos;
	
	public Catalogo(){
		lista = new Modelo[MAXM];
		numModelos = 0;
	}
	
	public void anyadir(Modelo m) throws CatalogoLlenoException{
		if(numModelos == lista.length) 
			throw new CatalogoLlenoException("El catalogo está lleno no se pueden anyadir más modelos");
		boolean enc = false;
		int pos = 0;
		for(int i = 0; i < numModelos; i++){
			if(lista[i].equals(m)){
				enc = true;
				pos = i;
			}
		}
		if(enc) {
			//Sobreescribimos
			lista[pos] = m;
		}
		else {
			lista[numModelos] = m;
			numModelos ++;
		}
	}
	
	
	@Override
	public String toString(){
		String res = "";
		for(int i = 0; i < numModelos; i++){
			res += "Modelo " + (i+1) + ": " + lista[i].toString();
			
			if(lista[i].aptoPlanPIVE()) res += " - APTO - ";
			else res += " - NO APTO - ";
			
			res += Modelo.tasaPorEmisiones(lista[i].getEmisiones()) + "\n";
		}
		return res;
	}
	
	public boolean ordenadoPorEmisiones(){
		boolean enc = false;
		for(int i = 0; i < numModelos-1 && !enc; i++){
			if(lista[i].getEmisiones() > lista[i+1].getEmisiones()) enc = true;
		}
		if(enc) return false;
		else return true;
		// return !enc;	
	}
	
	public boolean ordenadorPorEmisiones2(){
		boolean ordenado = true;
		for(int i = 0; i < numModelos-1 && ordenado; i++){
			if(lista[i].getEmisiones() > lista[i+1].getEmisiones()) ordenado = false;
			
		}
		if(ordenado) return true;
		else return false;
		//return ordenado;
	}
	
	public Modelo masAntiguo()
	{	
		Modelo masAnt = lista[0];
		for(int i = 1 ; i < numModelos; i++){
			if(lista[i].getAnyo() < masAnt.getAnyo()){
				masAnt = lista[i];
			}
		}
		return masAnt;
	}
	
	public Modelo masAntiguoDeEsteSiglo(){
		Modelo masAnt = null;
		for(int i = 0; i < numModelos; i++){
			if(lista[i].getAnyo() > 2000){
				if(masAnt == null || lista[i].getAnyo() < masAnt.getAnyo()){
					masAnt = lista[i];
				}
			}
		}
		return masAnt;
	}
	
	public Modelo menor(){
		Modelo menor = lista[0];
		for(int i = 1; i < numModelos; i++){
			if(lista[i].compareTo(menor) < 0){
				menor = lista[i];
			}
		}
		return menor;
	}
}
