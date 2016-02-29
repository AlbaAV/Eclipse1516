package _03ejercicios;

public class _09Tocayos {

	public static void main(String[] args) {
		String grupo1[] = {"miguel","josé","ana","maría"};
		String grupo2[] = {"ana","josé","luján","juan","jose","pepa","sofía","andrés","bartolo"};
		
		int cont = 0;
		for(int i =0; i < grupo1.length; i++){
			boolean enc = false;
			for(int j = 0; j < grupo2.length && !enc; j++){
				if(grupo1[i].equals(grupo2[j])){
					enc = true;
					System.out.println(grupo1[i] + " tiene un tocayo en el segundo grupo");
					cont++;
				}
			}
		}
		
		/*
		 * for(int i = 0; i < grupo1.length; i++){
		 * 		boolean enc = false;
		 * 		while(j < grupo2.length && !enc){
		 * 			if(grupo1[i].equals(grupo2[j])) enc = true;
		 * 			else j++;
		 * 		}
		 * 		if(enc){
		 * 			System.out.println(grupo1[i] + " tiene un tocayo en el grupo 2");
		 * 			cont ++;
		 * 		}
		 * }
		 */
		System.out.println("TOTAL: " + cont);
	}
}
