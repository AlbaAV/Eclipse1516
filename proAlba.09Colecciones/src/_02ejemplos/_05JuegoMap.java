package _02ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class _05JuegoMap {
	public static void main(String[] args) {
		
		//Juego:El usuario tiene que introducir una frase sin repetir cualquier palabra más de dos veces
	
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un texto ");
		String texto = tec.nextLine();
		
		//Vamos a usar un Map para anotar las veces que aparece cada palabra
		Map<String,Integer> veces = new HashMap<>();
		
		// Descomponemos texto en palabras: con StringTokenizer
		StringTokenizer st = new StringTokenizer(texto);
		while(st.hasMoreTokens()){
			String palabra = st.nextToken();
			//Si la palabra nueva la añado con 1
			if(!veces.containsKey(palabra))
				veces.put(palabra, 1);
			else {
				//Añadimos uno al valor asociado a la palabra.
				int numero = veces.get(palabra);
				numero++;
				if(numero >= 3 ) System.out.println("FALLO con la palabra " + palabra);
				veces.put(palabra, numero);
			}
		}
		System.out.println(veces);
		System.out.println();
		
//		// Descomponemos texto en palabras: con StringTokenizer
//		String[] palabras = texto.split(" ");
//		System.out.println(Arrays.toString(palabras));
		
		//Recorremos el Map
		Set<String> palabras = veces.keySet();
		for(String p: palabras) { //Recorro el Set de claves
			int valor = veces.get(p); //Obtengo el valor asociado a la clave
			System.out.println("La palabra " + p + " ha aparecido " + valor + " veces."); //Muestro clave y valor
		}
	}
}
