package _02ejemplos;

public class _03Maximos {
	public static void main(String[] args) {
		System.out.println(maximo(8,5,3));
		System.out.println(maximo(7.3,5,2));
		System.out.println(maximo(8,5.5,9,3));
		
	}
	//Maximo de tres int
	public static int maximo(int n1,int n2, int n3){
		int max = Math.max(n1, n2);
		max = Math.max(max, n3);
		return max;
	}
	//Maximo de tres double
	//sobrecarga mismo nombre para otro metodo
	public static double maximo(double n1, double n2, double n3){
		double max = Math.max(n1, n2);
		max = Math.max(max, n3);
		return max;		
	}
	
	//Maximo de 4 double
	public static double maximo(double n1, double n2, double n3, double n4){
		double max = maximo(n1, n2,n3);
		max = Math.max(max, n4);
		return max;
	}
}
