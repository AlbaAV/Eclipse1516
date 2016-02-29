package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class _02Lluvias {
	public static void main(String[] args) 
	{
		double lluvias[] = new double[31];
		try
		{
			leerArray(lluvias, "lluviasenero.txt");
			System.out.println(lluvias);
			System.out.println(Arrays.toString(lluvias));
			System.out.println();
			//Suma
			System.out.println(" La suma de las lluvias es: " + suma(lluvias));
			//Media
			System.out.println(" La media de las lluvias es: " + media(lluvias));
			//Maximo
			System.out.println(" El Máximo de lluvias es: " + maximo(lluvias));
			//Posicion Maximo
			System.out.println(" El Máximo de lluvias está en la posición : " + (posMaximo(lluvias)+1));
			System.out.println(" Dia con mas lluvia : " + (posMaximo(lluvias) +1));
			
			//Minimo
			System.out.println(" El Mínimo de lluvias es: " + minimo(lluvias));
			//Contar Apariciones
			System.out.println(" Apariciones de 0 : " + contarApariciones(lluvias,0));
			
			//Suma Parcial
			System.out.println(" Suma Parcial 0-14 : " + sumaParcial(lluvias,0,14));
			
			//Menores que el siguiente
			System.out.println(" Menores que el siguiente : " + menoresQueElSiguiente(lluvias));
			System.out.println(" Menores que el siguiente 2: " + menoresQueElSiguiente2(lluvias));
			
			int posP = posPrimero(lluvias, 12.5);
			
				if(posP == -1){
					System.out.println("Ningun dia llovio 19 litros: ");
				}else System.out.println("El 1º dia que llovio 19 litros: " + posP);
				
			int posU = posUltimo(lluvias, 8.0);
			System.out.println(posU);
				
		}catch(FileNotFoundException e)
		{
			System.out.println("El fichero no existe");
		}
	}
	public static void leerArray (double v[], String nombreFichero) throws FileNotFoundException 
	{
		Scanner f = new Scanner(new File(nombreFichero)).useLocale(Locale.US);
		for(int i = 0; i < v.length; i++)
		{
			v[i] = f.nextDouble();
		}
		f.close();		
	}
	public static double suma(double v[])
	{
		double s = 0;
		for(int i = 0; i < v.length; i++)
		{
			s += v[i];
		}
		return s;
	}
	
	public static double media(double v[]){
		double media = 0;
		double suma = suma(v);
		media = suma/v.length;
		return media;
		
		//return suma(v)/v.length;
	}
	
	public static double maximo(double v[]){
		double max = v[0];
		for(int i = 0; i < v.length; i++){
			if(v[i] > max){
				max = v[i];
			}
		}
		return max;
	}
	
	public static int posMaximo(double v[]){
		double max = v[0];
		int pos = 0;
		for(int i = 0; i < v.length; i++){
			if(v[i] > max){
				max = v[i];
				pos = i;
			}
		}	
		//for(int i = 1; i < v.length; i++)
		
		return pos;		
	}
	
	public static double minimo(double v[]){
		double min = v[0];
		for(int i = 0; i < v.length; i++){
			if(v[i] < min){
				min = v[i];
			}
		}
		return min;
	}
	
	public static int contarApariciones(double v[], double x){
		int cont =0;
		for(int i = 0; i < v.length; i++){
			if(v[i] == x){
				cont++;
			}
		}
		return cont;
	}
	
	public static double sumaParcial(double v[], int izq, int der){
		double suma = 0;
		for(int i = izq; i <= der; i++){
			suma += v[i];
		}
		return suma;
	}
	public static int menoresQueElSiguiente(double v[]){
		int cont = 0;
		for(int i = 0; i < v.length-1; i++){
			if(v[i] < v[i+1]){
				cont++;
			}
		}
		return cont;
	}
	
	public static int menoresQueElSiguiente2(double v[]){
		int cont = 0;
		for(int i = 1; i < v.length; i++){
			if(v[i-1] < v[i]){
				cont++;
			}
		}
		return cont;
	}
	
	
	public static int posPrimero(double v[], double x){
		boolean enc = false;
		int posP = 0;
		for(int i = 0; i < v.length && !enc;i++){
			if(v[i] == x) {
				enc = true;
				posP = i +1;
			}else {
				enc = false;
				posP = -1;
			}
		}
		return posP;
	}
	public static int posUltimo(double v[], double x){
		boolean enc = false;
		int posU = -1;
		for(int i = v.length-1; i > 0 && !enc;i--){
			if(v[i] == x) {
				enc = true;
				posU = i+1;
			}
		}
		return posU;
	}
} 
