package _03ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class _02Temporal {
	public static void main(String[] args) throws IOException{
		File f = File.createTempFile("TEMPORAL", ".txt");
		f.deleteOnExit();
		new Scanner(System.in).nextLine();
		System.out.println(f.getParent());
		System.out.println(f.getName());
	}
}
