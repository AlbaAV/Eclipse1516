package _03ejercicios.herencia._01aulas;

public class Aula {
	private int codigo;
	private double longitud,anchura;
	
	public Aula(int cod,double l,double a){
		this.codigo = cod;
		this.longitud = l;
		this.anchura = a;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}
	
	private double superficie(){
		double sup = longitud * anchura;
		return sup;
	}
	public int getCapacidad(){		
		double capa =superficie()/1.4;
		return (int)capa;
	}
	@Override
	public String toString(){
		String res = "	Codigo: " +codigo 
				+ "\n	Superficie: " + superficie() + " m2 " 
				+ "\n	Capacidad: " + getCapacidad() + " alumnos";
		return res;
	}
}
