package _03ejercicios;

import java.util.*;
public class _08Medidas {
	public static void main(String[] args){
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce una medida(en pies): ");
		double pies =tec.nextDouble();
		double yardas,pulgadas,cm,m;
		yardas = pies/3;
		pulgadas = pies * 12;		
		cm = pulgadas * 2.54;
		m=cm/100;
		
		System.out.println(pies);
		System.out.println(yardas);
		System.out.println(pulgadas);
		System.out.println(cm);
		System.out.println(m);
	}

}
