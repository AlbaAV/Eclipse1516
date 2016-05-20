package _03ejercicios;

import java.io.File;
import java.util.Scanner;

public class _03NumeroFicherosYCarpetas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Carpeta: ");
		
		String carpeta = tec.nextLine();
		File c = new File(carpeta);
		
		if(/** c.exists() &&*/ c.isDirectory()){
			File contenido[] = c.listFiles();
			int contFicheros = 0;
			int contCarpetas = 0;
			for(int i = 0; i < contenido.length; i++){
				if(contenido[i].isFile()) contFicheros++;
				else if(contenido[i].isDirectory()) contCarpetas++;
			}
			System.out.println("Numero de elementos: " + contenido.length);
			System.out.println("numero de ficheros " + contFicheros);
			System.out.println("numero de ficheros " + contCarpetas);
		}else {
			System.out.println(carpeta + " no es una carpeta o no existe");
		}
	}
}
