package _03ejercicios._03contrarreloj;

import _02ejemplos.Tiempo;

/**
 * Esta clase representante un Corredor de la contrarreloj
 * @author alba
 *
 */
public class Corredor {
	private int dorsal;
	private String nombre;
	private Tiempo salida, llegada;
	private static int siguienteDorsal = 1;
	
	public Corredor(int dorsal, String nombre, Tiempo salida){
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.salida = salida;	
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tiempo getSalida() {
		return salida;
	}
	public void setSalida(Tiempo salida) {
		this.salida = salida;
	}
	
	public Tiempo getLlegada(){
		return llegada;
	}
	
	public void setLlegada(Tiempo llegada) throws IllegalArgumentException{
		if(llegada.compareTo(salida) <= 0)
			throw new IllegalArgumentException("Llegada anterior a salida: ");
		this.llegada = llegada;
	}
	
	/**
	 * Calcula el tiempo que ha costado al corredor completar el recorrido 
	 * @return el tiempo en segundos
	 * @throws UnsupportedOperationException si el instante de llegada estÃ¡ vacÃ­o
	 */
	
	public int getDuracion() throws UnsupportedOperationException {
		if(llegada == null){
			throw new UnsupportedOperationException("Falta instante de llegada");
		}else
			return salida.diferencia(llegada);
		// o bien return llegada.diferencia(salida);
	}
	
	@Override
	public String toString(){
		String mostrar;
		
		
		if(llegada == null){
			mostrar ="(" + dorsal + ") - " +nombre+ " - Salida: " + salida; 
		}else
			mostrar ="(" + dorsal + ") - " +nombre+ " - Llegada: " + llegada +" - DuraciÃ³n: " + getDuracion() + " segundos";
		
		return mostrar;
		
		/*
		 * DE ¡OTRA FORMA!
		 * String result = "(" + dorsal +") - " + nombre + " - " +salida.toString();
		 * if(llegada != null){
		 * 	result += " - " + llegada.toString() + " - " + getDuracion() + " segundos";
		 */
		
	}
	
	public String toString2(){
		String mostrar;
		try{
			mostrar ="(" + dorsal + ") - " +nombre+ " - Salida: " + salida +" - Duración: " + getDuracion() + " segundos";
		}catch(NullPointerException ex){
			mostrar ="(" + dorsal + ") - " +nombre+ " - Salida: " + salida;
		}
		
		return mostrar;
	}
	
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Corredor)) return false;
		Corredor c = (Corredor) o;
		if(this.dorsal == c.dorsal)return true;
		else return false;
		
		//o bien
		// return this.dorsal == c.dorsal;
	}
	
	public int compareTo(Object o){
		Corredor c = (Corredor) o;
		if(this.dorsal < c.dorsal)return -1;
		else if(this.dorsal > c.dorsal)return 1;
		else return 0;
	}
	
	public static int generarDorsal(){
		int d = siguienteDorsal;
		siguienteDorsal++;
		return d;
	}
	
	public static int generarDorsal2(){
		siguienteDorsal ++;
		return siguienteDorsal -1;
	}
	
	public static int generarDorsal3(){
		return siguienteDorsal ++;
	}
	
	public Corredor(String nombre, Tiempo salida){
		this.dorsal = generarDorsal();
		this.nombre = nombre;
		this.salida = salida;
	}
}
