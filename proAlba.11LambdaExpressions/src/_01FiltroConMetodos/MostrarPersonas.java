package _01FiltroConMetodos;

import java.util.ArrayList;
import java.util.List;

import personas.ListaPersonas;
import personas.Persona;

public class MostrarPersonas {
	public static void main(String[] args) {
		List<Persona> l = ListaPersonas.generarListaPersonas();
		
		System.out.println(filtrarEdad(l));
		System.out.println(filtrarPeso(l));
	}
	
	public static List<Persona> filtrarEdad(List<Persona> l){
		List<Persona> resultado = new ArrayList<>();
		for(Persona p: l){
			if(p.getEdad() < 31) resultado.add(p);
		}
		return resultado;
	}
	
	public static List<Persona> filtrarPeso(List<Persona> l){
		List<Persona> resultado = new ArrayList<>();
		for(Persona p: l){
			if(p.getPeso() > 60) resultado.add(p);
		}
		return resultado;
	}
}
