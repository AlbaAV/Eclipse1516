package _02ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _06AutoClose {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("minombre.txt"))){
			while(br.ready()){
				String s = br.readLine();
				System.out.println(s);
			}
		}catch(FileNotFoundException e){
			System.out.println("error al abrir");
		}catch(IOException e2){
			System.out.println("error al escribir o al cerrar");
		}
	}
}
