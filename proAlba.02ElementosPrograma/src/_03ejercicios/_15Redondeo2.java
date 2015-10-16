package _03ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class _15Redondeo2 {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in).useLocale(Locale.US);
	System.out.println("Introduce un numero decimal: ");
	double num = tec.nextDouble();
	System.out.println((double)(Math.round(num*10))/10);
}
}
