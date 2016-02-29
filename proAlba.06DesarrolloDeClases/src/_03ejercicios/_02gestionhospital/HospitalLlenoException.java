package _03ejercicios._02gestionhospital;

public class HospitalLlenoException extends Exception {
	public HospitalLlenoException(){
		
	}
	
	public HospitalLlenoException(String msg){
		super(msg);
	}
}
