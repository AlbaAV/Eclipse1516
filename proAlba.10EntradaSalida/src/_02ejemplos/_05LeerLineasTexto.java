package _02ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _05LeerLineasTexto {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("minombre.txt"));
		
			while(br.ready()){
				String lineas = br.readLine();
				System.out.println(lineas);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir");
		} catch (IOException e) {
			System.out.println("Error al leer");
		} finally {
			if(br != null)
				br.close();
		}

	}
}
