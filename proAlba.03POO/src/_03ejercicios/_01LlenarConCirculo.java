package _03ejercicios;

import figuras.Circulo;
import figuras.Figura;
import pizarra.Pizarra;

public class _01LlenarConCirculo {
	public static void main(String[] args) {
		Pizarra p = new Pizarra("Llenar con Circulo",200,200);
		Circulo c = new Circulo(Figura.AZUL,100,100,100);
		
		p.anyadir(c);
	}
}
