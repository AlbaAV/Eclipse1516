package _03ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _14Personas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String nombre;
		int edad;
		double estatura, peso;
		
		try(DataOutputStream f = new DataOutputStream(new FileOutputStream("personas.bin")))
		{		
			do
			{
				System.out.println("Nombre: ");
				nombre = tec.nextLine();
				if(!nombre.equals(""))
				{
					System.out.println("Edad: ");
					edad = tec.nextInt();
					
					System.out.println("Peso: ");
					peso = tec.nextDouble();
					
					System.out.println("Estatura: ");
					estatura = tec.nextDouble();
					
					//Escribimos en el fichero
					f.writeUTF(nombre);
					f.writeInt(edad);
					f.writeDouble(peso);
					f.writeDouble(estatura);
				}
			}while(!nombre.equals(""));
		}catch(FileNotFoundException e)
		{
			System.out.println("Error al abrir");
		}catch(IOException e)
		{
			System.out.println("No se puede escribir o cerrar");
		}
	}

}
