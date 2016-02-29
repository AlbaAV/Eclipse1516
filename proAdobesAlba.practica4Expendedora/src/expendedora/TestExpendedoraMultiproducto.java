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
		 * Creamos dos arrays que tendrán longitud 5 y corresponderán al número de producto de la máquina expendedora
		 * uno será el array e stock y el otro el array de precios correspondientes a los diferentes productos.
		 */
		
		int stock[] = {0, 12, 3, 6,10};
		double precio[] = {0,0.7,2,1, 1.3};
		
		/**
		 * Creamos un objeto ExpendedoraMultiproducto
		 * Le pasaremos como párametros el cambio disponible en la máquina, el numero de productos diferentes, 
		 * el array de stock de esos productos (previamente creado), y el array de los diferentes precios de los productos que también se han creado previamente
		 */
		
		ExpendedoraMultiproducto expMult = new ExpendedoraMultiproducto(10,5,stock, precio);
		
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
						introducir(expMult);
						break;
					case 2:
						//Realiza las operaciones en el método soliciar --> solicitarDevolucion()
						solicitar(expMult);
						break;
					case 3: 
						//Realiza las operaciones en el método comprar --> comprarProducto()
						comprar(expMult);
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
			+"\nIntroduce opcion:");
	}
	
	/**
	 * Método introducir
	 * Realizará las operaciones correspondientes a la elección de la opción 1 del menú
	 * Introducirá el crédito en la máquina, mediante el método introducirDinero de la clase ExpendedoraMultiproducto
	 * Si el importe introducido no es válido se lo volverá a solicitar
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
					System.out.println("Introduce un crédito válido: ");
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
	 * Método solicitar
	 * Realizará las operaciones correspondientes a la elección de la opción 2 del menú
	 * Devolverá el crédito introducido previament, mediante el método solicitarDevolucion() de la clase ExpendedoraMultiproducto
	 * Si no ha introducido nada de importe previamente la devolución es 0
	 * @param expMult
	 */
	public static void solicitar(ExpendedoraMultiproducto expMult)
	{
		System.out.println("2.- SOLICITAR DEVOLUCIÓN\n");
		//toString() clase ExpendedoraMultiproducto
		System.out.println("\tDEVOLUCIÓN " +expMult.solicitarDevolucion());
		System.out.println("\n------------------------------------------------------------------"
				+ "+\n		EXPENDEDORA: " + expMult.toString());
	}
	
	/**
	 * /**
	 * Método comprar
	 * Realizará las operaciones correspondientes a la elección de la opción 3 del menú
	 * Comprará el producto seleccionado
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
	 * Método que devuelve el producto que será seleccionado de la máquina multiproducto
	 * Pedirá la selección del producto mientras no sea un valor entre 1 y menor que expMult.getNumProductos()
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
					System.out.println("Introduce una opcion válida entre " + 1 +" y " + (expMult.getNumProductos()-1)+"\n");
					enc = false;
				}
			}catch(InputMismatchException e){
				System.out.println("Introduce una opcion válida entre " + 1 +" y " + (expMult.getNumProductos()-1)+"\n");
				tec.nextLine();
			}
		}while(!enc);
		return opc;
		
		
	}
}
