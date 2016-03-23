package _02ejemplos;

public class Cirujano extends Medico {
	
	public Cirujano(boolean th){
		super(th);
	}
	@Override
	public void tratarPaciente(){
		System.out.println("Cirujano trata a un paciente");
	}
	
	public void hacerIncision(){
		System.out.println("El cirujano realiza una incisión");
	}
	
	public String toString(){
		String res = super.toString();
		res += "\nCirujano";
		
		return res;
	}
}
