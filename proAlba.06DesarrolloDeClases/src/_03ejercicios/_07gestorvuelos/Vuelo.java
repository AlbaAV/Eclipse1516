package _03ejercicios._07gestorvuelos;

import _02ejemplos.Tiempo;

public class Vuelo {
	private String identificador;
	private String origen;
	private String destino;
	private Tiempo hSalida, hLlegada;
	private String asientos[];
	private int numP;
	final static int CAPACIDAD = 50;
	
	public Vuelo(String id, String ori, String des, Tiempo hS, Tiempo hLl){
		identificador = id;
		origen = ori;
		destino = des;
		hSalida = hS;
		hLlegada = hLl;
		
		numP = 0;
		asientos = new String[CAPACIDAD+1];
	}
	
	public String getIdentificador(){
		return identificador;
	}
	public String getOrigen(){
		return origen;
	}
	public String getDestino(){
		return destino;
	}
	
	public boolean hayLibres(){
		if(numP < CAPACIDAD) return true;
		else return false;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Vuelo)) return false;
		Vuelo v = (Vuelo) o;
		return this.identificador.equals(v.identificador);
	}
	
	private int asientoLibre(char pref){
		if(pref == 'p'){
				for(int i = 2; i < asientos.length; i +=2){
					if(asientos[i] == null) return i;
				}
		} else {
			for(int i = 1; i <= CAPACIDAD; i +=2){
				if(asientos[i] == null) return i;
			}
		}
		return 0;
	}
	
	public int reservarAsiento(String pas, char pref) throws VueloCompletoException {
		if(!hayLibres()) throw new VueloCompletoException("Vuelo Llleno");
		else {
			int aLib = asientoLibre(pref);
			if(aLib == 0){
				if(pref == 'v') aLib = asientoLibre('P');
				else aLib = asientoLibre('V');
			}
			
			asientos[aLib] = pas;
			numP++;
			return aLib;
		}
	}
	
	public void cancelarReserva(int numAsiento){
		if(numAsiento <= CAPACIDAD && asientos[numAsiento] != null){
			asientos[numAsiento] = null;
			numP--;
		}
	}
	
	@Override
	public String toString(){
		String s = identificador + " " + origen + " " + destino + " " 
				+ hSalida.toString() + " " + hLlegada.toString() + "\n";
		
		s += " Pasajeros: \n";
		
		for(int i = 1; i < asientos.length; i++){
			if(asientos[i] != null) s += "Asiento " + 
					i + ": " + asientos[i] + "\n";
		}
		return s;
	}
}
