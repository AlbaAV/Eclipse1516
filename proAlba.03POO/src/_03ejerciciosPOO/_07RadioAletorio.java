package _03ejerciciosPOO;

import figuras.Circulo;
import pizarra.Pizarra;

public class _07RadioAletorio {
	public static void main(String[] args) {
		Pizarra p = new Pizarra();
		int r = (int) ((Math.random()*150)+50);
		Circulo c = new Circulo(r,r,r);
		
		p.anyadir(c);
	}
}
