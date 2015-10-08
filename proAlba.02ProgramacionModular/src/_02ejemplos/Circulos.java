package _02ejemplos;

public class Circulos {

	public static double longitud(double r){
		double l = 2 * Math.PI * r;
		return l;
	}
	
	public static double area(double r){
		//double a = Math.PI * Math.pow(r,2);
		//return a;
		
		double area = Math.PI * (r*r);
		return area;
	}
	
	public static double volumen(double r){
		double v = 4.0/3 * (Math.PI*Math.pow(r,3));
		return v;
	}
}
