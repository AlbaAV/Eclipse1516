package _03ejercicios._02Biblioteca;

public class TestBiblioteca {
	public static void main(String[] args) {
		Libro[] v = {new Libro("La vida es suenyo", "Calderon", "Literatura"),
				new Libro("Don quijote", "Cervantes", "Literatura"), 
				new Libro("El arte de la guerra", "Sun tsu", "Bélico")};
		
		CatalagoLibros c = new CatalagoLibros(v);
		
		System.out.println(c.toString());
		System.out.println(c.buscar(new Libro("La vida es suenyo", "Calderon", "Literatura")));
	}
}
