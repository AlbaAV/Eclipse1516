package _02FiltroConInterface;

import java.util.ArrayList;
import java.util.List;

import personas.ListaPersonas;
import personas.Persona;

public class MostrarPersonas {
	public static void main(String[] args) {
		List<Persona> l = ListaPersonas.generarListaPersonas();
		
		System.out.println(filtrar(l,new FiltroEdad()));
		System.out.println(filtrar(l,new FiltroPeso()));
		System.out.println(filtrar(l,new FiltroEstatura()));
	}
	
	public static List<Persona> filtrar(List<Persona> l, Filtro f){
		List<Persona> resultado = new ArrayList<>();
		for(Persona p: l){
			if(f.filtrar(p)) resultado.add(p);
		}
		return resultado;
	}
	
}
