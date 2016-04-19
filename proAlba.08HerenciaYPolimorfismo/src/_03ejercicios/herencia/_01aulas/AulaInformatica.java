package _03ejercicios.herencia._01aulas;

public class AulaInformatica extends Aula{
	private int numPCs;
	public AulaInformatica(int cod, double l, double a, int numPCs){
		super(cod,l,a);
		this.numPCs = numPCs;
	}
	public int getNumPCs() {
		return numPCs;
	}
	public void setNumPCs(int numPCs) {
		this.numPCs = numPCs;
	}
	
	@Override
	public int getCapacidad(){
		int capa = numPCs * 2;
		return capa;
	}
	
	@Override //Sobreescritura parcial
	public String toString(){
		String res = "Aula de Informatica\n ";
		res += super.toString();
		return res;
	}
}
