package _02ejemplos;

import java.io.File;
import java.util.Scanner;

public class _02MostrarContenido {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: " );
		
		String carpeta = tec.nextLine();
		
		File c = new File(carpeta);
		
		if(/** c.exists() &&*/ c.isDirectory()){
			mostrarContenido(c,0);
		} else {
			System.out.println(carpeta + " no es una carpeta o no existe");
		}
	}
	
	public static void mostrarContenido(File carpeta,int nivel){
		String espacio = "";
		for(int i = 1; i <= nivel; i++){
			espacio = espacio + "   ";
		}
		File[] contenido = carpeta.listFiles();
		if(contenido != null){
			for(int i = 0; i < contenido.length; i++){
				if(contenido[i].isFile())System.out.println(espacio + 
						contenido[i].getName());
				else if(contenido[i].isDirectory()){
					System.out.println(espacio + contenido[i].getName());
					mostrarContenido(contenido[i],nivel+1);
				}
			}
		}
	}
}
