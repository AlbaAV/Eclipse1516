package _03ejercicios;

public class _12Dados {
	public static void main(String[] args) {
		int d1 = lanzarDado();
		int d2 = lanzarDado();
		System.out.println("Dado 1: "+d1+" Dado 2: " + d2);
		System.out.println("Suma de los dados: " + (d1+d2));
	}
	
	public static int lanzarDado(){
		int n1 = (int) (Math.random()*6+1);
		return n1;
	}
}
