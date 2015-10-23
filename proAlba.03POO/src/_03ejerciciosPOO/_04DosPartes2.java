package _03ejerciciosPOO;

import figuras.Figura;
import figuras.Rectangulo;
import pizarra.Pizarra;

public class _04DosPartes2 {

	public static void main(String[] args){
		Pizarra p = new Pizarra();
		int ancho = p.getAnchura();
		int alto = p.getAltura();
		int alto25 = (int)(alto*0.25);
		int alto75 = alto-alto25;
		
		Rectangulo r1 = new Rectangulo(Figura.ROJO,0,0,ancho,alto25);
		Rectangulo r2 = new Rectangulo(Figura.VERDE,0,alto25,ancho,alto75);
		
		p.anyadir(r1);	
		p.anyadir(r2);
		
		
	}
}
