package _03ejerciciosPOO;

import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

public class _09CambioColor {

	public static void main(String[] args){
		Pizarra p = new Pizarra();
		Rectangulo r = new Rectangulo(Figura.AZUL,0,0,p.getAnchura(),p.getAltura());
	
		p.anyadir(r);
		p.esperar(1000);
		
		r.setColor(Figura.AMARILLO);
		p.esperar(1000);
		
		r.setColor(Figura.ROJO);
		p.esperar(1000);
		
		r.setColor(Figura.VERDE);
	}
}
