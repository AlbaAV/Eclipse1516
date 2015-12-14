package _03ejercicios.BuclesAnidados;

import java.util.Scanner;

public class _05TablMult {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int numTabla = tec.nextInt();
		for(int i = 1; i<=numTabla; i++){
			System.out.println("Tabla " + (i));
			for(int numMul=0; numMul <= 10; numMul++){
				System.out.println(i + " * " + numMul+ " = " + (i * numMul));
			}
		}
	}
}
