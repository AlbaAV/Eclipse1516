package _03ejercicios;

import java.io.File;
import java.util.Scanner;

public class _10CarpetasYSubcarpetas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");

		String carpeta = tec.nextLine();

		File c = new File(carpeta);

		if (/** c.exists() && */
		c.isDirectory()) {
			long tam = calcularTamanyo(c);
			System.out.println(tam);
		} else {
			System.out.println(carpeta + " no es una carpeta o no existe");
		}
	}

	public static long calcularTamanyo(File carpeta) {
		File[] contenido = carpeta.listFiles();
		long tam = 0;
		if (contenido != null) {
			for (int i = 0; i < contenido.length; i++) {
				if (contenido[i].isFile())
					tam  += contenido[i].length();
				else if (contenido[i].isDirectory()) {
					tam += calcularTamanyo(contenido[i]);
				}
			}
		}
		return tam;
	}
}
