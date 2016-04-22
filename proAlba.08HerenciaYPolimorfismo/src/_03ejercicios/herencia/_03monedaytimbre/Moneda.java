package _03ejercicios.herencia._03monedaytimbre;

public class Moneda extends Dinero{
	private double diametro;
	private double peso;
	public Moneda(double v,int a,double d,double p){
		super(v,a);
		diametro = d;
		peso = p;
	}
	
	@Override
	public String toString(){
		String res = "MONEDA: \n";
		res += super.toString();
		res += "\n	Diametro: " + diametro
				+ "\n	Peso: " + peso;
		return res;
	}
}
