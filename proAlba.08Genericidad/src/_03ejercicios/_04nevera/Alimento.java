package _03ejercicios._04nevera;

public class Alimento implements Comparable{
	private String nombre;
	private int calorias;
	
	public Alimento(String n, int c){
		nombre = n;
		calorias = c;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	
	@Override
	public String toString(){
		return "Alimento [nombre = " + nombre + ", calorias = " + calorias +"]";
	}
	
	@Override
	public int compareTo(Object o){
		Alimento a = (Alimento) o;
		if(this.calorias < a.calorias) return -1;
		else if(this.calorias > a.calorias)return 1;
		else return 0;
	}

	
	
}
