package _03ejercicios._02gestionhospital;

public class GestorHospital {
	public static void main(String[] args) {
		Hospital h = new Hospital();
		try {
			h.ingresarPaciente("Pepe", 30);
			h.ingresarPaciente("Ana", 31);
			h.ingresarPaciente("Miguel", 32);
			h.ingresarPaciente("Pepe", 33);
			h.ingresarPaciente("Rosa", 34);
			System.out.println(h.toString());
			System.out.println("=======================================");
			
			do {
				h.darAltas();
				System.out.println(h.toString());
				System.out.println("=======================================");
			} while(h.getNumLibres()<Hospital.MAXC);
			
			
			
		} catch (HospitalLlenoException e) {
			System.out.println(e.getMessage());
		}
		
	}
}