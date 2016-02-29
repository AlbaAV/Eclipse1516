package _02ejemplos.excepcionDeUsuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nota {
	static Scanner tec = new Scanner(System.in);
	
	public static double leerNota() throws NotaIncorrectaException{
		
		System.out.println("Introduce nota: ");
		try {
			double nota = tec.nextDouble();
			if(nota<0) throw new NotaIncorrectaException("Nota demasiado baja");
			else if (nota > 10) throw new NotaIncorrectaException("Nota demasiado alta");
			return nota;
		} catch (InputMismatchException e) {
			throw new NotaIncorrectaException("No es una numero");
		}
		
	}
}