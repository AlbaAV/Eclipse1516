package _03ejercicios._05gestorcorreoelectronico;

public class Mensaje {

	private int codigo;
	private String emisor;
	private String destinatario;
	private String asunto;
	private String texto;
	private static int siguienteCodigo = 1;
	
	public Mensaje(String e, String d, String a, String t){
		emisor = e;
		destinatario = d;
		asunto = a;
		texto = t;
		
		codigo = siguienteCodigo;
		siguienteCodigo++;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Mensaje)) return false;
		Mensaje m = (Mensaje) o;
		return this.codigo == m.codigo;
	}
	
	public static boolean validarEmail(String email){
		int posArroba = email.indexOf('@');
		int posPunto = email.lastIndexOf('.');
		if(posArroba == -1 || 
				posPunto == -1 ||
				posArroba == 0 ||
				posPunto == email.length() -1 ||
				posPunto <= posArroba+1)
			
			return false;
		
		else return true;
	}
	
	public int getCodigo(){
		return codigo;
	}
	public String getEmisor(){
		return emisor;
	}
	public String getDestinatario(){
		return destinatario;
	}
	public String getAsunto(){
		return asunto;
	}
	public String getTexto(){
		return texto;
	}
}
