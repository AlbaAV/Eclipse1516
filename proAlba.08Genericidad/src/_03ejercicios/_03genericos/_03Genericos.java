package _03ejercicios._03genericos;

import java.util.Arrays;

import _03ejercicios._01gestionempleados.Empleado;

public class _03Genericos {
	public static void main(String[] args) {
		System.out.println("Minimo: " + minimo("pepe","pepa"));
		System.out.println("Maximo: " + maximo("pepe","pepa"));
		
		System.out.println("------------------");
		
		String v1[] = {"ana","pedro","miguel","antonio"};
		System.out.println(minimoA(v1));
		
		Object v2[] = {"ana",new Integer(30)};
		//Error Ejecucion --> --> System.out.println(minimoA(v2));
		
		System.out.println("\n----------------------------");
		Empleado e1 = new Empleado("pepe","111111",2000,1000);
		Empleado e2 = new Empleado("pepe","111111",2000,1000);
		
		//No da error; comparable clase String
		if("hola".compareTo("casa")==0){
			
		}
		
		//Error de compilación utilicia comparable de la clase String
		//if("hola".compareTo(new Integer(2))==0){
		//			
		//}
	}
	
	
	
	// a)
	public static Object minimo (Object o1,Object o2){
		if(((Comparable)o1).compareTo(o2) < 0) return o1;
		else return o2;
	}
	
	// b)
	public static Object maximo (Object o1,Object o2){
		if(((Comparable)o1).compareTo(o2) > 0) return o1;
		else return o2;
	}
	
	// c)
	public static Object minimoA (Object v[]){
		Object minimo = v[0];
		for(int i = 1; i < v.length; i++){
			if(((Comparable)v[i]).compareTo(minimo)< 0) minimo = v[i];
		}
		return minimo;
	}
		
	// d)
	public static Object maximoA (Object v[]){
		Object maximo = v[0];
		for(int i = 1; i < v.length; i++){
			if(((Comparable)v[i]).compareTo(maximo) > 0) maximo = v[i];
		}
		return maximo;
	}
			
	// e)
	public static int numVeces(Object v[],Object x){
		int cont = 0;
		for(int i = 0; i < v.length; i++){
			if(v[i].equals(x)) cont ++;
		}
		return cont;
	}
	
	// f)
	public static int numVecesOrdenado(Object v[],Object x){
		int cont = 0;
		Arrays.sort(v);
		boolean enc = false;
		for(int i = 0;i < v.length && !enc; i++){
			if(((Comparable)v[i]).compareTo(x) == 0) {
				cont ++;
			}else if(((Comparable)v[i]).compareTo(x) > 0){
				enc = true;
			}
		}
		return cont;
	}
	
	// g)
		public static int mayores(Object v[], Object x){
			int cont = 0;
			for(int i = 0; i < v.length; i++){
				if(((Comparable)v[i]).compareTo(x) > 0) cont++;
			}
			return cont;
		}
		
		// h)
		public static <T extends Comparable> int mayoresOrdenado(T v[], T x){
			int cont = 0;
			Arrays.sort(v);
			boolean enc = false;
			for(int i = v.length; i > 0 && !enc; i--){
				if(v[i].compareTo(x) > 0) cont++;
				else if(v[i].compareTo(x) == 0) enc = true;
			}
			return cont;
		}
		
		// i)
		public static <T extends Comparable> int menores(T v[], T x){
			int cont = 0;
			for(int i = 0; i < v.length; i++){
				if(v[i].compareTo(x) < 0) cont++;
			}
			return cont;
		}
		
		// j)
		public static <T extends Comparable> int menoresOrdenado(T v[], T x){
			int cont = 0;
			Arrays.sort(v);
			boolean enc = false;
			for(int i = 0; i < v.length && !enc; i++){
				if(v[i].compareTo(x) < 0) cont++;
				else if(v[i].compareTo(x) == 0) enc = true;
			}
			return cont;
		}
		
		// k)
		public static <T> boolean estaEn(T v[], T x){
			boolean enc = false;
			for(int i = 0; i < v.length && !enc; i++){
				if(v[i].equals(x)) enc = true;
			}
			return enc;		
		}
		
		// l)
		public static boolean estaEnOrdenado(Object v[], Object x){
			boolean mayor = false;
			boolean enc = false;
			Arrays.sort(v);
			for(int i = 0; i < v.length && !enc && !mayor; i++){	
				if(((Comparable)v[i]).compareTo(x) == 0) enc = true;
				else if(((Comparable)v[i]).compareTo(x) > 0) mayor = true;
			}
			return enc;		
		}
		
		// m)
			public static int posicionDe(Object v[], Object x){
				boolean enc = false;
				int pos = -1;
				for(int i = 0; i < v.length && !enc; i++){
					if(((Comparable)v[i]).compareTo(x) == 0)
					{
						pos = i;
						enc = true;
					}
				}
				return pos;		
			}
		// n)
		public static int posicionDeOrdenado(Object v[], Object x){
			boolean mayor = false;
			boolean enc = false;
			int pos = -1;
			for(int i = 0; i < v.length && !enc && !mayor; i++){
				if(((Comparable)v[i]).compareTo(x) == 0)
				{
					pos = i;
					enc = true;
				}
				else if(((Comparable)v[i]).compareTo(x) > 0) mayor = true;
			}
			return pos;		
		}
		
		// o)
		public static  boolean estaOrdenado(Object v[]){
			boolean enc = true;
			for(int i = 0; i < v.length-1 && enc; i++){	
				if(((Comparable)v[i]).compareTo(v[i+1]) > 0) enc = false;
			}
			return enc;		
		}
}
