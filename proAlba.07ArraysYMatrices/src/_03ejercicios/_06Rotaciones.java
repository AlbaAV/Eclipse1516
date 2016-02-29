package _03ejercicios;

import java.util.Arrays;

public class _06Rotaciones {
	public static void main(String[] args) {
		int derecha[] = { 1,2,3,4};
		
		for(int i = 1; i<=derecha.length; i++){
			System.out.print("Rotacion " + i+": ");
			rotarDerecha(derecha);
			System.out.println();
		}
		System.out.println();

		int izquierda[] = { 10,11,12,13};
		
		System.out.println("Izquieda");
		for(int i = 1; i<=izquierda.length; i++){
			System.out.print("Rotacion " + i+": ");
			rotarIzquierda(izquierda);
			System.out.println();
		}
		
	}
	
	
	public static void rotarDerecha(int v[]){
		int aux =v[v.length-1];
		for(int i = v.length-1;i>0;i--){
			v[i] = v[i-1];		
		}
		v[0] = aux;
		System.out.print(" "+Arrays.toString(v));
		
	}
	
	public static void rotarIzquierda(int v[]){
		int aux =v[0];
		for(int i = 0;i<v.length-1;i++){
			v[i] = v[i+1];		
		}
		v[v.length-1] = aux;
		System.out.print(" "+Arrays.toString(v));
	}
	
}
