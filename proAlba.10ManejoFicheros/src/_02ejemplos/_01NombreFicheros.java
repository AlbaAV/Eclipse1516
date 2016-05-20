package _02ejemplos;

import java.io.File;
import java.io.IOException;

public class _01NombreFicheros {
	public static void main(String[] args) throws IOException{
		File f = new File("carta.txt");
		System.out.println("getName: " + f.getName());
		System.out.println("getPath: " + f.getPath());
		System.out.println("getAbsolutePath: " + f.getAbsolutePath());
		System.out.println("getParent: " + f.getParent());
		System.out.println("getCanonicalPath: " + f.getCanonicalPath());
		System.out.println("-------------------------------------------");
		
		f = new File("documentos/nota.txt");
		System.out.println("getName: " + f.getName());
		System.out.println("getPath: " + f.getPath());
		System.out.println("getAbsolutePath: " + f.getAbsolutePath());
		System.out.println("getParent: " + f.getParent());
		System.out.println("getCanonicalPath: " + f.getCanonicalPath());
		System.out.println("-------------------------------------------");
	
		f = new File("documentos/../documentos/nota.txt");
		System.out.println("getName: " + f.getName());
		System.out.println("getPath: " + f.getPath());
		System.out.println("getAbsolutePath: " + f.getAbsolutePath());
		System.out.println("getParent: " + f.getParent());
		System.out.println("getCanonicalPath: " + f.getCanonicalPath());
		System.out.println("-------------------------------------------");
	
	}
}
