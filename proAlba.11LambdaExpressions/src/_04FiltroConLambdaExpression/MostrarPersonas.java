package _04FiltroConLambdaExpression;

import java.util.ArrayList;
import java.util.List;

import personas.ListaPersonas;
import personas.Persona;

public class MostrarPersonas {
	public static void main(String[] args) {
		List<Persona> l = ListaPersonas.generarListaPersonas();
		
		System.out.println(filtrar(l,(Persona p) -> p.getEdad() > 30));
		
		//System.out.println(filtrar(l,p -> p.getEdad() > 30));
		
		System.out.println(filtrar(l,(Persona p) -> p.getPeso() > 60));
		
		
	}
	
	public static List<Persona> filtrar(List<Persona> l, Filtro f){
		List<Persona> resultado = new ArrayList<>();
		for(Persona p: l){
			if(f.filtrar(p)) resultado.add(p);
		}
		return resultado;
	}
	
}
