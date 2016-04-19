package _02ejemplos;

import java.util.Arrays;

import _03ejercicios._01gestionempleados.Empleado;

public class _01MetodosGenericos {
	public static void main(String[] args) {
		String nombres[] = {"ana","miguel","ana","isabel","gema"};
		Empleado empleados[] = {new Empleado("Rosa","1",2000,2000),
				new Empleado("Pedro","2",2000,2000)};
		
		System.out.println(_01MetodosGenericos.<String>contar(nombres,"ana"));
		System.out.println(_01MetodosGenericos.<Empleado>contar(empleados,new Empleado("Rosa","1",2000,2000)));
		
		//Las siguientes llamadas dan error de compilación porque no cumplen la sintaxis: mezclan distintos tipos
		//System.out.println(_01MetodosGenericos.<Empleado>contar(empleados,"ana"));
		//System.out.println(_01MetodosGenericos.<String>contar(nombres,new Empleado("Rosa","1",2000,2000)));
	
		//Llamadas al método generico maximo
		System.out.println(maximo("angel","aurora"));
		System.out.println(maximo(new Empleado("Rosa","1",2000,2000),new Empleado("Pedro","2",2000,2000)));
		
		//Llamamos al método genérico Arrays.sort
		Arrays.sort(nombres);
		Arrays.sort(empleados);
	}
	
	//Metodo generico que cuenta las veces que aparece un elemento en un array
	
//	public static int contar(Object v[],Object x){
//		int cont = 0;
//		for(int i = 0; i < v.length; i++){
//			if(v[i].equals(x)) cont ++;
//		}
//		return cont;
//	}
	
	//Metodo generico que cuenta las veces que aparece un array

	public static <T> int contar(T v[],T x){
		int cont = 0;
		for(int i = 0; i < v.length; i++){
			if(v[i].equals(x)) cont ++;
		}
		return cont;
	}
	
	//Método generico que nos devuelve el mas grande de dos objetos cuales quiera
	
//	public static Object maximo(Object o1, Object o2){
//		if(((Comparable)o1).compareTo(o2) > 0)return o1;
//		else return o2;
//	}
	
	public static <T extends Comparable> T maximo(T o1,T o2){
		if(o1.compareTo(o2) > 0)return o1;
		else return o2;
	}
}

