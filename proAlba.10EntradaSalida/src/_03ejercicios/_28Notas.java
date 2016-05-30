package _03ejercicios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _28Notas {
	final static int MAXNOTAS = 20;
	
	public static void main(String[] args) {
		
		//Averiguan cuantas notas tiene ya el fichero
		
		int contNotas = 0;
		try(DataInputStream f = new DataInputStream(new FileInputStream("notas.dat"))){
			while(true){
				f.readDouble();
				contNotas++;
			}
		}catch(EOFException e){
			
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			System.out.println("Problema al leer o cerrar el fichero");
		}
		
		//Otra forma de averiguar numero de notas
		File f = new File("notas.dat");
		if(f.exists() && f.isFile()){
			contNotas = (int) (f.length() / Double.BYTES);
		}
		
		Scanner tec = new Scanner(System.in);
		if(contNotas == MAXNOTAS){
			
		}
	}
}
