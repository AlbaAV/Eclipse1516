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
		 * Motrará el menú y realizará las operaciones de los distintos métodos a los que "llama"
		 * Le pedirá otra vez al usuario la opción si se equivoca
		 * El do-while finalizará, y con ello el programa cuando la opción sea 4
		 */
		
		do{
			try{
				//menuString --> muestra el menú de opciones
				menuString();
				
				//Pide una opción al cliente
				int opcion = tec.nextInt();
				//Realizará diferentes operaciones, dependiendo del valor de opcion
				switch(opcion){
					case 1:
						//Realiza las operaciones en el método introducir --> introducirDinero()
						introducir(expend);
						break;
					case 2:
						//Realiza las operaciones en el método soliciar --> solicitarDevolucion()
						solicitar(expend);
						break;
					case 3: 
						//Realiza las operaciones en el método comprar --> comprarProducto()
						comprar(expend);
						break;
					
					case 4: System.out.println("4.- SALIR"); //Opcion 4: Finaliza el programa
						continuar = false;
						break;
					
					default: //Valores por defecto; si introduce una valor distinto de entre 1-4 vuelve a pedir opcion
						System.out.println("Introduce una opcion entre 1 y 4");
						continuar = true;
				}//Fin switch
			
			//Capturar de excepción si opcion son letras, o valores no enteros (int)
			}catch(InputMismatchException ex){
				System.out.println("Introduce una opcion entre 1 y 4");
				tec.nextLine();
			}	
		}while(continuar);
	}
	
	/*
	 * Método menuString()
	 * muestra las diferentes opciones del menú por pantalla
	 */
	public static void menuString(){
		System.out.println("\n   	EXPENDEDORA"
			+"\n--------------------------------"
			+"\n 1.- Introducir importe"
			+"\n 2.- Solicitar Devolucion"
			+"\n 3.- Comprar Producto"
			+"\n 4.- Salir"
			+"\n--------------------------------"
			+"\nIntroduce opción:");
	}
	
	/**
	 * Método introducir
	 * Realizará las operaciones correspondientes a la elección de la opción 1 del menú
	 * Introducirá el crédito en la máquina, mediante el método introducirDinero de la clase ExpendedoraMultiproducto
	 * Si el importe introducido no es válido se lo volverá a solicitar
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
					System.out.println("Introduce un crédito válido: ");
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
	 * Método solicitar
	 * Realizará las operaciones correspondientes a la elección de la opción 2 del menú
	 * Devolverá el crédito introducido previament, mediante el método solicitarDevolucion() de la clase ExpendedoraMultiproducto
	 * Si no ha introducido nada de importe previamente la devolución es 0
	 * @param expMult
	 */
	public static void solicitar(Expendedora expend)
	{
		System.out.println("2.- SOLICITAR DEVOLUCIÓN\n");
		//toString() clase ExpendedoraMultiproducto
		System.out.println("\tDEVOLUCIÓN " +expend.solicitarDevolucion());
		System.out.println("\n------------------------------------------------------------------"
				+ "+\n		EXPENDEDORA: " + expend.toString());
	}
	
	/**
	 * 
	 * Método comprar
	 * Realizará las operaciones correspondientes a la elección de la opción 3 del menú
	 * Comprará el producto y lanazará un mensaje si se captura alguna de las excepciones
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
