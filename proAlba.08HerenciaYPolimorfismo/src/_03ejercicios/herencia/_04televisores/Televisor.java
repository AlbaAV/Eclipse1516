package _03ejercicios.herencia._04televisores;

public abstract class Televisor implements Comparable<Televisor>{
	private String marca;
	private String modelo;
	private double precio;
	private double pulgadas;
	
	public Televisor(String marca,String modelo,double precio,double pulgadas){
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.pulgadas = pulgadas;
	}

	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public double getPulgadas() {
		return pulgadas;
	}



	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public abstract String resolucion();
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Televisor))
			return false;

		Televisor t = (Televisor) o;
		if (this.marca.equals(t.marca) && this.modelo.equals(t.modelo))
			return true;
		else
			return false;
	}

	public int compareTo(Televisor t){
		int compMarca = this.marca.compareTo(t.marca);
		int compModel = this.modelo.compareTo(t.modelo);
			
		if (compMarca < 0) return -1;
		else if (compMarca > 0) return 1;
		else if (compModel < 0)return -1;
		else if (compModel > 0) return 1;
		else return 0;
	}
	@Override
	public String toString(){
		String res = "	Marca: " +marca 
				+ "\n	Modelo: " + modelo
				+"\n	Precio: " + precio + " €"
				+"\n	Pulgadas: " + pulgadas
				+"\n	Resolución :" + resolucion();
		
		return res;
	}
}
