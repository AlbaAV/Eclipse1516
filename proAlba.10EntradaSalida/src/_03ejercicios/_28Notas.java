package _03ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _28Notas {
	final static int MAXNOTAS = 20;

	public static void main(String[] args) {

		// Averiguan cuantas notas tiene ya el fichero

		int contNotas = 0;
		try (DataInputStream f = new DataInputStream(new FileInputStream("notas.dat"))) {
			while (true) {
				f.readDouble();
				contNotas++;
			}
		} catch (EOFException e) {

		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			System.out.println("Problema al leer o cerrar el fichero");
		}

		// Otra forma de averiguar numero de notas
		File f = new File("notas.dat");
		if (f.exists() && f.isFile()) {
			contNotas = (int) (f.length() / Double.BYTES);
		}

		// Pedir notas al usuario
		Scanner tec = new Scanner(System.in);
		boolean append = true;
		if (contNotas == MAXNOTAS) {
			System.out.println("El fichero de notas está completo. Sobreescribir (S/N) ? ");
			String respuesta = tec.next();
			if (respuesta.toUpperCase().equals("S")) {
				append = false;
				contNotas = 0;
			}
		}

		try (DataOutputStream fs = new DataOutputStream(new FileOutputStream("notas.dat", append))) {
			double nota;
			if (contNotas < MAXNOTAS) {
				do {
					System.out.println("Introduzca nota " + (contNotas + 1) + ": ");
					nota = tec.nextDouble();
					if (nota >= 0 && nota <= 10) {
						fs.writeDouble(nota);
						contNotas++;
					}
				} while (nota >= 0 && nota <= 10 && contNotas < MAXNOTAS);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
