package _02ejemplos;

public class _08CompatibilidadTipos {
	public static void main(String[] args) {
		byte b =10;
		short s = 1000;
		int i = 90000;
		long l = 3000000000L;
		
		
		l = i;
		l = s;
		l = b;
		
		i = s;
		i = b;
		
		s = b;
		
		// b = s;
		// s = i;
		// i = l;

		//Conversion de tipo explicita
		short num = 2000;
		b = (byte) num;
		System.out.println(b);
		
		
	}

}
