package _03ejercicios;

public class _09Tocayos2 {
	public static void main(String[] args) {
		String grupo1[] = {"miguel","josé","ana","maría"};
		String grupo2[] = {"ana","antonio","luis","pedro","josé","rafa","pedro","roberto","francisca"};

		int cont = 0;
		//Recorremos grupo1
		for (int i = 0; i < grupo1.length; i++) {
			if(esta(grupo2, grupo1[i])) {
				System.out.println(grupo1[i] + " tiene un tocayo en el grupo 2");
				cont ++;
			}
		}
		System.out.println(cont + "personas tienen tocayo");
			
	}

	public static boolean esta(String v[], String x){
		boolean enc = false;
		int i = 0;
		while(i<v.length && !enc) {
			if(x.equals(v[i])) enc = true;
			else i++;
		}
		return enc;
	}
}
