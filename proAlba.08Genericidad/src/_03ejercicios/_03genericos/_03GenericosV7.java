package _03ejercicios._03genericos;

import java.util.Arrays;

public class _03GenericosV7 {
	public static void main(String[] args) {
		System.out.println("Minimo: " + minimo("pepe","pepa"));
		System.out.println("Minimo; " + minimo(new Integer(20),new Integer(30)));
		System.out.println("-----------------");
		System.out.println("Maximo: " + maximo("pepe","pepa"));
		System.out.println("Maximo: " + maximo(new Integer(20),new Integer(30)));
				
	}
	
	
	
	// a)
	public static <T extends Comparable> T minimo (T o1,T o2){
		if(o1.compareTo(o2) < 0) return o1;
		else return o2;
	}
	
	// b)
	public static <T extends Comparable> T maximo (T o1,T o2){
		if(o1.compareTo(o2) > 0) return o1;
		else return o2;
	}
	
	// c)
	public static <T extends Comparable> T minimoA (T v[]){
		T minimo = v[0];
		for(int i = 1; i < v.length; i++){
			if(v[i].compareTo(minimo)< 0) minimo = v[i];
		}
		return minimo;
	}
	
	// d)
		public static <T extends Comparable> T maximoA (T v[]){
			T maximo = v[0];
			for(int i = 1; i < v.length; i++){
				if(v[i].compareTo(maximo) > 0) maximo = v[i];
			}
			return maximo;
		}
		
	// e)
	public static <T> int numVeces(T v[],T x){
		int cont = 0;
		for(int i = 0; i < v.length; i++){
			if(v[i].equals(x)) cont ++;
		}
		return cont;
	}
	
	// f)
	public static <T extends Comparable> int numVecesOrdenado(T v[],T x){
		int cont = 0;
		Arrays.sort(v);
		boolean enc = false;
		for(int i = 0;i < v.length && !enc; i++){
			if(v[i].compareTo(x) == 0) {
				cont ++;
			}else if(v[i].compareTo(x) > 0){
				enc = true;
			}
		}
		return cont;
	}
	
	// g)
	public static <T extends Comparable> int mayores(T v[], T x){
		int cont = 0;
		for(int i = 0; i < v.length; i++){
			if(v[i].compareTo(x) > 0) cont++;
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
	public static <T extends Comparable> boolean estaEnOrdenado(T v[], T x){
		boolean mayor = false;
		boolean enc = false;
		Arrays.sort(v);
		for(int i = 0; i < v.length && !enc && !mayor; i++){	
			if(v[i].compareTo(x) == 0) enc = true;
			else if(v[i].compareTo(x) > 0) mayor = true;
		}
		return enc;		
	}
	
	// m)
		public static <T extends Comparable> int posicionDe(T v[], T x){
			boolean enc = false;
			int pos = -1;
			for(int i = 0; i < v.length && !enc; i++){
				if(v[i].compareTo(x) == 0)
				{
					pos = i;
					enc = true;
				}
			}
			return pos;		
		}
	// n)
	public static <T extends Comparable> int posicionDeOrdenado(T v[], T x){
		boolean mayor = false;
		boolean enc = false;
		int pos = -1;
		for(int i = 0; i < v.length && !enc && !mayor; i++){
			if(v[i].compareTo(x) == 0)
			{
				pos = i;
				enc = true;
			}
			else if(v[i].compareTo(x) > 0) mayor = true;
		}
		return pos;		
	}
	
	// o)
	public static <T extends Comparable> boolean estaOrdenado(T v[]){
		boolean enc = true;
		for(int i = 0; i < v.length-1 && enc; i++){	
			if(v[i].compareTo(v[i+1]) > 0) enc = false;
		}
		return enc;		
	}
}
