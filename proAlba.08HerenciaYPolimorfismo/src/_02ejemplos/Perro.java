package _02ejemplos;

public class Perro extends Animal {
	public Perro(String n){
		super(n);
	}
	
	@Override
	public String hacerRuido(){
		return "GUAUU GUAUU";
	}
}
