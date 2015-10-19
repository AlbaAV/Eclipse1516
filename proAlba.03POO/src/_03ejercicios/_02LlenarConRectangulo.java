package _03ejercicios;

import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

public class _02LlenarConRectangulo {
	public static void main(String[] args){
		Pizarra p = new Pizarra();
		Rectangulo r = new Rectangulo(Figura.AZUL,0,0,p.getAnchura(),p.getAltura());
	
		p.anyadir(r);
	}
}
