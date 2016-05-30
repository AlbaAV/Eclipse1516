package _04examen._01PrecioHoteles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrecioMinimo {
	public static void main(String[] args) {
		Collection<Hotel> c = new ArrayList<>();

		c.add(new Hotel("A", 20));
		c.add(new Hotel("B", 10));
		c.add(new Hotel("C", 30));
		c.add(new Hotel("A", 18));
		c.add(new Hotel("B", 21));
		c.add(new Hotel("B", 22));

		precioMinimoDeHoteles(c);

		System.out.println();

		precioMinimoDeHoteles2(c);

	}

	public static void precioMinimoDeHoteles(Collection<Hotel> c) {
		TreeMap<String, Double> h = new TreeMap<>();
		for (Hotel hotel : c) {
			if (!h.containsKey(hotel.getNombre())) {
				h.put(hotel.getNombre(), hotel.getPrecio());
			} else if (h.get(hotel.getNombre()) > hotel.getPrecio()) {
				h.replace(hotel.getNombre(), hotel.getPrecio());
			}
		}

		System.out.println(h.toString());
	}

	// Correccion Javi
	public static void precioMinimoDeHoteles2(Collection<Hotel> c) {
		Map<String, Double> m = new HashMap<>();
		// Recorremos la coleccion
		for (Hotel h : c) {
			if (!m.containsKey(h.getNombre())) {
				m.put(h.getNombre(), h.getPrecio());
			} else {
				double precioMinimo = m.get(h.getNombre());
				if (h.getPrecio() < precioMinimo) {
					m.put(h.getNombre(), h.getPrecio());
				}
			}
		}
		// Mostrar los resultados
		Set<String> nombres = m.keySet();
		TreeSet<String> nombresOrdenados = new TreeSet<>(nombres);
		for (String n : nombresOrdenados) {
			System.out.println("Hotel: " + n + " mejor precio: " + m.get(n));
		}
	}

}
