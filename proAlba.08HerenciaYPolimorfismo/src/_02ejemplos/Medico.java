package _02ejemplos;

public class Medico {
	private boolean trabajaEnHospital;
	
	public Medico(boolean trabajaEnHospital){
		this.trabajaEnHospital = trabajaEnHospital;
	}
	public void tratarPaciente()
	{
		System.out.println("Medico trata paciente");
	}

	public boolean isTrabajaEnHospital() {
		return trabajaEnHospital;
	}

	public void setTrabajaEnHospital(boolean trabajaEnHospital) {
		this.trabajaEnHospital = trabajaEnHospital;
	}
	
	@Override
	public String toString(){
		String res = "Medico que ";
		if(trabajaEnHospital) res += "si ";
		else res += "no ";
		res += "trabaja en hospital";
		return res;
	}
}
