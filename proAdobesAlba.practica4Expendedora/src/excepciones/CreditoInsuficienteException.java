package excepciones;

public class CreditoInsuficienteException extends Exception {
	public CreditoInsuficienteException(){
		
	}
	public CreditoInsuficienteException(String msg){
		super(msg);
	}
}
