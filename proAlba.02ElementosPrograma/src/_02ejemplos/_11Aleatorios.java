package _02ejemplos;

public class _11Aleatorios {

	public static void main(String[] args) {
		//Numero aleatorio real entre [0,100[
		System.out.println(Math.random()*100);
		
		//Real entre [100,200[
		System.out.println(Math.random()*100+100);
		
		//Real entre ]-100,0]
		System.out.println(Math.random()* -100);
		//Lanzamiento de un dado: entero[1,6]
		System.out.println((int)(Math.random()*6+1));
		//Edad de una persona: entero [0,100]
		System.out.println((int)(Math.random()*101));
		//Edad de un alumno de eso[12,16]
		System.out.println((int) (Math.random()*5+12));
	}
}
