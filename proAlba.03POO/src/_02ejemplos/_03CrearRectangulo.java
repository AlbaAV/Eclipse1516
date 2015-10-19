package _02ejemplos;

import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

public class _03CrearRectangulo {

	public static void main(String[] args) {
		Pizarra p = new Pizarra("Rectangulos de colores ",800,600);
		Pizarra p2 = new Pizarra("Segunda Pizarra ",200,500);
		
		Rectangulo r1 = new Rectangulo(0,0,200,100);
		//p.anyadir(figura);
		p.anyadir(r1);
		
		Rectangulo r2 = new Rectangulo(Figura.AMARILLO,201,0,200,100);
		p.anyadir(r2);
		
		Rectangulo r3 = new Rectangulo(Figura.VERDE,100,50,200,100);
		p2.anyadir(r3);
		
		p.esperar();
		p.quitar(r1);
	}
}
