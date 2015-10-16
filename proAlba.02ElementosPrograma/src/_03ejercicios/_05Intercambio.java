package _03ejercicios;

import java.util.*;
public class _05Intercambio {
	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce un valor: ");
		int v1 = tec.nextInt();
		System.out.println("Introduce otro valor: ");
		int v2 = tec.nextInt();
		System.out.println("Antes de intercambiar v1:" + v1 
				+ " y " + " v2:" + v2);
		
		//System.out.format("v1:%d v2:%d%n",v1,v2);
		int inter = v1;
		v1 = v2;
		v2 = inter;
		System.out.println("Antes de intercambiar v1:" + v1 
				+ " y " + " v2:" + v2);
		//System.out.format("v1:%d v2:%d%n",v1,v2);
	}
}
