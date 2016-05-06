package _03ejercicios._05ListaEspera;

public class TestPaciente {
	public static void main(String[] args) {
		Paciente juan = new Paciente("juan",20);
		Paciente miguel = new Paciente("miguel",30);
		System.out.println(juan);
		System.out.println(miguel);

		//Mostrar el menor
		if(juan.compareTo(miguel) < 0) System.out.println("El menor es " +juan);
		else  if(juan.compareTo(miguel) > 0) System.out.println("El menor es " + miguel);
		else System.out.println("Los dos pacientes son iguales");
		
		//De otra forma
		int resComp = juan.compareTo(miguel);
		Paciente menor;
		if(resComp < 0) menor = juan;
		else menor = miguel;
		System.out.println("El menor es " + menor );
		
		//Aplicar mejoras al mas grave hasta que tengan el mismo estado
		System.out.println("Mejorar al mas grave");
		while(juan.getEstado() != miguel.getEstado()) {
			if(juan.getEstado() < miguel.getEstado()){
				juan.mejorar();
			} else {
				miguel.mejorar();
			}
			System.out.println(juan);
			System.out.println(miguel);
		}
	}
}