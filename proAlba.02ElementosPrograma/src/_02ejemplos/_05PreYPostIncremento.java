package _02ejemplos;

public class _05PreYPostIncremento {
	public static void main(String[] args) {
		
		int a = 5, b;
		b = a++;
	
		System.out.format("a: %d, b %d%n %n", a,b);
	
		int c = 5, d;
		d = ++c;
		
		System.out.format("c: %d, b %d%n",c,d);
	}
}
