package _03ejercicios;

import java.util.Arrays;

public class _18MatrizSimetrica {
	public static void main(String[] args) {
		int m[][] = { {1,5,3},
					  {5,4,7},
					  {3,7,5}};
		
		System.out.println("¿Es simetrica m?: " + esSimetrica(m));
		System.out.println();
	}
	
	public static boolean esSimetrica(int m[][]){
		boolean simetrica = true;
			for (int i = 0; i < m.length && simetrica; i++){
				if(m[i].length != m.length) simetrica = false;
				for(int j = 0; j < m[i].length && simetrica; j++){						
					System.out.print((m[i][j]) + " ");
					if(m[i][j] != m[j][i]) simetrica = false;
				}
				System.out.println();
			}
		return simetrica;
	}
	
}
