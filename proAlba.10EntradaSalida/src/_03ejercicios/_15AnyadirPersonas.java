package _03ejercicios;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _15AnyadirPersonas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String nombre;
		int edad, opcion;
		double estatura, peso;
		boolean machaca = false;;
		
		System.out.println("MACHACA(1) o NO MACHACA(2)");
		opcion = tec.nextInt();
		if(opcion == 1)
			machaca = false;
		else if(opcion == 2)
			machaca = true;
		try(DataOutputStream f = new DataOutputStream(new FileOutputStream("personas.bin", machaca)))
		{		
			do
			{
				System.out.println("Nombre: ");
				nombre = tec.next();
				if(!nombre.equals("exit"))
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
			}while(!nombre.equals("exit"));
		}catch(FileNotFoundException e)
		{
			System.out.println("Error al abrir");
		}catch(IOException e)
		{
			System.out.println("No se puede escribir o cerrar");
		}
	}

}
