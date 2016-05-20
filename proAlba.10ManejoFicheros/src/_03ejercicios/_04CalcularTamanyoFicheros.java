package _03ejercicios;

import java.io.File;
import java.util.Scanner;

public class _04CalcularTamanyoFicheros {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Carpeta: ");
		
		String carpeta = tec.nextLine();
		File c = new File(carpeta);
		
		if(c.isDirectory()){
			File contenido[] = c.listFiles();
			long tam = 0;
			
			for(int i = 0; i < contenido.length; i++){
				if(contenido[i].isFile()) 
					tam += contenido[i].length();
			}
			
			System.out.println("Tamanyo: " + tam + " bytes");
		}else {
			System.out.println(carpeta + " no es una carpeta o no existe");
		}
	}
}
