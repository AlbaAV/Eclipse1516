package _03ejerciciosPOO;

import figuras.Circulo;
import pizarra.Pizarra;

public class _08AgrandarCirculo {
	public static void main(String[] args) {
		Pizarra p = new Pizarra();
		int r = (int) ((Math.random()*100)+100);
		Circulo c = new Circulo(r,r,r);
		
		p.anyadir(c);
		p.esperar(2000);
		
		r = r*2;
		
		c.setRadio(r);
		c.setPosx(r);
		c.setPosy(r);
	}
}

