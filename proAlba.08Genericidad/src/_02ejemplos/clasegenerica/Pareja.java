package _02ejemplos.clasegenerica;

public class Pareja <T> {
	private T miembro1;
	private T miembro2;
	
	public Pareja(T m1, T m2){
		this.miembro1 = m1;
		this.miembro2 = m2;
	}
	
	public T getMiembro1(){
		return miembro1;
	}
	
	public void setMiembro1(T miembro1){
		this.miembro1 = miembro1;
	}
	
	public T getMiembro2(){
		return miembro2;
	}
	
	public void setMiembro2(T miembro2){
		this.miembro2 = miembro2;
	}
	
	@Override
	public String toString(){
		return "1: " + miembro1 + "\n" +
				"2: " + miembro2;
	}
}
