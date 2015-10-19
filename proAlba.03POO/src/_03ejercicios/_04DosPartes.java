package _03ejercicios;

import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

public class _04DosPartes {

	public static void main(String[] args){
		Pizarra p = new Pizarra();
		Rectangulo r1 = new Rectangulo(Figura.ROJO,0,0,p.getAnchura(),p.getAltura()*1/4);
	
		p.anyadir(r1);
		Rectangulo r2 = new Rectangulo(Figura.VERDE,0,p.getAltura()*1/4,p.getAnchura(),p.getAltura()*3/4);
		
		p.anyadir(r2);
		
		
	}
}
