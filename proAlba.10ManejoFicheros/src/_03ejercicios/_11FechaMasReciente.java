package _03ejercicios;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _11FechaMasReciente {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");

		String carpeta = tec.nextLine();

		File c = new File(carpeta);

		if (/** c.exists() && */
		c.isDirectory()) {
			long fec = fechaReciente(c);
			System.out.println(fec);
			System.out.println(new Date(fec));
			System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(new Date(fec)));
		} else {
			System.out.println(carpeta + " no es una carpeta o no existe");
		}
	}

	public static long fechaReciente(File carpeta) {
		File[] contenido = carpeta.listFiles();
		long fecMax = 0;
		if (contenido != null) {
			for (int i = 0; i < contenido.length; i++) {
				long fec = 0; 
				if (contenido[i].isFile())
					fec = contenido[i].lastModified();
				else if (contenido[i].isDirectory()) {
					fec = fechaReciente(contenido[i]);
				}
				
				if(fec > fecMax)
					fecMax = fec;
			}
		}
		return fecMax;
	}
}
