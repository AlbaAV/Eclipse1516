package _02ejemplos;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class _02RecorrerSetConIterator {
	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<>();
		
		for(int i = 10; i > 0; i--){
			ts.add(new Integer(i));
		}
		
		//Recorrer con iterator
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//Recorrer con forEach
		for(Integer x: ts){
			System.out.println(x);
		}
		
		//Tambien se pueden recorrer arrays con forEach
		int v[] = {1,22,34,6};
		for(int x: v){
			System.out.println(x);
		}
	}
}
