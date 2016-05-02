package _03ejercicios._07DiccionarioIngEsp;

public class TestDiccionario {
	public static void main(String[] args) {
		DiccionarioBilingue db = new DiccionarioBilingue();
		db.anyadirTraduccion("casa", "home");
		db.anyadirTraduccion("casa", "house");
		db.anyadirTraduccion("casa", "house");
	System.out.println(db.anyadirTraduccion("hola", "hello"));
	System.out.println(db.anyadirTraduccion("hola", "hello"));
	System.out.println(db.anyadirTraduccion("hola", "hell"));
		
		System.out.println(db.toString());
		System.out.println("==============================================");
		System.out.println(db.quitarTraduccion("casa", "hoe"));
		System.out.println(db.quitarTraduccion("casa", "home"));
		System.out.println(db.quitarTraduccion("casa", "house"));
		System.out.println(db.toString());
		
	}
}
