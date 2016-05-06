package _03ejercicios._05ListaEspera;

import _03ejercicios._05ListaEspera.ListaEsperaNormal;
import _03ejercicios._05ListaEspera.Paciente;

public class TestLista {
	public static void main(String[] args) {
		ListaEsperaNormal le = new ListaEsperaNormal();
		le.anyadir(new Paciente("111111A","Alba", 22));
		le.anyadir(new Paciente("222222B","David", 27));
		le.anyadir(new Paciente("333333C","Victor", 24));
		le.anyadir(new Paciente("444444D","Sheila", 21));
		le.anyadir(new Paciente("555555F","Juan", 26));
		le.anyadir(new Paciente("666666G","Juan", 26));
		
		System.out.println(le.toString());
	}
	
}
