package _04examen._02GranTeatre;

public class ProduccionLocal extends Evento{
	private String organizador;
	
	public ProduccionLocal(String t,String f,String h,String o){
		super(t,f,h,0);

		organizador = o;
	}
	
	@Override
	public String toString(){
		return "PRODUCCIÓN LOCAL\n" + super.toString()
				+"\nOrganiza: " +organizador;
	}
}
