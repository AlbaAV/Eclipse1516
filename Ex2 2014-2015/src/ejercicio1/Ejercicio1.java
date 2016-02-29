package ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {
		int ejem1[] = { 1,2,3,4,5,6,7,8,9,10};
		System.out.println(soloHayUnPar(ejem1));
		int ejem2[] = {2,3,5,7,1,9,11};
		System.out.println(soloHayUnPar(ejem2));
		
	}
	
	public static boolean soloHayUnPar (int v[]){
		boolean par = false;
		int cont = 0;
		for(int i = 0; i < v.length && cont < 2; i++){
			if(v[i] %2 == 0){
				cont ++;
			}
		}
		
		if(cont == 1) par = true;
		else par = false;
		return par;
	}
}
