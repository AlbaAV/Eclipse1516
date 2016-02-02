package _02ejemplos;

import java.util.Scanner;

public class ControlTrayectos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		//Creamos dos objeto de la clase Tiempo
		
		Tiempo salida = new Tiempo();
		Tiempo llegada = new Tiempo();
		
		//Les damos valor
		
		System.out.println("Salida: ");
		System.out.println("Hora: ");
		salida.setHora (tec.nextInt());
		System.out.println("Minuto: ");
		salida.setMinuto(tec.nextInt());
		System.out.println("Segundos: ");
		salida.setSegundo(tec.nextInt());
		
		System.out.println("Llegada: ");
		System.out.println("Hora: ");
		llegada.setHora (tec.nextInt());
		System.out.println("Minuto: ");
		llegada.setMinuto(tec.nextInt());
		System.out.println("Segundos: ");
		llegada.setSegundo(tec.nextInt());
		
		System.out.println("Hora de salida: " + salida.toString());
		System.out.println("Hora de salida: " + llegada.toString());
		
		if(salida.equals(llegada)) {
			System.out.println("salida y llegada no pueden ser iguales");
		} else if (salida.compareTo(llegada) > 0){
			System.out.println("El instante de salida tiene que ser anterior al de llegada");
		}
		
		System.out.println("Hora Actual: ");
		Tiempo tActual = Tiempo.getHoraActual();
		System.out.println(tActual.toString());
	}
}
