package _02ejemplos.clasegenerica;

import _03ejercicios._01gestionempleados.Empleado;

public class TestAsociacion {
	public static void main(String[] args) {
		Empleado e1 = new Empleado("juan","111111",1980,3000);
		Empleado e2 = new Empleado("miguel","222222",1983,2000);
		Empleado e3 = new Empleado("laura","333333",1985,1000);
		
		Asociacion<Empleado> a = new Asociacion<>(e1,e2,e3);
		a.anyadirMiembro(new Empleado("sofia","444444",2000,1500));
		System.out.println(a);
	}
}
