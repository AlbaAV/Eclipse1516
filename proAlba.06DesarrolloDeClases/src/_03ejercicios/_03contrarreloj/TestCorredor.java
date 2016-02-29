package _03ejercicios._03contrarreloj;

import _02ejemplos.Tiempo;

public class TestCorredor {
	public static void main(String[] args) {
		
		//Creamos dos corredores
		Corredor c1 = new Corredor("pepe", new Tiempo(10,20,30));
		
		Tiempo t = new Tiempo(10,20,31);
		Corredor c2 = new Corredor("juan",t);
		
		//Los mostramos por pantalla
		System.out.println(c1);
		System.out.println(c2);
		
		//Instante de llegada
		try{
			c1.setLlegada(new Tiempo(10,40,50));
		}catch(IllegalArgumentException ex){
			System.out.println(ex.getMessage());
		}
		
		try{
			c2.setLlegada(new Tiempo(0,0,0));
		}catch(IllegalArgumentException ex){
			System.out.println(ex.getMessage());
		}
		
		//Los mostramos por pantalla
		System.out.println(c1);
		System.out.println(c2);
	}
}
