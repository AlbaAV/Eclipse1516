package _03ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _25Iguales {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Fichero 1: ");
		String nomF1 = tec.nextLine();
		System.out.println("Fichero 2: ");
		String nomF2 = tec.nextLine();
		
		File f1 = new File(nomF1);
		File f2 = new File(nomF2);
		if(f1.length() != f2.length()) System.out.println("DISTINTOS");
		else {
			try(FileReader fr1 = new FileReader(f1);
				FileReader fr2 = new FileReader(f2);){
				
				int dato1,dato2;
				boolean iguales = true;
				while((dato1= fr1.read()) != -1 && iguales){
					dato2 = fr2.read();
					if(dato1 != dato2) iguales = false;
				}
				
				if(iguales) System.out.println("IGUALES");
				else System.out.println("DISTINTOS");
				
			}catch(IOException e){
				//TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
	}
}
