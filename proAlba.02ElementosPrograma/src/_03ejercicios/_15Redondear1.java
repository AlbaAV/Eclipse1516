package _03ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class _15Redondear1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Introduce un numero decimal: ");
		double num = tec.nextDouble();
		//Math.round(num) = en el ejemplo da 36;
		num = num * 10;
		double redondeo = Math.round(num);
		double div = redondeo / 10;
		
		//System.out.println(div);
		
		/*
		 * Redondeo es correcto
		 * calculo realizado a partir de declaracion de variables
		 * Paso a Paso
		 */
		
		double redondeo2 = (double) (Math.round(num)) / 10;
		System.out.println(redondeo2 + " redondeo2 correcto");
		/*
		 * Redondeo2 es al vuelo
		 * El redondeo2 es correcto porque hay que transformar
		 * el Math.round(num) a double
		 * (double) (Math.round(num))/10
		 */

		double redondeo3 = (Math.round(num)) / 10;
		System.out.println(redondeo3 + " redondeo3 incorrecto ");
		
		/*
		 * El redondeo3 es incorrecto porque es necesario transformar 
		 * el Math.round(num) a double
		 */
		
		System.out.println("Introduce un numero decimal: ");
		double num2 = tec.nextDouble();
		//Math.round(num) = en el ejemplo da 36;
		num2 = num2 * 10;
		num2 = Math.round(num);
		num = num /10;

		
	}

}
