package _02ejemplos;

import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

public class _04MoverFigura {

	public static void main(String[] args) {
		Pizarra p = new Pizarra("Mover Figura",800,600);
		Rectangulo r = new Rectangulo(Figura.ROJO,0,0,100,100);
		p.anyadir(r);
		
		p.esperar(1000);
		r.setPosx(150);
	}
}
