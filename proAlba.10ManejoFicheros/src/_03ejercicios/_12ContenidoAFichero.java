package _03ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class _12ContenidoAFichero {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		TreeSet<String> contenidoOrdenado = new TreeSet<>();
		
		System.out.println("Carpeta: ");
		String nomCarpeta = tec.nextLine();
		File c = new File(nomCarpeta);
		if(c.exists() && c.isDirectory()){
			
			File contenido[] = c.listFiles();
			for(int i = 0; i < contenido.length; i++){
				if(contenido[i].isFile()){
					System.out.println(contenido[i].getName().toLowerCase());
					contenidoOrdenado.add(contenido[i].getName().toLowerCase());
				}
			}
			
			try(BufferedWriter f = new BufferedWriter(new FileWriter(nomCarpeta + ".txt"))){
				for(String s: contenidoOrdenado){
					f.write(s);
					f.newLine();
				}
			}catch(IOException e){
				System.out.println("Error al escribir o cerrar");
			}
		} else System.out.println("No existe o no es una carpeta ");
	}
}
