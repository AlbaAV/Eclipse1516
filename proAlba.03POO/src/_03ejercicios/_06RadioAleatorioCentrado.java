package _03ejercicios;

import figuras.Circulo;
import figuras.Figura;
import pizarra.Pizarra;

public class _06RadioAleatorioCentrado {
	public static void main(String[] args) {
		Pizarra p = new Pizarra();
		Pizarra p2 = new Pizarra();
		int r = (int) (Math.random()*150)+50;
		Circulo c = new Circulo(p.getAnchura()/2,p.getAltura()/2,(int) (Math.random()*150)+50);
		p.anyadir(c);
		System.out.println(c.getRadio());
		
		Circulo c2 = new Circulo(Figura.AMARILLO,p2.getAnchura()/2,p2.getAltura()/2,r);
		p.anyadir(c2);
		System.out.println(c2.getRadio());
	}

}
