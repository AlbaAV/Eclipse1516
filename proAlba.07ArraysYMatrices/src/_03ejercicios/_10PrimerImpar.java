package _03ejercicios;

public class _10PrimerImpar {
	public static void main(String[] args) {
		int numeros[] = {2,4,3,8,10};
		System.out.println("Suma: " + sumaDesdeImpar(numeros));
	}
	
	public static int sumaDesdeImpar(int v[]){
		int suma = 0;
		boolean enc = false;
		
		int i = 0;
		while(i<v.length && !enc){
			if(v[i] %2 != 0) enc = true;
			else i++;
		}
		
		for(int j = i+1; j < v.length; j++){
			suma += v[j];
		}
		return suma;
	}
}