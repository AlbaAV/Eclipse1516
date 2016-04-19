package _03ejercicios.herencia._02videojuegos;

public class JuegoEnVenta extends JuegoAlquilerVenta{

	public JuegoEnVenta(String t, String f, int a, double p, int c){
		super(t,f,a,p,c);
	}
	
	public void venta() throws Exception{
		if(this.copias > 0) this.copias--;
		else throw new Exception("No quedan copias");
	}
	
	
}
