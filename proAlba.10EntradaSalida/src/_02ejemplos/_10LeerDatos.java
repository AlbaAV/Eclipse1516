package _02ejemplos;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _10LeerDatos {
	public static void main(String[] args) {
		try(DataInputStream f = new DataInputStream(new FileInputStream("personas.bin")))
		{
			System.out.println("Nombre	edad	peso	estatura\n--------------------------------");
			while(true)	//bucle infinito
			{
				String nombre = f.readUTF();
				int edad = f.readInt();
				double peso = f.readDouble();
				double estatura = f.readDouble();
				System.out.println( nombre + "	" +  edad + "	" + peso + "	" +  estatura );
			}
		}catch(EOFException e)
		{
			
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir");
		} catch (IOException e) {
			System.out.println("Error al leer y cerrar");
		}
	}

}
