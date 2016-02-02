package _03ejercicios.Alternativas;

import java.util.Scanner;

public class _12NombreDelMes2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int nMes = tec.nextInt();
		System.out.println("Mes " + nMes +": " + nombreMes(nMes));
	}
	
	public static String nombreMes(int mes){
		String nombre = "";
		if(mes ==1) nombre = "enero";
		else if(mes ==2) nombre = "febrero";
		else if(mes ==3) nombre = "marzo";
		else if(mes ==4) nombre = "abril";
		else if(mes ==5) nombre = "mayo";
		else if(mes ==6) nombre = "junio";
		else if(mes ==7) nombre = "julio";
		else if(mes ==8) nombre = "agosto";
		else if(mes ==9) nombre = "septiembre";
		else if(mes ==10) nombre = "octubre";
		else if(mes ==11) nombre = "noviembre";
		else if(mes ==12) nombre = "diciembre"; 
		else nombre ="¡¡ ERROR!!!";
		
		// o else nombre= "diciembre";
		
		return nombre;
	}
}
