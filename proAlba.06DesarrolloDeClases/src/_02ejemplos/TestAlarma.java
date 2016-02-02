package _02ejemplos;

public class TestAlarma {
	public static void main(String[] args) {
		Alarma a = new Alarma();
		System.out.println(a);
		System.out.println();
		
		//Desactivar y mostrar
		a.getTiempo();
		a.setActivada(false);
		System.out.println(a);
	}
}
