package _03ejercicios.herencia._02videojuegos;

public abstract class JuegoAlquilerVenta extends Juego {
	protected double precio;
	protected int copias;
	
	public JuegoAlquilerVenta(String t, String f, int a, double p, int c){
		super(t,f,a);
		precio = p;
		copias = c;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public int getNumCopias(){
		return copias;
	}
	
	@Override
	public String toString(){
		String res = super.toString();
		res += "\nPrecio: " + precio
				+"\nNumero Copias: " + copias;		
		return res;
	}
}
