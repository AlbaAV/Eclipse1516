package _02ejemplos;

import figuras.Circulo;
import figuras.Figura;
import pizarra.Pizarra;

public class _05DibujarFiguras {
	public static void main(String[] args) {
		Pizarra p = new Pizarra("Circulos",600,400);
		Circulo c = new Circulo(Figura.ROJO,300,200,50);
		p.anyadir(c);
		
		p.esperar(1000);
		c.setRadio(75);
		System.out.println(c.getRadio());
		
		p.esperar(1000);
		c.setPosx(c.getPosx()+10);
	}
}
