package _04examen._02granteatre;

public class Exposicion extends Evento{
	private int sala;
	private String clausura;
	
	public Exposicion(String t,String f,String h,int s,String c){
		super(t,f,h,0);
		sala = s;
		clausura = c;
	}
	
	@Override
	public String toString(){
		return "EXPOSICION\n" + super.toString()
				+"\nSala: " +sala +
				"\nClausura: " +clausura;
	}
}
