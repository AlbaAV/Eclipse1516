package _02ejemplos;

public class _03TestToString {
	public static void main(String[] args) {
		
		Medico m = new Medico(true);
		System.out.println(m);
		
		System.out.println(" -------------------- ");
		
		MedicoDeCabecera mc = new MedicoDeCabecera(true,false);
		System.out.println(mc);
		
		System.out.println(" -------------------- ");
		
		Cirujano c = new Cirujano(true);
		System.out.println(c);
	}
}
