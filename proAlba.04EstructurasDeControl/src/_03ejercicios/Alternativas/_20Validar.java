package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _20Validar {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		String x = tec.nextLine();
		char X  = x.charAt(0);
		int y = tec.nextInt();
		
		boolean correcto;
		if(y > 0 && y < 11){
			if((X =='a' && y%2 !=0) || (X =='b' && y%2 ==0)){
				correcto = true;
				System.out.println("VALIDOS");
			}
		}else{
			correcto = false;
			System.out.println("NO VALIDOS");
		}
	}
}
