package _03ejercicios._02videojuegos;

public class JuegoEnAlquiler extends JuegoAlquilerVenta{

	private int dias;
	
	public JuegoEnAlquiler(String t, String f, int a, double p, int c, int d){
		super(t,f,a,p,c);
		dias = d;
	}
	
	public int getDias(){
		return dias;
	}
	
	public void alquiler() throws Exception{
		if(this.copias > 0) this.copias--;
		else throw new Exception("No quedan copias");
	}
	
	public void devolver() {
		this.copias++;
	}
	
	public String toString(){
		String res = super.toString();
		res += "\nDias Alquiler: " + dias;
		
		return res;
	}
}
