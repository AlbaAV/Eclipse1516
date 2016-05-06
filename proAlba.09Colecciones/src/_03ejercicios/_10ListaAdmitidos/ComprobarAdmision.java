package _03ejercicios._10ListaAdmitidos;

import java.util.HashSet;
import java.util.Scanner;

public class ComprobarAdmision {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Admitidos a1 = new Admitidos("1111111A","pepe","A1");
		Admitidos a2 = new Admitidos("2222222A","ana","A2");
		Admitidos a3 = new Admitidos("1111111B","alba","B1");
		Admitidos a4 = new Admitidos("2222222B","juan carlos","B2");
		Admitidos a5 = new Admitidos("1111111C","david","C1");
		Admitidos a6 = new Admitidos("2222222C","victor","C2");
		Admitidos a7 = new Admitidos("3333333C","charlie","C1");
		
		HashSet<Admitidos> admitidas = new HashSet<>();
		admitidas.add(a1);
		admitidas.add(a2);
		admitidas.add(a3);
		admitidas.add(a4);
		admitidas.add(a5);
		admitidas.add(a6);
		admitidas.add(a7);
		System.out.println(admitidas);
		System.out.println("\n\n");
		System.out.println("Dni: ");
		String dni = tec.nextLine();
		
		System.out.println("Admitido: " + (admitidas.contains(new Admitidos(dni, null, null))? "SI" : "NO"));
		
	}
}