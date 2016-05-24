package _03ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _23Concatenar1 {
	public static void main(String[] args) {
		String nombre1 = "fichero1";
		String nombre2 = "fichero2";
		String nombre3 = "fichero3";
		
		/**
		 * try(FileReader f1 = new FileReader(nombre1);
			  FileReader f2 = new FileReader(nombre2);
			  FileWiter f3 = new FileWriter(nombre3);)
		    {
		    
		    }
		*/
		
		try(BufferedReader f1 = new BufferedReader(new FileReader(nombre1));
			BufferedReader f2 = new BufferedReader(new FileReader(nombre2));
			BufferedWriter f3 = new BufferedWriter(new FileWriter(nombre3));)
		{
			int caracter;
			while((caracter = f1.read())!=-1){
				f3.write(caracter);
			}
			f3.write("\n");
			while((caracter = f2.read())!=-1){
				f3.write(caracter);
			}
			
		}catch(FileNotFoundException e){
			System.out.println("error al abrir");
		}catch(IOException e2){
			System.out.println("error al escribir o al cerrar");
		}
		
	}
}
