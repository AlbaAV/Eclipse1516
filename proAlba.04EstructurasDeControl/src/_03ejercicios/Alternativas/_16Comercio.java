package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _16Comercio {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la compra: ");
		double compra = tec.nextDouble();	
		double descuento = 8;
		double desApli = (compra- (compra*(descuento/100)));
		double total = compra - desApli;
		
		if (compra < 40){
			descuento = 0;
			desApli = 0;
			total  = compra;
		} else {
			if (desApli > 12)
				desApli = 12;
		}
		System.out.println("Importe de la compra " + compra);
		System.out.println("Porcentaje de descuento aplicado " + descuento+"%");
		System.out.println("Descuento apliacado " + desApli + "�");
		System.out.println("Cantidad a pagar " + total +" �");
	}
}
