package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _08RepeticionDePalabras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre Fichero: ");
		String nombreFichero = tec.nextLine();
		
		//Abrimos fichero
		Scanner f = null;
		try{
			f = new Scanner(new File(nombreFichero));
			System.out.println("Fichero abierto");
			Map<String, Integer> veces = new HashMap<>();
			while(f.hasNext())
			{
				String palabra = f.next();
				if(!veces.containsKey(palabra))
					veces.put(palabra, 1);
				else {
					//Añadimos uno al valor asociado a la palabra.
					int numero = veces.get(palabra);
					numero++;
					veces.put(palabra, numero);
					
					//ó veces.put(palabra,m.get(palabra) +1);
				}
				
			}
			
			System.out.println(veces +"\n");
			
			//Mostramos resultados
			for(String p: veces.keySet()){
				System.out.println("La palabra " + p + " ha aparecido " + veces.get(p) + " veces.");
			}
		}catch(FileNotFoundException e){
			System.out.println("No se pudo abrir el fichero");
		}finally{
			if(f != null)
				f.close();
		}
	}
}
