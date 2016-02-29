package _03ejercicios.BuclesAnidados;

import java.util.Scanner;

public class _10DibujarFiguras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int x = tec.nextInt();
		int y = tec.nextInt();
		
		dibRecAsteriscos(x,y);
		dibRecNumeros1(x,y);
		dibRecNumeros2(x,y);
	}
	
	public static void dibRecAsteriscos(int ancho,int alto){
		String rec = "";
		for(int i = 1; i <= alto; i++){
			for(int j = 1; j <= ancho; j++){
				rec += "* ";
			}
			rec += "\n";
		}
		System.out.println(rec+"\n");
	}
	
	public static void dibRecNumeros1(int ancho, int alto){
		String rec = "";
		for(int i = 1; i <= alto; i++){
			for(int j = 1; j <= ancho; j++){
				rec += j + " ";
			}
			rec += "\n";
		}
		System.out.println(rec+"\n");
	}
	
	public static void dibRecNumeros2(int ancho, int alto){
		String rec = "";
		for(int i = alto; i > 0; i--){
			for(int j = ancho; j >0; j--){
				rec += j + " ";
			}
			rec += "\n";
		}
		System.out.println(rec+"\n");
	}
	
}
