package _03ejercicios._04gestionlibreria;

public class Reserva {

	private String nif;
	private String nombre;
	private String tel;
	private int codigo;
	private int ejemplares;
	
	public Reserva(String nif, String nombre, String tel, int codigo, int ejemplares){
		this.nif = nif;
		this.nombre = nombre;
		this.tel = tel;
		this.codigo = codigo;
		this.ejemplares = ejemplares;
	}
	
	public Reserva(String nif, String nombre, String tel, int codigo){
		this.nif = nif;
		this.nombre = nombre;
		this.tel = tel;
		this.codigo = codigo;
		ejemplares = 1;
		
		//this(nif, nombre, tel, codigo, 1);
	}

	//GETTERS
	
	public String getNif() {
		return nif;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTel() {
		return tel;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getEjemplares() {
		return ejemplares;
	}
	
	public void setEjemplares(int num){
		this.ejemplares = num;
	}
	
	@Override
	public String toString(){
		return "NIF: " + nif +
				"\nNombre: " + nombre +
				"\nTel: " + tel + 
				"\nCodigo Libro: " + codigo +
				"\nNumero de Ejemplares: " + ejemplares;
	}
	
	@Override
	public boolean equals(Object o){
		if(this==o) return true;
		if(!(o instanceof Reserva)) return false;
		
		Reserva r = (Reserva) o;
		return this.nif.equals(r.nif) && this.codigo == r.codigo;
	}
	
	public int compareTo(Object o){
		Reserva r = (Reserva) o;
		if(this.codigo < r.codigo) return -1;
		else if(this.codigo > r.codigo) return 1;
		else if(nif.compareTo(r.nif)>0) return 1;
		else if(nif.compareTo(r.nif)<0) return -1;	
		else return 0;
		
		// else return this.nif.compareTo(r.nif);
		
	}
}
