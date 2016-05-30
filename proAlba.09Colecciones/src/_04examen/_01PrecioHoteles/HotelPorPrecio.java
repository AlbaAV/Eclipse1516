package _04examen._01PrecioHoteles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HotelPorPrecio {
	public static void main(String[] args) {
		Collection<Hotel> c2 = new ArrayList<>();

		c2.add(new Hotel("A", 20));
		c2.add(new Hotel("B", 10));
		c2.add(new Hotel("C", 30));
		c2.add(new Hotel("A", 18));
		c2.add(new Hotel("B", 21));
		c2.add(new Hotel("B", 22));
		c2.add(new Hotel("A", 21));
		c2.add(new Hotel("C", 22));
		
		System.out.println("Por Precio: ");
		hotelesPorPrecio(c2);
	}
	
	public static void hotelesPorPrecio(Collection <Hotel> c){
		Map <Double,List<String>> m = new HashMap<>();
		//Recorremos la coleccion
		for(Hotel h : c){
			if (!m.containsKey(h.getPrecio())) {
				List<String> l = new LinkedList<>();
				l.add(h.getNombre());
				m.put(h.getPrecio(), l);
			} else {
				List<String> l = m.get(h.getPrecio());
				l.add(h.getNombre());
				m.replace(h.getPrecio(), l);
				}
			}
		//Mostrar los resultados
		Set<Double>numeros = m.keySet();
		TreeSet<Double> num = new TreeSet<>(numeros);
		for(Double n : num){
			System.out.println("Precio: " + n + " hoteles: " + m.get(n));
		}
	}
	
	//Correccion
	public static void hotelesPorPrecio2(Collection<Hotel> c){
		Map <Double,List<Hotel>> m = new HashMap<>();
		
		//Recorremos la coleccion
		for(Hotel h : c){
			if(!m.containsKey(h.getPrecio())){
				List<Hotel> l = new ArrayList<>();
				l.add(h);
				m.put(h.getPrecio(), l);
			} else {
				m.get(h.getPrecio()).add(h);
				// o bien
				//List<Hotel> l = m.get(h.getPrecio());
				//l.add(h);
			}
		}
		
		//Mostrar los resultados
		Set<Double> precios = m.keySet();
		
		//Para que ordene por precio
		TreeSet<Double> preciosOrdenados = new TreeSet<>(precios);
		
		for(Double p: preciosOrdenados){
			System.out.println("Precio: " + p + ":");
			List<Hotel> l = m.get(p);
			for(Hotel h : l){
				System.out.println(" - " + h.getNombre());
			}
		}
	}
}

