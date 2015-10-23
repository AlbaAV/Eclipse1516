package _03ejerciciosPOO;

import figuras.Circulo;
import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

public class _05CentrarFiguras {
	public static void main(String[] args) {
		Pizarra p = new Pizarra();
		Rectangulo r = new Rectangulo(Figura.ROJO,(p.getAnchura()/2)-50,(p.getAltura()/2)-50,100,100);
		p.anyadir(r);
		
		Circulo c = new Circulo(Figura.VERDE,p.getAnchura()/2,p.getAltura()/2,25);
		p.anyadir(c);
	}
}
