package _03ejercicios;

import java.util.Arrays;

public class _13SubSecuencia {
	public static void main(String[] args) {
		int secuencia[] = {23,8,12,6,7,2,10,11,2};
		
		System.out.println(Arrays.toString(secuencia));
		subSecuencia(secuencia);
		}
	
	public static int subSecuencia(int v[]){
		int i = 0;
		boolean enc = false;
		while( i < v.length-2 && !enc){
			if(v[i] == (v[i+1]-1) && v[i] == (v[i+2]-2)){
				enc = true;
			}else i++;
				
		}
		if(enc){
			System.out.println("Posicion " + i + " : { " + v[i] + " , " + v[i+1] + " , " + v[i+2] + " } ");
			return i;
		}else {
			i = -1;
			System.out.println("Posicion " + i);
			return i;
		}
	}
}
