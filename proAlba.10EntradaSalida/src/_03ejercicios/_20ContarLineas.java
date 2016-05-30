package _03ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _20ContarLineas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero");
		String nomF = tec.nextLine();
		
		int cont = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(nomF))){
			
			while(br.readLine() != null) cont++;
			System.out.println(cont);
		}catch(FileNotFoundException e){ 
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
