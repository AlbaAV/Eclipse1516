package distancia;

import java.util.Scanner;
import java.util.Locale;

import coordenadas.Coordenadas;

public class Distancia {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		
		String lat1;
		String lon1;
		String lat2;
		String lon2;
		String h1Str;
		String h2Str;
		
		if(args.length == 0 || args.length == 6){
			if(args.length == 0){
				System.out.println("Latitud 1: ");
				lat1 = tec.next();
				System.out.println("Longitud 1: ");
				lon1 = tec.next();
				System.out.println("Altura 1: ");
				h1Str = tec.next();
				System.out.println("Latitud 2: ");
				lat2 = tec.next();
				System.out.println("Longitud 2: ");
				lon2 = tec.next();
				System.out.println("Altura 2: ");
				h2Str = tec.next();
			}else{
				
				lat1 = args[0];
				lon1 = args[1];
				h1Str = args[2];
				lat2 = args[3];
				lon2 = args[4];
				h2Str = args[5];
			}
			//de sexagesimal a decimal
			float latP1 = Coordenadas.sexagesimalToDecimal(lat1);
			float lonP1 = Coordenadas.sexagesimalToDecimal(lon1);
			double h1 = Double.valueOf(h1Str);
			
			float latP2 = Coordenadas.sexagesimalToDecimal(lat2);
			float lonP2 = Coordenadas.sexagesimalToDecimal(lon2);
			double h2 = Double.valueOf(h2Str);
		
			//Calculos
			double dist = Coordenadas.formulaHaversine(latP1, lonP1, latP2, lonP2);
			dist = dist * 1000;// en metros
			System.out.println("Latitud 1: " +lat1);
			System.out.println("Longitud 1: " +lon1);
			System.out.println("Altura 1: " + h1Str);
			System.out.println();
			System.out.println("Latitud 2: " +lat2);
			System.out.println("Longitud 2: " +lon2);
			System.out.println("Altura 2: " + h2Str);
			System.out.println("Distancia entre dos puntos sin tener en cuenta la altitud: " + dist + " metros.");
			dist = Coordenadas.hipoAlt(latP1, lonP1, latP2, lonP2, h1, h2);
			dist = dist * 1000;// en metros
			System.out.println("Distancia entre dos puntos teniendo en cuenta la altitud: " + dist + " metros.");
			dist = Math.abs(h2 - h1) * 1000;
			System.out.println("Diferencia de altura entre los puntos: " + dist + " metros.");
			
		}else{
			System.out.println("El número de datos introducidos no es correcto. ");
		}
	}
}