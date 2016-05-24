package _03ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _24Concatenar {
	public static void main(String[] args) {

		String nombre1 = "fichero1";
		String nombre2 = "fichero2";

		/**
		 * try(FileReader f2 = new FileReader(nombre2);
		  		FileWriter f1 = new FileWriter(nombre1,true);)
	    	{
	    
	    	}
		*/
		
		try (BufferedReader f2 = new BufferedReader(new FileReader(nombre2));
			BufferedWriter bw = new BufferedWriter(new FileWriter(nombre1,true));) {
			int caracter;
			bw.write("\n");
			while ((caracter = f2.read()) != -1) {
				bw.write(caracter);
			}

		} catch (FileNotFoundException e) {
			System.out.println("error al abrir");
		} catch (IOException e2) {
			System.out.println("error al escribir o al cerrar");
		}

	}
}
