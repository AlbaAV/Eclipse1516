package _02ejemplos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _04InsertarEnList {
	public static void main(String[] args) {
		final int TAM = 1000000;
		long t;
		List<Integer> l;
		
		l = new ArrayList<>();
		t = System.currentTimeMillis();
		for(int i = 1; i <= TAM; i++){
			l.add(i);
		}
		System.out.println("Al final de ArrayList: " + (System.currentTimeMillis()-t));
		//------------------
		
		l = new ArrayList<>();
		t = System.currentTimeMillis();
		for(int i = 1; i <= TAM; i++){
			l.add(0,i);
		}
		System.out.println("Al principio de ArrayList: " + (System.currentTimeMillis()-t));
		//------------------------------------
		
		l = new LinkedList<>();
		t = System.currentTimeMillis();
		for(int i = 1; i <= TAM; i++){
			l.add(i);
		}
		System.out.println("Al final de LinkedList: " + (System.currentTimeMillis()-t));
		//-------------------------------------
		
		l = new LinkedList<>();
		t = System.currentTimeMillis();
		for(int i = 1; i <= TAM; i++){
			l.add(0,i);
		}
		System.out.println("Al principio de LinkedList: " + (System.currentTimeMillis()-t));
	}
	
	
}
