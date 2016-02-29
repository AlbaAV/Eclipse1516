package _03ejercicios._05gestorcorreoelectronico;

public class TestCarpetas {
	public static void main(String[] args) {
		Carpeta recibidos = new Carpeta("Mensajes recibidos ");
		Carpeta eliminados = new Carpeta("Mensajes eliminados");
		
		recibidos.anyadir(new Mensaje("yo@gmail.com","tu@gmail.com","saludo","hola"));
		recibidos.anyadir(new Mensaje("tu@gmail.com","tu@gmail.com","saludo","adios"));
		recibidos.anyadir(new Mensaje("el@gmail.com","tu@gmail.com","saludo","hasta luego"));
		recibidos.anyadir(new Mensaje("yo@gmail.com","tu@gmail.com","saludo","hi"));
		
		System.out.println(recibidos.toString());
		System.out.println(eliminados.toString());
		
		try{
			Carpeta.mover(recibidos, eliminados, 1);
		}catch(ElementoNoEncontradoException e){
			System.out.println("El mensaje no existe ");
		}
	}
}
