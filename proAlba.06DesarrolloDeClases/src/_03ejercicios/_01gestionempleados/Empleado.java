package _03ejercicios._01gestionempleados;

import java.util.Calendar;

public class Empleado {
	private String nombre;
	private String dni;
	private int anyoIngreso;
	private double sueldoBruto;
	
	public Empleado(String nombre, String dni, int anyoIngreso, double sueldoBruto){
		this.nombre = nombre;
		this.dni = dni;
		this.anyoIngreso = anyoIngreso;
		this.sueldoBruto = sueldoBruto;
	}
	
	
	//Métodos
	
	//GETTERS
	public String getNombre(){
		return nombre;
	}
	
	public String getDni(){
		return dni;
	}
	
	public int getAnyoIngreso(){
		return anyoIngreso;
	}
	
	public double getSueldoBruto(){
		return sueldoBruto;
	}
	
	public int antiguedad(){
		int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
		int ant = anyoActual - anyoIngreso;
		if(ant < 0) ant = 0;
		return ant;
	}
	
	public void incrementarSueldo(double porcentaje){
		sueldoBruto = sueldoBruto + (sueldoBruto * porcentaje / 100);
	}
	
	
	@Override
	public String toString(){
		return "Nombre: " + nombre +
				"\nDni: " + dni +
				"\nAño de Ingreso: " + anyoIngreso + 
				"\nSueldo Bruto: " + sueldoBruto;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o ) return true;
		if(!(o instanceof Empleado)) return false;
	
		//*******
		// estas lineas no harian falta *****
		
		Empleado e = (Empleado) o;
		if(this.dni.equals(e.dni))
			return true;
		else return false;
		
		//o return no haria falta las lineas anteriores
		
		/*
		 *puedo utilizar (((Empleado)o).dni !!!! 
		 *  .dni aunque dni sea privado porque estoy en la misma clas
		 *  return dni.equals (((Empleado)o).dni);
		 */
	}
	
	
	public int compareTo(Object o){
		Empleado e = (Empleado) o;
		if(dni.compareTo(e.dni)>0) return 1;
		else if(dni.compareTo(e.dni)<0) return -1;
		else return 0;
		
		// o return dni.compareTo(e.dni);
		//sin el if-else if -else
	}
	
	//En el enunciado el metodo es: public static double calcularIRPF(double salario){}
	
	public static double calcularIRPF(double sueldoBruto){
		double irpf;
		if(sueldoBruto < 800){
			irpf = 3;
		} else if(sueldoBruto < 1000){
			irpf = 10;
		}else if(sueldoBruto < 1500){
			irpf = 15;
		} else if(sueldoBruto < 2100) {
			irpf = 20;
		}else irpf = 30;
		return irpf;	
	}
}
