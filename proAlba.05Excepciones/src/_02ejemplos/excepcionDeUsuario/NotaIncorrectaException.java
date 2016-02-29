package _02ejemplos.excepcionDeUsuario;

public class NotaIncorrectaException extends Exception {
	public NotaIncorrectaException(){
		
	}
	public NotaIncorrectaException(String msg){
		super(msg);
	}

}