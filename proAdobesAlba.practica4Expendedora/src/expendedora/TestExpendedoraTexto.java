package expendedora;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;

public class TestExpendedoraTexto {
	static Scanner tec = new Scanner(System.in).useLocale(Locale.US);
	public static void main(String[] args) {
		
		// Creamos un objeto Expendedora(cambio,stock,precio)

		Expendedora expend = new Expendedora(50,10,0.7);
		
		boolean continuar = true;
		
		/**
		 * Motrar� el men� y realizar� las operaciones de los distintos m�todos a los que "llama"
		 * Le pedir� otra vez al usuario la opci�n si se equivoca
		 * El do-while finalizar�, y con ello el programa cuando la opci�n sea 4
		 */
		
		do{
			try{
				//menuString --> muestra el men� de opciones
				menuString();
				
				//Pide una opci�n al cliente
				int opcion = tec.nextInt();
				//Realizar� diferentes operaciones, dependiendo del valor de opcion
				switch(opcion){
					case 1:
						//Realiza las operaciones en el m�todo introducir --> introducirDinero()
						introducir(expend);
						break;
					case 2:
						//Realiza las operaciones en el m�todo soliciar --> solicitarDevolucion()
						solicitar(expend);
						break;
					case 3: 
						//Realiza las operaciones en el m�todo comprar --> comprarProducto()
						comprar(expend);
						break;
					
					case 4: System.out.println("4.- SALIR"); //Opcion 4: Finaliza el programa
						continuar = false;
						break;
					
					default: //Valores por defecto; si introduce una valor distinto de entre 1-4 vuelve a pedir opcion
						System.out.println("Introduce una opcion entre 1 y 4");
						continuar = true;
				}//Fin switch
			
			//Capturar de excepci�n si opcion son letras, o valores no enteros (int)
			}catch(InputMismatchException ex){
				System.out.println("Introduce una opcion entre 1 y 4");
				tec.nextLine();
			}	
		}while(continuar);
	}
	
	/*
	 * M�todo menuString()
	 * muestra las diferentes opciones del men� por pantalla
	 */
	public static void menuString(){
		System.out.println("\n   	EXPENDEDORA"
			+"\n--------------------------------"
			+"\n 1.- Introducir importe"
			+"\n 2.- Solicitar Devolucion"
			+"\n 3.- Comprar Producto"
			+"\n 4.- Salir"
			+"\n--------------------------------"
			+"\nIntroduce opci�n:");
	}
	
	/**
	 * M�todo introducir
	 * Realizar� las operaciones correspondientes a la elecci�n de la opci�n 1 del men�
	 * Introducir� el cr�dito en la m�quina, mediante el m�todo introducirDinero de la clase ExpendedoraMultiproducto
	 * Si el importe introducido no es v�lido se lo volver� a solicitar
	 * @param expMult
	 */
	public static void introducir(Expendedora expend)
	{
		double importe = 0;
		System.out.println("1.-INTRODUCIR IMPORTE\n");
		boolean impBien = true;
		do{
			try{
				importe = tec.nextDouble();
				
				if(importe >= 0.00){
					impBien = true;
				}else {
					System.out.println("Introduce un cr�dito v�lido: ");
					impBien = false;
				}
				
			}catch(InputMismatchException ex){
				impBien = false;
				tec.nextLine();
			}
		}while(impBien != true);
		//introducirDinero(importe) --> clase ExpendedoraMultiproducto
		expend.introducirDinero(importe);
		
		//Muestra el toString() de ExpendedoraMultiproducto
		System.out.println("\n------------------------------------------------------------------"
				+ "+\n		EXPENDEDORA: " + expend.toString());
	}
	
	/**
	 * M�todo solicitar
	 * Realizar� las operaciones correspondientes a la elecci�n de la opci�n 2 del men�
	 * Devolver� el cr�dito introducido previament, mediante el m�todo solicitarDevolucion() de la clase ExpendedoraMultiproducto
	 * Si no ha introducido nada de importe previamente la devoluci�n es 0
	 * @param expMult
	 */
	public static void solicitar(Expendedora expend)
	{
		System.out.println("2.- SOLICITAR DEVOLUCI�N\n");
		//toString() clase ExpendedoraMultiproducto
		System.out.println("\tDEVOLUCI�N " +expend.solicitarDevolucion());
		System.out.println("\n------------------------------------------------------------------"
				+ "+\n		EXPENDEDORA: " + expend.toString());
	}
	
	/**
	 * 
	 * M�todo comprar
	 * Realizar� las operaciones correspondientes a la elecci�n de la opci�n 3 del men�
	 * Comprar� el producto y lanazar� un mensaje si se captura alguna de las excepciones
	 * de comprarProducto() de la clase Expendedora
	 * @param expMult
	 */
	
	public static void comprar(Expendedora expend){
		System.out.println("3.- COMPRAR PRODUCTO\n");
		try{
			System.out.println("Aqui tienes tu devolucion " +expend.comprarProducto());
			System.out.println("\n------------------------------------------------------------------"
					+ "+\n		EXPENDEDORA: " + expend.toString());
		}catch(NoHayCambioException e){
			System.out.println(" \nNo hay cambio suficiente");
			
		} catch (NoHayProductoException e) {
			System.out.println(" \nNo hay producto suficiente");
		} catch (CreditoInsuficienteException e) {
			System.out.println(" \nNo hay credito suficiente");
		}
	}
	
}
