package _03ejercicios.herencia._04televisores;

public class TVLCD extends Televisor{
	private int pixelsH;
	private int pixelsV;
	
	public TVLCD(String marca,String modelo,double precio,double pulgadas,int pH, int pV){
		super(marca,modelo,precio,pulgadas);
		pixelsH = pH;
		pixelsV = pV;
	}

	@Override
	public String resolucion() {
		return pixelsH +" x " + pixelsV + " pixels";
	}
	
	
}
