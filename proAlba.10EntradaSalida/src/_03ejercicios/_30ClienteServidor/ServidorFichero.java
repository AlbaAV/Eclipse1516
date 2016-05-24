package _03ejercicios._30ClienteServidor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorFichero {
	final static int PUERTO = 5000;
	
	public ServidorFichero()
	{
		try{
			ServerSocket skServidor = new ServerSocket(PUERTO);
			
			System.out.println("servidor escuchando en el puerto " + PUERTO);
			Socket skCliente = skServidor.accept();
			
			System.out.println("Servidor: Sirviendo a un cliente");
			OutputStreamWriter flujoSal = new OutputStreamWriter(skCliente.getOutputStream());
			
			//Completar -
			try(FileReader f = new FileReader("minombre.txt")){
				int caracter;
				while((caracter = f.read())!=-1){
					flujoSal.write(caracter);
					flujoSal.flush();
				}
			} catch(FileNotFoundException e){
				System.out.println("Problema al abrir el fichero");
			} catch (IOException ex){
				System.out.println("Problema al leer o cerrar el fichero ");
			}
		}catch(IOException ex){
			System.out.println(ex);
		}
	}
	
	public static void main(String[] args){
		new ServidorFichero();
	}
	
}
