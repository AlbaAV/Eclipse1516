package _03ejerciciosStrings;

import java.util.Scanner;

public class _03Email {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce tu dirección de correo electrónico: ");
		String email = tec.nextLine();
		
		int posA = email.indexOf('@');
		int posP = email.indexOf('.');
		
		System.out.println("Nombre de usuario: " + email.substring(0, posA));
		System.out.println("Subdominio: " + email.substring(posA+1, posP));
		System.out.println("Subdominio: " + email.substring(posP+1));
	}
}
