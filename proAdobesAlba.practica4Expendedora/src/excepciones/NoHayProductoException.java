package excepciones;

public class NoHayProductoException extends Exception {
	public NoHayProductoException(){
		
	}
	public NoHayProductoException(String msg){
		super(msg);
	}
}
