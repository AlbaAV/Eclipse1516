package _03ejercicios._01gestionempleados;

import java.util.Scanner;

public class TestEmpleado {
	public static void main(String[] args) {
		//Pedimos datos al usuario
		Scanner tec = new Scanner(System.in);
		System.out.println("Primer empleado: ");
		System.out.println("Nombre: ");
		String nombre1 = tec.nextLine();
		System.out.println("Dni: ");
		String dni1 = tec.nextLine();
		System.out.println("Año ingreso: ");
		int anyo1 = tec.nextInt();
		System.out.println("Sueldo: ");
		double sueldo1 = tec.nextDouble();tec.nextLine();
		
		
		System.out.println("Segundo empleado: ");
		System.out.println("Nombre: ");
		String nombre2 = tec.nextLine();
		System.out.println("Dni: ");
		String dni2 = tec.nextLine();
		System.out.println("Año ingreso: ");
		int anyo2 = tec.nextInt();
		System.out.println("Sueldo: ");
		double sueldo2 = tec.nextDouble();
		
		//Creamos dos empleados
		Empleado e1 = new Empleado(nombre1,dni1,anyo1,sueldo1);
		Empleado e2 = new Empleado(nombre2,dni2,anyo2,sueldo2);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		//Incrementar 20 al que menos cobra
		if(e1.getSueldoBruto() < e2.getSueldoBruto()) {
			e1.incrementarSueldo(20);
		} else  if(e1.getSueldoBruto() > e2.getSueldoBruto()) {
			e2.incrementarSueldo(20);
		}
		
		//Incremenar 10 al mas antiguo
		if(e1.antiguedad()>e2.antiguedad()){
			e1.incrementarSueldo(10);
		} else if(e1.antiguedad()<e2.antiguedad()){
			e2.incrementarSueldo(10);
		}
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		System.out.println(Empleado.calcularIRPF((e1.getSueldoBruto())));
		System.out.println(Empleado.calcularIRPF((e2.getSueldoBruto())));
	}

}
