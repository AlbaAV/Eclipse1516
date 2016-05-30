package _03ejercicios._01Varios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Varios {
	public static void main(String[] args) {
		int a[] = {1, 3, 5, 2, 4, 6, 1, 2, 3, 4};
		long t = System.currentTimeMillis();
		for(int i = 1; i < 100000; i++){
			Arrays.toString(quitarDuplicados(a));
		}
		System.out.println(Arrays.toString(quitarDuplicados(a)));
		System.out.println(System.currentTimeMillis() - t);
		//-------------------------------------------
		t = System.currentTimeMillis();
		for(int i = 1; i < 100000; i++){
			Arrays.toString(quitarDuplicados2(a));
		}
		System.out.println(Arrays.toString(quitarDuplicados2(a)));
		System.out.println(System.currentTimeMillis() - t);
		
		//-----------------------------------
		int b[] = {10,11,2,6,8,9,21};
		System.out.println(Arrays.toString(union1(a,b)));
		System.out.println(Arrays.toString(union2(a,b)));
	}
	
	public static int[] quitarDuplicados(int v[]){
		//Anyadimos los elemntos del array a un Set para quitarle los duplicados
		TreeSet<Integer> ts= new TreeSet<>();
		for(int i = 0; i < v.length; i++){
			ts.add(v[i]);
		}
		
		//Creamos el array a devolver y le anyadimos los elementos del Set
		int result[] = new int[ts.size()];
		int i = 0;
		for(Integer x: ts){
			result[i] = x.intValue();
			i++;
		}
		return result;
	}
	
	public static Integer[] quitarDuplicados2(int v[]){
		//Anyadimos los elemntos del array a un Set para quitarle los duplicados
		LinkedHashSet<Integer> ts= new LinkedHashSet<>();
		for(int i = 0; i < v.length; i++){
			ts.add(v[i]);
		}
		
		//Creamos el array a devolver y le anyadimos los elementos del Set
		Integer result[] = new Integer[0];
		result = ts.toArray(result);
		
		return result;
	}
	
	public static int[] union1(int v1[],int v2[]){
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i = 0; i < v1.length; i++){
			ts.add(v1[i]);
		}
		
		for(int i = 0; i < v2.length;i++){
			ts.add(v2[i]);
		}
		//Creamos el array a devolver y le anyadimos los elementos del Set
		int result[] = new int[ts.size()];
		int i = 0;
		for(Integer x: ts){
			result[i] = x.intValue();
			i++;
		}
		return result;
	}
	
	public static int[] union2(int v1[],int v2[]){
		List<Integer> l = new ArrayList<>();
		for(int i = 0; i < v1.length; i++){
			l.add(v1[i]);
		}
		
		for(int i = 0; i < v2.length;i++){
			l.add(v2[i]);
		}
		//Creamos el array a devolver y le anyadimos los elementos del Set
		int result[] = new int[l.size()];
		int i = 0;
		for(Integer x: l){
			result[i] = x.intValue();
			i++;
		}
		return result;
	}
	
	public static int[] interseccion(int v1[],int v2[]){
		Set<Integer>  hs1= new HashSet<>();
		Set<Integer>  hsResult= new HashSet<>();
		for(int i = 0; i < v1.length; i++){
			hs1.add(v1[i]);
		}
		
		for(int i = 0; i < v2.length;i++){
			if(hs1.contains(v2[i]))hsResult.add(v2[i]);
		}
		
		//Creamos el array a devolver y le anyadimos los elementos del Set
		int result[] = new int[0];
		int i = 0;
		for(Integer x: hsResult){
			result[i] = x.intValue();
			i++;
		}
		return result;
	}
}

