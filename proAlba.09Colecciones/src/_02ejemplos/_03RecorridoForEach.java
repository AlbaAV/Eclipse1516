package _02ejemplos;

import java.util.Set;
import java.util.TreeSet;

public class _03RecorridoForEach {
	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<>();
		for(int i =10; i > 0; i--){
			ts.add(new Integer(i));
		}
		
		for(Integer x:ts){
			System.out.println(x);
		}
	}
}
