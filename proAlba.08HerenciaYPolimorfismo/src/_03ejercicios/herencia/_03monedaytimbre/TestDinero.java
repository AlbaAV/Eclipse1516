package _03ejercicios.herencia._03monedaytimbre;

public class TestDinero {
	public static void main(String[] args) {
		Moneda m1 = new Moneda(1.0,2003,1.0,2);
		Billete b1 = new Billete(5.0,2015,2.5,4.5);
		Dinero d1 = new Moneda(0.05,2016,1.2,0.5);
		
		System.out.println(m1);
		System.out.println();
		System.out.println(b1);
		System.out.println();
		System.out.println(d1);
		System.out.println();
		d1 = new Billete(10.0,2015,2.5,4.5);
		System.out.println(d1);
	}
}
