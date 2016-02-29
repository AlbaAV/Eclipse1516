package ejercicio2;

public class Ejercicio2 {
	public static void main(String[] args) {
		int ejem1[] = { 10,20,25,28,10,5,5,-1,1};
		System.out.println(contarElementos(ejem1));
		System.out.println(contarElementos2(ejem1));
	}
	
	public static int contarElementos(int v[]){
		int cont = 0;
		int suma = 0;
		for(int i = 0; i < v.length; i++){
			for(int j = i+1; j <v.length; j++){
				suma += v[j];
			}
			if(v[i] == suma) cont++;
			suma = 0;
		}
		return cont;
	}
	
	//Esta opcion a mi no gustar
	public static int contarElementos2(int v[]){
		int cont = 0;
		int suma = 0;
		
		for(int i = v.length-1; i >= 0; i--){
			if(v[i] == suma) cont++;
			suma += v[i];
		}
		return cont;
	}
}
