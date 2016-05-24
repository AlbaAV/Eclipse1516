package _02ejemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _08LeerBinario {
	public static void main(String[] args) {
		try(FileInputStream f = new FileInputStream("numeros.bin"))
		{
			int num ;			
				while((num = f.read()) != -1)
				{						
					System.out.println(num);
				}
		}catch(FileNotFoundException e)
		{
			System.out.println("Error al abrir el fichero");
		}catch(IOException e)
		{
			System.out.println("Error al cerrar el fichero");
		}
	}

}
