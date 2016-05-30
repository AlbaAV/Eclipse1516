package _03ejercicios._07DiccionarioIngEsp;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DiccionarioBilingue {
	private Map<String, Set<String>> diccionario;

	public DiccionarioBilingue() {
		diccionario = new HashMap<>();
	}

	public boolean anyadirTraduccion(String cast, String ingl) {
		boolean cambio = true;
		if(!diccionario.containsKey(cast)){
			diccionario.put(cast, new HashSet<>());
			diccionario.get(cast).add(ingl);
		}else {
				if(!diccionario.get(cast).contains(ingl)){
					diccionario.get(cast).add(ingl);
				}else cambio = false;
		}
		return cambio;
	}
	public boolean quitarTraduccion(String cast,String ingl){
		boolean cambio = true;
		if(!diccionario.containsKey(cast) || !diccionario.get(cast).contains(ingl)){
			cambio = false;
		} else {
			diccionario.get(cast).remove(ingl);
			if(diccionario.get(cast).isEmpty()){
				diccionario.remove(cast);
			}
		}
		return cambio;
	}
	
	public Collection<String> traduccionesDe(String cast){
		return diccionario.get(cast);
	}
	@Override
	public String toString() {
		String result = "";
		for(String cast : diccionario.keySet()){
			result += cast + ": ";
			Set<String> traducciones = diccionario.get(cast);
			int i = 0;
			for(String ingl: traducciones){	
				result += ingl;		
				if(i<traducciones.size()-1) result += ", ";
				i++;
			}
			result += "\n";
		}
		return result;
	}
}
