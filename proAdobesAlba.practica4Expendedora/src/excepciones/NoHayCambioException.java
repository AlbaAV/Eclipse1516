package excepciones;

public class NoHayCambioException extends Exception{
	public NoHayCambioException(){
		
	}
	public NoHayCambioException(String msg){
		super(msg);
	}
}
