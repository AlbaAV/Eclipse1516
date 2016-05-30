package _02ejemplos._06alumnos;

public class Alumno implements Comparable<Alumno>{
	private int expediente;
	private String nombre;
	
	public Alumno(int e,String n){
		expediente = e;
		nombre = n;
	}
	
	public String toString(){
		return expediente + " - " + nombre;
	}
	
	public int compareTo(Alumno a){
		if(this.expediente < a.expediente) return -1;
		else if(this.expediente > a.expediente) return 1;
		else return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + expediente;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (expediente != other.expediente)
			return false;
		return true;
	}
	
	
}
