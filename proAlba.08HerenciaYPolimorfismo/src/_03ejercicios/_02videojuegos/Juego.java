package _03ejercicios._02videojuegos;

public class Juego {
	protected String titulo;
	protected String fabricante;
	protected int anyo;

	public Juego(String t, String f, int a) {
		titulo = t;
		fabricante = f;
		anyo = a;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public int getAnyo() {
		return anyo;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nFabricante: " + fabricante + "\nAnyo: " + anyo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Juego))
			return false;

		Juego j = (Juego) o;
		if (this.titulo.equals(j.titulo) && this.fabricante.equals(j.fabricante) && this.anyo == j.anyo)
			return true;
		else
			return false;
	}

	public int compareTo(Object o) {
		Juego j = (Juego) o;

		int compTitulo = titulo.compareTo(j.titulo);
		int compFabr = fabricante.compareTo(j.fabricante);
		
		if (compTitulo < 0)
			return -1;
		else if (compTitulo > 0)
			return 1;
		else if (compFabr < 0)
			return -1;
		else if (compFabr > 0)
			return 1;
		else if (anyo < j.anyo)
			return -1;
		else if (anyo > j.anyo)
			return 1;
		else
			return 0;
	}
	
}
