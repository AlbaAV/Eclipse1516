package _03ejercicios.herencia._03monedaytimbre;


public class Dinero implements Comparable<Dinero> {
	private double valor;
	private int anyo;
	
	public Dinero(double v,int a){
		valor = v;
		anyo = a;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Dinero))
			return false;

		Dinero d = (Dinero) o;
		if (this.valor == d.valor && this.anyo == d.anyo)
			return true;
		else
			return false;
	}
	
	public int compareTo(Dinero d){
		if (this.anyo < d.anyo) return -1;
		else if (this.anyo > d.anyo) return 1;
		else if (this.valor < d.valor)return -1;
		else if (this.valor > d.valor) return 1;
		else return 0;
	}
	
	@Override
	public String toString(){
		String res = "	Valor: " +valor 
				+ "\n	Anyo: " + anyo;
		
		return res;
	}
}
