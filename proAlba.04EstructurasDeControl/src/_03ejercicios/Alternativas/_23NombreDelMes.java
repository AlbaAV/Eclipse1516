package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _23NombreDelMes {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int nMes = tec.nextInt();
		System.out.println("Mes " + nMes + ": " + nombreMes(nMes));
	}

	public static String nombreMes(int mes) {
		String nombre = "";
		switch (mes) {
		case 1:
			nombre = "enero";
			break;
		case 2:
			nombre = "febrero";
			break;
		case 3:
			nombre = "marzo";
			break;
		case 4:
			nombre = "abril";
			break;
		case 5:
			nombre = "mayo";
			break;
		case 6:
			nombre = "junio";
			break;
		case 7:
			nombre = "julio";
			break;
		case 8:
			nombre = "agosto";
			break;
		case 9:
			nombre = "septiembre";
			break;
		case 10:
			nombre = "octubre";
			break;
		case 11:
			nombre = "noviembre";
			break;
		case 12:
			nombre = "diciembre";
			break;
		default:
			nombre="���ERROR!!!";
		}
		return nombre;

	}
}
