package _03ejercicios.herencia._02videojuegos;

public class Test {
	public static void main(String[] args) {
		JuegoEnAlquiler ja1 = new JuegoEnAlquiler("aaaaa","bbbbb",2000,5.3,10,2);
		JuegoEnAlquiler ja2 = new JuegoEnAlquiler("bbbbb","ccccc",2000,5.3,10,2);
		JuegoEnAlquiler ja3 = new JuegoEnAlquiler("ccccc","ddddd",2000,5.3,10,2);
		
		JuegoEnVenta jv1 = new JuegoEnVenta("eeeee","eeeee",2000,5.3,10);
		JuegoEnVenta jv2 = new JuegoEnVenta("fffff","fffff",2000,5.3,10);
		JuegoEnVenta jv3 = new JuegoEnVenta("ggggg","ggggg",2000,5.3,10);
	
		//Array en el que almacenar los JuegosEnAlquiler
		JuegoEnAlquiler ja[] = {ja1,ja2,ja3};
		
		//Array en el que almacenar los JuegosEnAlquiler
		JuegoEnVenta jv[] = {jv1,jv2,jv3};
		
		//Array en el que almacenar todos los Juegos:  POLIMORFISMO
		Juego j[] = {ja1,ja2,ja3,jv1,jv2,jv3};
		
		for(int i = 0; i < j.length; i++){
			System.out.println(j[i]);
			System.out.println("--------------");
		}
	}

}
