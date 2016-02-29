package _03ejercicios;

import java.util.Arrays;

public class _07DosArrays {
	public static void main(String[] args) {
		double a[] = { 1,2,3,4,5,6};
		double b[] ={ 7,8,9,10,11,12};
		double c[] = {1,2,3,4,5,6,7,8,9,10};
		
		double sum[] = sumaArraysIguales(a,b);
		double sum2[] = sumaArrays(a,c);
		System.out.println("Suma Arrays Iguales: " + Arrays.toString(sum));
		System.out.println("Suma Arrays Longitudes Distintas: " + Arrays.toString(sum2));
	}
	
	public static double[] sumaArraysIguales(double a[], double b[]){
		double[] suma = new double[a.length];
		for(int i = 0; i < a.length;i++){
			suma[i] = a[i] + b[i];
		}
		return suma;
	}
	
	public static double[] sumaArrays(double a[], double c[]){
		double mayor[] = a.length >= c.length? a : c;
		double menor[] = a.length < c.length? a : c;
		
		double[] suma = new double[mayor.length];
		
		for(int i = 0; i < mayor.length; i++){
			suma[i] = mayor[i];
		}
		
		for(int j = 0; j < menor.length; j++){
			suma[j] += menor[j];
		}
		
		return suma;
	}
	
	
	/*
	 * public static double[] sumaArrays1(double a[], double b[]){
	 * 		//double result[] = new double[Math.max(a.length,b.length)];
	 * 		double result[];
	 * 		if(a.length > b.length){
	 * 			result = new double[a.length];
	 * 
	 * 			for(int i = 0; i < b.length; i++){
	 * 				result[i] = a[i] + b[i];
	 * 			}
	 * 			for(int i = b.length; i < a.length; i++){
	 * 				result[i] = a[i];
	 * 			}
	 * 		} else {
	 * 			result = new double[b.length];
	 * 			for(int i = 0; i < a.length; i++){
	 * 				result[i] = a[i] + b[i];
	 * 			}
	 * 			for(int i = a.length; i < b.length; i++){
	 * 				result[i] = b[i];
 	 * 			}
 	 * 		}
 	 * 		return result;
 	 * }
 	 */
	
	
	
	
	/*
	 * public static double[] sumaArrays2(double a[], double b[]){
	 * 		double result[] = new double[Math.max(a.length,b.length)];
	 * 		for(int i = 0; i < a.length; i++) {
	 * 			result[i] += a[i];
	 * 		}
	 * 		for(int i = 0; i < b.length; i++) {
	 * 			result[i] += b[i];
	 * 		}
	 * 		return result;
	 * }
	 */
	
}
