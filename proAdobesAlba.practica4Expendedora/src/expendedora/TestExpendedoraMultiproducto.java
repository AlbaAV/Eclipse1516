package expendedora;

import java.util.InputMismatchException;
import java.util.Scanner;

import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;

public class TestExpendedoraMultiproducto {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		/**
		 * Creamos dos arrays que tendr�n longitud 5 y corresponder�n al n�mero de producto de la m�quina expendedora
		 * uno ser� el array e stock y el otro el array de precios correspondientes a los diferentes productos.
		 */
		
		int stock[] = {0, 12, 3, 6,10};
		double precio[] = {0,0.7,2,1, 1.3};
		
		/**
		 * Creamos un objeto ExpendedoraMultiproducto
		 * Le pasaremos como p�rametros el cambio disponible en la m�quina, el numero de productos diferentes, 
		 * el array de stock de esos productos (previamente creado), y el array de los diferentes precios de los productos que tambi�n se han creado previamente
		 */
		
		ExpendedoraMultiproducto expMult = new ExpendedoraMultiproducto(10,5,stock, precio);
		
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
						introducir(expMult);
						break;
					case 2:
						//Realiza las operaciones en el m�todo soliciar --> solicitarDevolucion()
						solicitar(expMult);
						break;
					case 3: 
						//Realiza las operaciones en el m�todo comprar --> comprarProducto()
						comprar(expMult);
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
			+"\nIntroduce opcion:");
	}
	
	/**
	 * M�todo introducir
	 * Realizar� las operaciones correspondientes a la elecci�n de la opci�n 1 del men�
	 * Introducir� el cr�dito en la m�quina, mediante el m�todo introducirDinero de la clase ExpendedoraMultiproducto
	 * Si el importe introducido no es v�lido se lo volver� a solicitar
	 * @param expMult
	 */
	public static void introducir(ExpendedoraMultiproducto expMult)
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
		expMult.introducirDinero(importe);
		
		//Muestra el toString() de ExpendedoraMultiproducto
		System.out.println("\n------------------------------------------------------------------"
				+ "+\n		EXPENDEDORA: " + expMult.toString());
	}
	
	/**
	 * M�todo solicitar
	 * Realizar� las operaciones correspondientes a la elecci�n de la opci�n 2 del men�
	 * Devolver� el cr�dito introducido previament, mediante el m�todo solicitarDevolucion() de la clase ExpendedoraMultiproducto
	 * Si no ha introducido nada de importe previamente la devoluci�n es 0
	 * @param expMult
	 */
	public static void solicitar(ExpendedoraMultiproducto expMult)
	{
		System.out.println("2.- SOLICITAR DEVOLUCI�N\n");
		//toString() clase ExpendedoraMultiproducto
		System.out.println("\tDEVOLUCI�N " +expMult.solicitarDevolucion());
		System.out.println("\n------------------------------------------------------------------"
				+ "+\n		EXPENDEDORA: " + expMult.toString());
	}
	
	/**
	 * /**
	 * M�todo comprar
	 * Realizar� las operaciones correspondientes a la elecci�n de la opci�n 3 del men�
	 * Comprar� el producto seleccionado
	 * @param expMult
	 */
	
	public static void comprar(ExpendedoraMultiproducto expMult){
		System.out.println("3.- COMPRAR PRODUCTO\n");
		try{
			int selec= seleccion(expMult);
			System.out.println("Aqui tienes tu devolucion " +expMult.comprarProducto(selec));
			System.out.println("\n------------------------------------------------------------------"
					+ "+\n		EXPENDEDORA: " + expMult.toString());
		}catch(NoHayCambioException e){
			System.out.println(" \nNo hay cambio suficiente");
			
		} catch (NoHayProductoException e) {
			System.out.println(" \nNo hay producto suficiente");
		} catch (CreditoInsuficienteException e) {
			System.out.println(" \nNo hay credito suficiente");
		}
	}
	
	/**
	 * M�todo que devuelve el producto que ser� seleccionado de la m�quina multiproducto
	 * Pedir� la selecci�n del producto mientras no sea un valor entre 1 y menor que expMult.getNumProductos()
	 * @param expMult
	 * @return opc
	 */
	public static int seleccion(ExpendedoraMultiproducto expMult){
		int opc = 0;
		boolean enc = true;
		do{
			try{
				System.out.println("Introduce el numero del producto");
				opc=tec.nextInt();
				if(opc >= 1 && opc < expMult.getNumProductos()){
					enc = true;
				}else {
					System.out.println("Introduce una opcion v�lida entre " + 1 +" y " + (expMult.getNumProductos()-1)+"\n");
					enc = false;
				}
			}catch(InputMismatchException e){
				System.out.println("Introduce una opcion v�lida entre " + 1 +" y " + (expMult.getNumProductos()-1)+"\n");
				tec.nextLine();
			}
		}while(!enc);
		return opc;
		
		
	}
}
