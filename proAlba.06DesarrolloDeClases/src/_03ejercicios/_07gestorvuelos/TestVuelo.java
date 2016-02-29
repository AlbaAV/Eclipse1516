package _03ejercicios._07gestorvuelos;

import _02ejemplos.Tiempo;
import java.util.Scanner;

public class TestVuelo {
	public static void main(String[] args) {
		Vuelo v = new Vuelo("IB101","Valencia","Paris",new Tiempo(19,5,0), new Tiempo(21,0,0));
	
		try{
			int asiento = v.reservarAsiento("Miguel Fernandez",'V');
			System.out.println("Miguel Fernandez, asiento " + asiento);
			asiento = v.reservarAsiento("Ana Folgado",'V');
			System.out.println("Ana Folgado, asiento " + asiento);
			asiento = v.reservarAsiento("David Mas",'P');
			System.out.println("David Mas, asiento " + asiento);
		}catch(VueloCompletoException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println(v.toString());
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Cancelar reserva. Indica asiento a cancelar: ");
		int asiento = tec.nextInt();
		v.cancelarReserva(asiento);
		System.out.println(v.toString());
	}
}
