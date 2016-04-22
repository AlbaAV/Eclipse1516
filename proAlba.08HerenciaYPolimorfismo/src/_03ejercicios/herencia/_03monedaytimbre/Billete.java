package _03ejercicios.herencia._03monedaytimbre;

public class Billete extends Dinero {
	private double altura;
	private double anchura;
	public Billete(double v,int a,double alto,double ancho){
		super(v,a);
		altura = alto;
		anchura = ancho;
	}
	
	@Override
	public String toString(){
		String res = "BILLETE: \n";
		res += super.toString();
		res += "\n	Altura: " + altura
				+ "\n	Anchura" + anchura;
		return res;
	}
}
