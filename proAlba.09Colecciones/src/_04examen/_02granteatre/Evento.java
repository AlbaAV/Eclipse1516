package _04examen._02granteatre;

public abstract class Evento {
	private String nombre;
	private String fecha;
	private String hora;
	private double precio;
	
	public Evento(String n,String f,String h,double p){
		nombre = n;
		fecha = f;
		hora = h;
		precio = p;
	}
	
	@Override
	public boolean equals(Object o){
		if(this== o)return true;
		if(!(o instanceof Evento)) return false;
		Evento e = (Evento) o;
		return this.nombre.equals(e.nombre) && this.fecha.equals(e.fecha);
	}
	
	@Override
	public String toString(){
		String res = "titulo: " + nombre +
				"\nFecha: " + fecha +
				"\nHora: " + hora +
				"\nPrecio: ";
		if(precio == 0) res += "ENTRADA GRATUITA";
		else res += precio + "€";
		return res;
	}
}
