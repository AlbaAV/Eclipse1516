package coordenadas;


public class Coordenadas {

	public static double pasarDecimal(int grados, int minutos, double segundos) {
		double total = grados + (minutos/60.0) + (segundos/3600.0);
		return total;
	}

	// M�todo 2: Distancia 2 puntos superf�cie terrestre (f�rmula de Haversine)

	public static double formulaHaversine(double lat1, double lon1, double lat2, double lon2) {
		final double R = 6371.0; // En km
		double distLat = Math.toRadians(lat2 - lat1);
		double distLon = Math.toRadians(lon2 - lon1);
		lat1 = Math.toRadians(lat1);
		lat2 = Math.toRadians(lat2);

		double a = Math.pow(Math.sin(distLat / 2), 2)
				+ Math.pow(Math.sin(distLon / 2), 2) * Math.cos(lat1) * Math.cos(lat2);
		double c = 2 * Math.asin(Math.sqrt(a));
		return R * c;
	}

	// M�todo 3 : Hipotenusa ( Teorema de pit�goras)

	public static double hipo(double dist, double h1, double h2) {
		double cateto1 = dist;
		double cateto2 = h2 - h1;
		double hipo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		// la hipotenusa tambi�n se puede calcular con el m�todo
		// Math.hypot(cateto1,cateto2)
		return hipo;
	}

	// M�todo 4 : hipotenusa teniendo en cuenta la altura llama al m�todo 2 y 3
	public static double hipoAlt(double lat1, double lon1, double lat2, double lon2, double h1, double h2) {
		double cateto1 = Coordenadas.formulaHaversine(lat1, lon1, lat2, lon2);
		double hipo = Coordenadas.hipo(cateto1, h1, h2);
		return hipo;
	}

	// Metodo Practica 2: sexagesimalToDecimal(String coordenada)

	public static float sexagesimalToDecimal(String coordenada) {
		String coord = coordenada.toUpperCase();
		int g = coord.indexOf('�');
		String grados = coord.substring(0, g);
		int gr = Integer.parseInt(grados);
		int m = coord.indexOf('\'');
		String minutos = coord.substring(g + 1, m);
		int min = Integer.parseInt(minutos);
		int s = coord.indexOf('"');
		String segundos = coord.substring(m + 1, s);
		float seg = Float.parseFloat(segundos);
		char d = coord.charAt(coord.length() - 1);
		float total = (float) pasarDecimal(gr, min, seg);
		if (d == 'N' || d == 'E')
			return total;
		else {
			total = (-1) * total;
			return total;
		}
	}
}