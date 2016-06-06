package _03FiltroConClasesAnonimas;

import java.util.ArrayList;
import java.util.List;

import personas.ListaPersonas;
import personas.Persona;

public class MostrarPersonas {
	public static void main(String[] args) {
		List<Persona> l = ListaPersonas.generarListaPersonas();
		
		System.out.println(filtrar(l,new Filtro(){
				public boolean filtrar(Persona p){
					if(p.getEdad()> 30) return true;
					else return false;
				}
		}));
		System.out.println(filtrar(l,new Filtro(){
			public boolean filtrar(Persona p){
				if(p.getPeso()> 60) return true;
				else return false;
			}
		}));
	}
	
	public static List<Persona> filtrar(List<Persona> l, Filtro f){
		List<Persona> resultado = new ArrayList<>();
		for(Persona p: l){
			if(f.filtrar(p)) resultado.add(p);
		}
		return resultado;
	}
	
}
