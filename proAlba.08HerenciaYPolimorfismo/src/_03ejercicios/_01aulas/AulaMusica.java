package _03ejercicios._01aulas;

public class AulaMusica extends Aula {
	private boolean piano;
	
	public AulaMusica(int cod, double l, double a, boolean piano){
		super(cod,l,a);
		this.piano = piano;
	}
	
	
	public boolean isPiano() {
		return piano;
	}


	public void setPiano(boolean piano) {
		this.piano = piano;
	}


	@Override
	public String toString(){
		String res  = "Aula de musica\n ";
		res += super.toString();
		return res;
	}
}
