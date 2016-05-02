package _03ejercicios._02Biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private String estanteria;
	
	public Libro(String t, String a,String e){
		titulo = t;
		autor = a;
		estanteria = e;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEstanteria() {
		return estanteria;
	}

	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if (!(o instanceof Libro))
			return false;

		Libro l = (Libro) o;
		if (this.titulo.equals(l.titulo))
			return true;
		else
			return false;
	}
	
}
