package _03ejercicios;

import java.io.File;

public class _01RutaActual {
	public static void main(String[] args) {
		File f = new File("");
		System.out.println("Ruta Actual " + f.getAbsolutePath());
		System.out.println();
	}
}
