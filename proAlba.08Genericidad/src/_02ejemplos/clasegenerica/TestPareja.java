package _02ejemplos.clasegenerica;

public class TestPareja {
	public static void main(String[] args) {
		//Lo siguiente compila y ejecuta bien
		Pareja<String> p1 = new Pareja<>("vaca","baca"); 
			// O Pareja<String> p1 = new Pareja<String>("vaca","baca");
		System.out.println(p1.toString());
		
		//Error de compilación:
		// --> --> Pareja<String> p2 = new Pareja<>("vaca",new Integer(2));
		
	}
}
