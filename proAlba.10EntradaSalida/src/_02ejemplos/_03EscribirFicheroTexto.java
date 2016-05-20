package _02ejemplos;

import java.io.FileWriter;
import java.io.IOException;

public class _03EscribirFicheroTexto {
	public static void main(String[] args){
		FileWriter f = null;
	
		try{
			f = new FileWriter("minombre.txt",true);
			f.write("Hola que tal" + System.lineSeparator());
			f.write("Me llamo alba ");
		} catch(IOException e){
			System.out.println("Problema al abrir el fichero");
			
		}finally{
			if(f!= null){
				try{
					f.close();
				}catch(IOException e2){
					System.out.println();
				}
		}
	
	}
	}}
