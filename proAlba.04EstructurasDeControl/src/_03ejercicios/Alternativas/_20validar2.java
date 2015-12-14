package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _20validar2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		char x = tec.next().charAt(0);
		int y = tec.nextInt();
		
		boolean esCorrecto = (y>=1 && y <= 10 && (x == 'a' && y%2 != 0) || (x =='b' && y%2 == 0));
		System.out.println((esCorrecto? "SI":"NO") + " es VÁLIDO");
	}
}
