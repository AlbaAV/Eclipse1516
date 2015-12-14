package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _17Editorial {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce el tipo de publicacion (libro o revista): ");
		String tipo = tec.nextLine();
		System.out.println("Introduce el precio: ");
		double precio = tec.nextDouble();
		System.out.println("Introduce la cantidad de ejemplares: ");
		int ejemplares = tec.nextInt();

		double total = calcularCoste(tipo, precio, ejemplares);
		System.out.println("Total : " +total);
	}

	public static double calcularCoste(String t, double valor, int ejem) {
		String publi = t;
		int cant = ejem;
		double val = valor;
		double coste = val * cant;
		double desL;
		double desR;
		if (cant <= 5) {
			desL = 0;
			desR = 0;
			return coste;
		} else if (cant <= 10) {
			if (publi.equals("libro")) {
				desL = 0.1;
				coste = coste - (coste * desL);
				return coste;
			} else if (publi.equals("revista")) {
				desR = 0.15;
				coste = coste - (coste * desR);
				return coste;
			}
		} else if (cant <= 20) {
			if (publi.equals("libro")) {
				desL = 0.15;
				coste = coste - (coste * desL);
				return coste;
			} else if (publi.equals("revista")) {
				desR = 0.2;
				coste = coste - (coste * desR);
				return coste;
			} else {
				if (publi.equals("libro")) {
					desL = 0.20;
					coste = coste - (coste * desL);
					return coste;
				} else if (publi.equals("revista")) {
					desR = 0.25;
					coste = coste - (coste * desR);
					return coste;
				}
				
			}
			return coste;
		}
		return coste;

	}
}