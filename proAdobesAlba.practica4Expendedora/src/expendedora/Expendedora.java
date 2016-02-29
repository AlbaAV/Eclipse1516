package expendedora;

import excepciones.CreditoInsuficienteException;
import excepciones.NoHayCambioException;
import excepciones.NoHayProductoException;

/**
 * @author ALBA
 *
 */

public class Expendedora {

	// ATRIBUTOS
	
	private double credito, cambio, recaudacion;
	private int stock;
	private double precio;
	
	// CONSTRUCTOR
	
	/**
	 * Crea un constructor de tipo objeto; Expendedora
	 * @param cambio
	 * @param stock
	 * @param precio
	 */
	
	public Expendedora (double cambio,int stock, double precio){
		this.cambio = cambio;
		this.stock = stock;
		this.precio = precio;
		credito = 0;
		recaudacion = 0;
	}
	
	// CONSULTORES
	//GETTERS
	
	public double getCredito(){
		return credito;
	}
	
	public double getCambio(){
		return cambio;
	}
	
	public double getRecaudacion(){
		return recaudacion;
	}
	
	public int getStock(){
		return stock;
	}
	
	public double getPrecio(){
		return precio;
	}
	// OTROS
	
	//M�todo toString()
	
	@Override
	public String toString(){
		
		return "\n------------------------------------------------------------------" +
				"\n    Credito: " + credito + " euros" +  
				"\n    Cambio: " + cambio + " euros"  + 
				"\n    Stock:  " + stock + " Unidades" + 
				"\n    Precio: " + precio + "   Euros"+ 
				"\n    Recaudacion: " + recaudacion + " euros "+ 
				"\n------------------------------------------------------------------\n" 
				+"\n------------------------------------------------------------------"
				+"\n";
	}
	
	/**
	 * M�todo que introduce dinero (credito) en la m�quina expendedora
	 * @param importe
	 */
	public void introducirDinero (double importe){
		credito += importe;
		credito = redondear(credito);
	}
	
	/**
	 * El m�todo devolver� al cliente el cr�dito, importe 
	 * introducido en el m�todo introducirDinero(double importe
	 * @return devolucion
	 */
	public double solicitarDevolucion(){
		double devolucion = credito;
		devolucion = redondear(devolucion);
		credito = 0;
		return devolucion;
	}
	
	/**
	 * M�todo que devuelve la compra del producto
	 * reduciendo el stock del producto
	 * aumentando la recaudaci�n con el precio del producto
	 * y devolviendo la devolucion de dinero
	 * @param seleccion
	 * @return devolucion
	 * @throws NoHayCambioException  --> no hay cambio
	 * @throws NoHayProductoException --> no hay stock
	 * @throws CreditoInsuficienteException --> credito insuficiente
	 */
	public double comprarProducto() throws NoHayCambioException, NoHayProductoException, CreditoInsuficienteException{
		if ((credito-precio) > cambio) throw new NoHayCambioException();
		else {
			if (stock == 0) throw new NoHayProductoException();
			else {
				if (credito < precio) throw new CreditoInsuficienteException();
				else {
					recaudacion += precio;
					recaudacion = redondear(recaudacion);
					double devolucion = credito-precio;
					credito = 0;
					stock--;
					cambio -= devolucion;
					cambio = redondear(cambio);
					devolucion = redondear(devolucion);
					return devolucion;
				}
			}
		}
	}

	/**
	 * M�todo que devuelve un numero double 
	 * y lo redondea a 2 decimales
	 * @param numero
	 * @return numero
	 */	
	public double redondear(double numero){
		numero = Math.round(numero*100)/100.0;
		return numero;
	}
}