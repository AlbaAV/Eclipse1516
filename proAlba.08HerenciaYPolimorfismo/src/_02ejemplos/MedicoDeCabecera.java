package _02ejemplos;

/**
 * @author ALBA
 *
 */
public class MedicoDeCabecera extends Medico{
	private boolean visitaLasCasas;
	
	public MedicoDeCabecera(boolean th, boolean vc){
		super(th);
		this.visitaLasCasas = vc;
	}
	public void aconsejarPaciente(){
		System.out.println("Medico de cabecera aconseja a paciente");
	}
	
	@Override
	public String toString(){
		String res = "Medico de cabecera que " + (visitaLasCasas?"si":"no") + " visita las casas";
		return res;
	}
}
