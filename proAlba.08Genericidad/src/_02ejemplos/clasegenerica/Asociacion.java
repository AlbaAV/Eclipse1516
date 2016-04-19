package _02ejemplos.clasegenerica;

public class Asociacion <T>{
	public final static int MAX = 10;
	private T presidente;
	private T tesorero;
	private T secretario;
	private T[] miembros;
	private int numMiembros;
	
	public Asociacion(T p, T tes, T s){
		this.presidente = p;
		this.tesorero = tes;
		this.secretario = s;
		// --> NO se puede en genéricos --> this.numMiembros = new T[MAX];
		
		miembros = (T[]) new Object[MAX];
	}
	
	public T getPresidente(){
		return presidente;
	}
	
	public void setPresidente(T presidente){
		this.presidente = presidente;
	}
	
	public T getTesorero(){
		return tesorero;
	}
	public void setTesorero(T tesorero){
		this.tesorero = tesorero;
	}
	
	public T getSecretario(){
		return secretario;
	}
	public void setSecretario(T secretario){
		this.secretario = secretario;
	}
	
	@Override
	public String toString(){
		String res ="Presidente: " + presidente +
				"\nTesorero: " + tesorero +
				"\nSecretario: " + secretario + 
				"\nMiembros: \n";
		for(int i = 0; i < numMiembros; i++){
			res += "\n" + miembros[i].toString(); 
		}
		return res;	
	}
	
	public void anyadirMiembro(T m){
		if(numMiembros == miembros.length){
			T[] aux = (T[]) new Object[numMiembros * 2];
			for(int i = 0; i < miembros.length;i++){
				aux[i] = miembros[i];
			}
			miembros = aux;
		}
		miembros[numMiembros] = m;
		numMiembros++;
	}
	
	public void quitarMiembro(T m)throws ElementoNoEncontrado{
		boolean enc = false;
		int pos = 0;
		for(int i = 0; i < numMiembros && !enc; i++){
			if(miembros[i].equals(m)){
				enc = true;
				pos = i;
			}
		}
		if(enc){
			for(int i = pos; i < numMiembros-1;i++){
				miembros[i] = miembros[i+1];
			}
			numMiembros--;
		}else throw new ElementoNoEncontrado();
	}
}
