package _02ejemplos;

public class _04SalaFiestas {
	public static void main(String[] args) {
		int edad[] = {20,13,15,23,38,40,12,30,21,22,22,22};
		
		boolean enc = false;
		int cont = 0;
		for (int i = 0; i < edad.length && !enc; i++) {
			if(edad[i] > 25) cont ++;
			if(cont == 2) enc = true;
		}
		
		if(enc) System.out.println("Pueden entrar");
		else System.out.println("No pueden entrar");
		
		//De otra forma
		cont = 0;
		for(int i = 0; i< edad.length && cont <2; i++){
			if(edad[i] > 25) cont ++;
		}
		if(cont >= 2) System.out.println("Pueden entrar");
		else System.out.println("No pueden entrar");
	}

}
