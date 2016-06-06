package personas;


import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
	public static List<Persona> generarListaPersonas(){
		List<Persona> l = new ArrayList<>();

		l.add(new Persona("Ana", 30, 60, 1.70));
		l.add(new Persona("David", 20, 60, 1.90));
		l.add(new Persona("Victor", 25, 60, 1.80));
		l.add(new Persona("Alba", 19, 60, 1.75));
		l.add(new Persona("Sheila", 27, 60, 1.60));
		l.add(new Persona("Juan", 33, 60, 1.70));
		
		return l;
	}
}
