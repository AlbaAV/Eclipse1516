package _02ejemplos;

public class _03Edades2 {
	public static void main(String[] args) {
		int edades[] = {20,18,19,23,25,26,20,21,24,26};
		if(puedenPasar(edades) == true){
			System.out.println("Pueden pasar. ");
		}else
			System.out.println("No hay 2 personas mayores de 25. ");
	}
	
	public static boolean puedenPasar(int v[]){
		int cont = 0;
		
		int i = 0;
		boolean enc = false;
		while(i<v.length && !enc){
			if(v[i] > 25) {
				cont ++;
				enc = true;
			}
			else i++;
		}
		
		enc = false;
		int j = i;
		
		while(j<v.length && !enc){
			if(v[j] > 25) {
				cont ++;
				enc = true;
			}
			else j++;
		}
		boolean pasar = (cont ==2);
		return pasar;
	}
	
	/*
	 * public static boolean puedenPasar(int v[]){
	 * 	int cont = 0;
	 * 	boolean enc = false;
	 * 	for(int i = 0; i < edad.length && !enc; i++){
	 * 		if(v[i] > 25) cont ++;
	 * 		if(cont ==2)enc = true;
		}
	 */
	
	/*
	 *	//en el main
	 * 	int cont = 0;
	 * 	for(int i = 0; i < edad.length && cont <2; i++){
	 * 		if(v[i] > 25) cont ++;
		}
		if(cont >= 2) System.out.println("Pueden entrar");
		else System.out.println("No pueden entrar!!!!!!");
	 */
}
