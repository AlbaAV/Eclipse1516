package _02ejemplos;

public class _01TestMedicos {
	public static void main(String[] args) {
		Cirujano c = new Cirujano(false);
		c.hacerIncision();
		c.tratarPaciente();
		c.setTrabajaEnHospital(true);
		System.out.println(" ---------- ");
		MedicoDeCabecera mc = new MedicoDeCabecera(false,false);
		mc.tratarPaciente();
		mc.aconsejarPaciente();
	}
}
