package _03ejercicios.alternativas;

import java.util.Scanner;

public class _10Fechas2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Dia 1");
		int d1 = tec.nextInt();
		System.out.println("Mes 1");
		int m1 = tec.nextInt();
		System.out.println("Anyo 1");
		int a1 = tec.nextInt();
		
		System.out.println("Dia 2");
		int d2 = tec.nextInt();
		System.out.println("Mes 2");
		int m2 = tec.nextInt();
		System.out.println("Anyo 2");
		int a2 = tec.nextInt();
		
		if(a1<a2)mostrarFecha(d1,m1,a1);
		else if(a2 < a1)mostrarFecha(d2,m2,a2);
		else // mismo año
			
			if(m1<m2)mostrarFecha(d1,m1,a1);
			else if(m1>m2)mostrarFecha(d2,m2,a2);
			else //mismo mes
				if(d1<d2)mostrarFecha(d1,m1,a1);
				else mostrarFecha(d2,m2,a2);
	}
 		public static void mostrarFecha(int d,int m,int a){
			if(d<10) System.out.print("0");
			System.out.print(d + "/");
 			if(m<10) System.out.print("0");
			System.out.print(m + "/");
			
			System.out.println(a);
			
			//De otra forma
			System.out.format("%02d/%02d/%04d%n",d,m,a);
		}
}

