package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _17Editorial2 {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
//		System.out.println("Introduce el tipo de publicacion (libro o revista): ");
//		String tipo = tec.nextLine();
		System.out.println("Introduce el precio: ");
		double precLibros = tec.nextDouble();
		System.out.println("Introduce la cantidad de ejemplares: ");
		int numLibros = tec.nextInt();
//		System.out.println("Introduce el tipo de publicacion revista: ");
//		tipo = tec.nextLine();
		System.out.println("Introduce el precio: ");
		double precRevistas = tec.nextDouble();
		System.out.println("Introduce la cantidad de ejemplares: ");
		int numRevistas = tec.nextInt();
		
		double importeAPagar = calcularCoste("LIBRO",numLibros,precLibros) + calcularCoste("REVISTA",numRevistas,precRevistas);
		System.out.println("Importe a pagar: " + importeAPagar);
	}
	
	public static double calcularCoste(String tipo, int cantidad, double precioUnitario){
		
		double importe = cantidad * precioUnitario;
		double porcentajeDto = 0;
		if(tipo.toUpperCase().equals("LIBRO")) {
			
			if(cantidad <= 5) porcentajeDto = 0;
			else if(cantidad <= 10) porcentajeDto = 10;
			else if(cantidad <= 15) porcentajeDto = 15;
			else porcentajeDto = 20;
			
		} else if(tipo.toUpperCase().equals("REVISTA")) {
			
			if(cantidad <= 5) porcentajeDto = 0;
			else if(cantidad <= 10) porcentajeDto = 15;
			else if(cantidad <= 15) porcentajeDto = 20;
			else porcentajeDto = 25;
			
		}
		return importe = importe*porcentajeDto/100;
	}
}
