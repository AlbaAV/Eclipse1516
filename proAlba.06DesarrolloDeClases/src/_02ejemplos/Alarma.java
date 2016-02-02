package _02ejemplos;

public class Alarma {
	private String tono;
	private int volumen;
	private Tiempo  tiempo;
	private boolean activada;
	
	public Alarma(String tono, int volumen, Tiempo tiempo, boolean activada){
		this.tono = tono;
		this.volumen = volumen;
		this.tiempo = tiempo;
		this.activada = activada;
	}
	
	public Alarma(){
		this.tono = " RING ";
		this.volumen = 5;
		this.tiempo = new Tiempo();
		this.activada = true;
	}
	
	public String getTono(){
		return tono;
	}
	
	public int getVolumen(){
		return volumen;
	}
	
	public Tiempo getTiempo(){
		return tiempo;
	}
	
	public boolean isActivada(){
		return activada;
	}
	
	//SETTERS
	public void setTono(String tono){
		this.tono = tono;
	}
	public void setVolumen(int volumen){
		this.volumen = volumen;
	}
	public void setTiempo(Tiempo tiempo){
		this.tiempo = tiempo;
	}
	public void setActivada(boolean activada){
		this.activada = activada;
	}
	
	public String toString(){
		String texto = "Tono: " + tono +
				"\nVolumen: " + volumen + 
				"\nTiempo: " + tiempo.toString();
		if(activada) texto += "\nACTIVA";
		else texto += "\nINACTIVA";
		return texto;
	} 
}
