package _03ejercicios._07DiccionarioIngEsp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DiccionarioBilingue2 {
	private Map<String, Set<String>> d;

	public DiccionarioBilingue2() {
		d = new HashMap<>();
	}

	public boolean anyadirTraduccion(String cast, String ingl) {
		boolean cambio = false;
		if(!d.containsKey(cast)){
			Set<String> traducciones = new TreeSet<>();
			traducciones.add(ingl);
			d.put(cast,traducciones);
			cambio = true;
		}else {
			Set<String> traducciones = d.get(cast);
		}
		return cambio;
	}

	
	public boolean anyadirTraduccion2(String cast, String ingl,String...otras) {
		boolean cambio = false;
		if(!d.containsKey(cast)){
			Set<String> traducciones = new TreeSet<>();
			traducciones.add(ingl);
			d.put(cast,traducciones);
			for(int i = 0; i<otras.length;i++){
				traducciones.add(otras[i]);
			}
			cambio = true;
		}else{
			Set<String> traducciones = d.get(cast);
			cambio = traducciones.add(ingl);
			for(int i = 0; i<otras.length;i++){
				cambio = cambio | traducciones.add(otras[i]);
			}
		}
		return cambio;
	}
	
	public boolean quitarTraduccion(String cast,String ingl){
		boolean cambio = false;
		if(d.containsKey(cast)){
			Set<String> traducciones  = d.get(cast);
			cambio = traducciones.remove(ingl);
			
			if(traducciones.isEmpty()){
				d.remove(cast);
			}
		}
		return cambio;
	}
	
	public Collection<String> traduccionesDe(String cast){
		return d.get(cast);
	}
	
	@Override
	public String toString() {
		String result = "";
		for(String cast : d.keySet()){
			result += cast + " : ";
			Set<String> traducciones = d.get(cast);
			for(String ingl: traducciones){
				result += ingl + ", ";
			}
			result += "\n";
		}
		return result;
	}
}
