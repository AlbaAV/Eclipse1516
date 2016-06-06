package _05FiltroConStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import personas.ListaPersonas;
import personas.Persona;

public class MostrarPersonas {
	public static void main(String[] args) {
		List<Persona> l = ListaPersonas.generarListaPersonas();
		
		
		System.out.println(l.stream()
		.filter((Persona p) -> p.getEdad() > 30)
		.collect(Collectors.toList()));
		
	}
	
	
}
