package _03ejercicios._02gestionhospital;


public class TestPaciente {

	public static void main(String[] args) {	
		Paciente p1 = new Paciente("Juan",20);
		Paciente p2 = new Paciente("Miguel",30);
		
		System.out.println("Paciente 1: " + p1.toString());
		System.out.println("Paciente 2: " + p2.toString());
	
		if(p1.compareTo(p2)<0) System.out.println("Paciente mas leve " +p1);
		else if(p1.compareTo(p2)>0)
			System.out.println("Paciente mas leve " +p2);
		else
			System.out.println("Los dos pacientes son iguales" );
		
		
		//De otra forma
		int resComp = p1.compareTo(p2);
		Paciente menor;
		if(resComp <0) menor = p1;
		else menor = p2;
		System.out.println("El menor es " + menor);
		
			while(p1.getEstado() != p2.getEstado()){
				if(p1.getEstado()<p2.getEstado())
					p1.mejorar();
				else p2.mejorar();
			}
		}
}
