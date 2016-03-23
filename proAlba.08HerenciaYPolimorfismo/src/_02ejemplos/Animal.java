package _02ejemplos;

public abstract class Animal {
	private String nombre;
	
	public Animal(String n){
		nombre = n;
	}
	
	public abstract String hacerRuido();
	
	public void saludar(){
		System.out.println("Hola me llamo " + nombre + " y hago " + hacerRuido());
	}
}
