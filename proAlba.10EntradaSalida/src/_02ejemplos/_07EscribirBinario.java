package _02ejemplos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07EscribirBinario {
	public static void main(String[] args) {
		try(FileOutputStream f = new FileOutputStream("numeros.bin")){
			for(int i =1; i<= 10; i++){
				f.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se puede abrir");
		} catch (IOException e) {
			System.out.println("No se puede escribir o cerrar");
		}
	}
}
