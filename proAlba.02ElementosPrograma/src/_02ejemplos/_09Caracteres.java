package _02ejemplos;

public class _09Caracteres {
	public static void main(String[] args) {
		char letra1 = 'a';
		int codigo1 = (int) letra1; //Codigo unicode de la letra
		
		System.out.println("el código de la letra " + letra1 + " es " +codigo1);
		
		letra1 = '€';
		codigo1 = (int) letra1; //Codigo unicode de la letra
		
		System.out.println("el código de la letra " + letra1 + " es " +codigo1);
		
		
		int codigo2 = 32450;
		char letra2 = (char) codigo2;
		
		System.out.println("La letra del codigo " + codigo2 + " es " + letra2);
		System.out.format("La letra del codigo %d es la %c",codigo2,letra2);
		
		char salto = '\n'; //salto de linea
		
		
		//secuencia de escape
		System.out.println();
		System.out.println("Hola\nque tal"); // Texto en dos lineas
		System.out.println("El me dijo \"hola\"");
	}
}
