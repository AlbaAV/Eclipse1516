package _02ejemplos.excepcionDeUsuario;

public class MediaNotas {
	public static void main(String[] args) {
		try {
			double n1 = Nota.leerNota();
			double n2 = Nota.leerNota();
			System.out.println("Media: " + (n1+n2)/2);
		} catch(NotaIncorrectaException e) {
			System.out.println(e.getMessage());
		}
	}
}