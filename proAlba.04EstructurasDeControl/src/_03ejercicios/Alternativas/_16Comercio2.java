package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _16Comercio2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Importe: ");
		
		double importe = tec.nextDouble();
		
		//Calculamos descuento a aplicar
		double porcentajeDto = 0;
		if(importe > 40) porcentajeDto = 8;
		
		//Calculamos el descuento, con un valor maximo de 12
		double descuento = importe * porcentajeDto/100; 
		if(descuento > 12) descuento = 12;
		//de otra forma
		descuento = Math.min(12, importe * porcentajeDto/100);
		
		System.out.println("Importe de la compra " + importe);
		System.out.println("Porcentaje de descuento aplicado " + porcentajeDto+"%");
		System.out.println("Descuento apliacado " + descuento + "�");
		System.out.println("Cantidad a pagar " + (importe-descuento) +" �");
		
	}
}
