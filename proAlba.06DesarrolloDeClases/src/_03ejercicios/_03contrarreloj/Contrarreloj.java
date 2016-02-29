package _03ejercicios._03contrarreloj;

import _02ejemplos.Tiempo;

public class Contrarreloj {
	public static void main(String[] args) {
		
		//Dosa listas de corredores: Los que han salido de la linea y los quie han llegado a meta.
		ListaCorredores hanSalido = new ListaCorredores();
		ListaCorredores hanLlegado = new ListaCorredores();
		
		//Registramos la salida de varios corredores.
		try{
			hanSalido.anyadir(new Corredor(1,"Pepe",new Tiempo(10,0,0)));
			hanSalido.anyadir(new Corredor(2,"Juan",new Tiempo(10,1,0)));
			hanSalido.anyadir(new Corredor(3,"Miguel",new Tiempo(10,2,0)));
			hanSalido.anyadir(new Corredor(4,"Pablo",new Tiempo(10,3,0)));
			
		}catch (ElementoDuplicadoException e){
			System.out.println("Corredor duplicado");
		}
		//Probamos que detecta duplicados
		try{
			hanSalido.anyadir(new Corredor(1,"Pepe",new Tiempo(10,0,0)));
		}catch (ElementoDuplicadoException e){
			System.out.println("Corredor duplicado");
		}
		//Mostramos hanSalido
		System.out.println("----------- EN CARRERA --------------");
		System.out.println(hanSalido.toString());
		
		
		//Llega el corredor 2
		try{
			Corredor c = hanSalido.quitar(2);
			c.setLlegada(new Tiempo(10,15,20));
			hanLlegado.insertarOrdenado(c);
		}catch(ElementoNoEncontradoException e){
			System.out.println("Ese dorsal no está en la carrera");
		}
		
		//Llega el corredor 1
		try{
			Corredor c = hanSalido.quitar(1);
			c.setLlegada(new Tiempo(10,16,20));
			hanLlegado.insertarOrdenado(c);
		}catch(ElementoNoEncontradoException e){
			System.out.println("Ese dorsal no está en la carrera");
		}
		
		//Llega el corredor 4
		try{
			Corredor c = hanSalido.quitar(4);
			c.setLlegada(new Tiempo(10,16,25));
			hanLlegado.insertarOrdenado(c);
		}catch(ElementoNoEncontradoException e){
			System.out.println("Ese dorsal no está en la carrera");
		}
		//Llega el corredor 3
		try{
			Corredor c = hanSalido.quitar(3);
			c.setLlegada(new Tiempo(10,16,45));
			hanLlegado.insertarOrdenado(c);
		}catch(ElementoNoEncontradoException e){
			System.out.println("Ese dorsal no está en la carrera");
		}
		
		System.out.println("----------- EN CARRERA --------------");
		System.out.println(hanSalido.toString());
		System.out.println("----------- HAN LLEGADO --------------");
		System.out.println(hanLlegado.toString());
		
	}
}
