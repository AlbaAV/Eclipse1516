package ejercio4;

public class Modelo {
	private String nombre;
	private int anyo;
	private int emisiones;
	
	public Modelo(String nombre,int anyo, int emisiones){
		this.nombre = nombre;
		this.anyo = anyo;
		this.emisiones = emisiones;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getAnyo(){
		return anyo;
	}
	
	public int getEmisiones(){
		return emisiones;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Modelo)) return false;
		Modelo m = (Modelo) o;
		if(this.nombre.equals(m.nombre) && this.anyo == m.anyo) return true;
		else return false;		
	}
	
	@Override
	public String toString(){
		return "Nombre: " + nombre + " Anyo: " + anyo + " Emisiones: " + emisiones;
	}
	
	public boolean aptoPlanPIVE(){
		if(anyo >= 2012 && emisiones <= 160) return true;
		else return false;
	}
	
	public static double tasaPorEmisiones(int emisiones){
		double tasas = 0;
		if(emisiones <= 100) tasas = 10;
		else if(emisiones <= 200) tasas = 15;
		else tasas = 20;
		
		return tasas;
	}
	
	public int compareTo(Object o){
		Modelo m = (Modelo) o;
		if(this.nombre.compareTo(m.nombre) < 0) return -1;
		else if(this.nombre.compareTo(m.nombre) > 0) return 1;
		else if(this.anyo < m.anyo) return -1;
		else if(this.anyo > m.anyo) return 1;
		else return 0;
	}
}
