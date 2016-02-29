package expendedora;

import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;

/**
 * @author ALBA
 *
 */

public class ExpendedoraMultiproducto {

	// ATRIBUTOS

	private double credito, cambio, recaudacion;
	private int stock[];
	private double precio[];
	private int numProductos;

	// CONSTRUCTOR
	
	/**
	 * Crea un constructor de tipo objeto; ExpendedoraMultiproducto
	 * @param cambio
	 * @param numProductos
	 * @param stock
	 * @param precio
	 */
	public ExpendedoraMultiproducto(double cambio, int numProductos, int stock[], double precio[]) {
		this.cambio = cambio;
		this.numProductos = numProductos;
		this.stock = stock;
		this.precio = precio;
		credito = 0;
		recaudacion = 0;
	}

	// CONSULTORES
	//GETTERS
	
	public double getCredito() {
		return credito;
	}

	public double getCambio() {
		return cambio;
	}

	public double getRecaudacion() {
		return recaudacion;
	}

	public int getStock() {
		return stock[numProductos];
	}

	public double getPrecio() {
		return precio[numProductos];
	}

	public int getNumProductos() {
		return numProductos;
	}

	// OTROS
	
	//Método toString()
	@Override
	public String toString() {

		return "\n------------------------------------------------------------------" 
				+ "\n    Credito: " + credito + " Euros" 
				+ "\n    Cambio: " + cambio + " Euros" 
				+ "\n    Stock:  " + mostrarStock(stock) + " Unidades"
				+ "\n    Precio: " + mostrarPrecio(precio) + "   Euros" 
				+ "\n    Recaudacion: " + recaudacion+ " Euros " 
				+ "\n------------------------------------------------------------------\n"
				+ "\n------------------------------------------------------------------\n" ;
	}

	/**
	 * Método que introduce dinero (credito) en la máquina expendedora
	 * @param importe
	 */
	public void introducirDinero(double importe) {
		credito += importe;
	}
	
	/**
	 * El método devolverá al cliente el crédito, importe 
	 * introducido en el método introducirDinero(double importe
	 * @return devolucion
	 */
	public double solicitarDevolucion() {
		double devolucion = credito;
		credito = 0;
		return devolucion;
	}

	/**
	 * Método que devuelve la compra del producto seleccionado
	 * reduciendo el stock de ese producto
	 * aumentando la recaudación con el precio del producto seleccionado
	 * y devolviendo la devolucion de dinero
	 * @param seleccion
	 * @return devolucion
	 * @throws NoHayCambioException  --> no hay cambio
	 * @throws NoHayProductoException --> no hay stock
	 * @throws CreditoInsuficienteException --> credito insuficiente
	 */
	public double comprarProducto(int seleccion)
			throws NoHayCambioException, NoHayProductoException, CreditoInsuficienteException {
		if ((credito - precio[seleccion] > cambio))
			throw new NoHayCambioException();
		else {
			if (stock[seleccion] == 0)
				throw new NoHayProductoException();
			else {
				if (credito < precio[seleccion])
					throw new CreditoInsuficienteException();
				else {
					recaudacion += precio[seleccion];
					double devolucion = credito - precio[seleccion];
					credito = 0;
					stock[seleccion]--;
					cambio -= devolucion;
					devolucion = redondear(devolucion);
					return devolucion;
				}
			}
		}
	}

	/**
	 * Método que convierte el array stock a un String
	 * No mostrará por pantalla la posición 0 del array
	 * @param stock
	 * @return mostrar
	 */
	public String mostrarStock(int stock[]) {
		String mostrar = "";
		for (int i = 1; i < stock.length; i++) {
			mostrar += stock[i] + "      ";
		}
		return mostrar;
	}

	/**
	 * Método que convierte el array precio a un String
	 * No mostrará por pantalla la posición 0 del array
	 * @param precio
	 * @return mostrar
	 */
	public String mostrarPrecio(double precio[]) {
		String mostrar = "";
		for (int i = 1; i < precio.length; i++) {
			mostrar += precio[i] + "    ";
		}
		return mostrar;
	}

	/**
	 * Método que devuelve un numero double 
	 * y lo redondea a 2 decimales
	 * @param numero
	 * @return numero
	 */
	public double redondear(double numero) {
		numero = Math.round(numero * 100) / 100.00;
		return numero;
	}
}