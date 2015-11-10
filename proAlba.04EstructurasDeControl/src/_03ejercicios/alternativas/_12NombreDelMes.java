package _03ejercicios.alternativas;

import java.util.Scanner;

public class _12NombreDelMes {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce el numero del mes (1-12): ");
		int nMes = tec.nextInt();
		String mes = "";
		if(nMes ==1){
			mes = "enero";
			System.out.println("Mes " + nMes + ": " + mes);
		}else if(nMes ==2){
			mes = "febrero";
			System.out.println("Mes " + nMes + ": " + mes);
		}else if(nMes ==3){
			mes = "marzo";
			System.out.println("Mes " + nMes + ": " + mes);
		}else if(nMes ==4){
			mes = "abril";
			System.out.println("Mes " + nMes + ": " + mes);
		}else if(nMes ==5){
			mes = "mayo";
			System.out.println("Mes " + nMes + ": " + mes);
		}else if(nMes ==6){
			mes = "junio";
			System.out.println("Mes " + nMes + ": " + mes);
		}else if(nMes ==7){
			mes = "julio";
			System.out.println("Mes " + nMes + ": " + mes);
		}else if(nMes ==8){
			mes = "agosto";
			System.out.println("Mes " + nMes + ": " + mes);
		}else if(nMes ==9){
			mes = "septiembre";
			System.out.println("Mes " + nMes + ": " + mes);
		}else if(nMes ==10){
			mes = "octubre";
			System.out.println("Mes " + nMes + ": " + mes);
		}else if(nMes ==11){
			mes = "noviembre";
			System.out.println("Mes " + nMes + ": " + mes);
		}else{
			mes="diciembre";
			System.out.println("Mes " + nMes + ": " + mes);
		}
	}
}
