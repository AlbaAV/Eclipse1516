package _03ejercicios._04gestionlibreria;

import java.util.Scanner;

public class TestReservas {
	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {

		Reserva r1, r2;
		System.out.println("Introduce reserva 1 : ");

		r1 = leerReserva();
		do {
			r2 = leerReserva();
		} while (r1.equals(r2));

		// Incrementar ejemplar a cada reserva

		r1.setEjemplares(r1.getEjemplares() + 1);
		r2.setEjemplares(r2.getEjemplares() + 1);
		
		// Mostrar las reservas en orden, de menor a mayor
		
		if(r1.compareTo(r2)<0){
			System.out.println(r1);
			System.out.println(r2);
		} else {
			System.out.println(r2);
			System.out.println(r1);
		}
	}

	public static Reserva leerReserva() {
		System.out.println("Nif: ");
		String nif = tec.next();
		System.out.println("Nombre: ");
		String nombre = tec.next();
		System.out.println("Tel: ");
		String tel = tec.next();
		System.out.println("Codigo: ");
		int cod = tec.nextInt();
		System.out.println("Ejemplares: ");
		int ejemp = tec.nextInt();

		Reserva r = new Reserva(nif, nombre, tel, cod, ejemp);

		return r;
	}
}
