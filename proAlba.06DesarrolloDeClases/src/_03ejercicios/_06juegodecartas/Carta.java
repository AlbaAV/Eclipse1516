package _03ejercicios._06juegodecartas;


public class Carta {
	//public final static int OROS = 0, COPAS = 1, ESPADAS = 2, BASTOS = 3;
	public final static int OROS = 0;
	public final static int COPAS = 1;
	public final static int ESPADAS = 2;
	public final static int BASTOS = 3;
	
	private int palo;
	private int valor;
	private static int siguientePalo;
	
	/*
	 * Crear un contructor con parametros asignados.
	 */
	
	public Carta(int palo, int valor)throws IllegalArgumentException{
		if(palo < 0 || palo > 3)
			throw new IllegalArgumentException("Palo incorrecto");
		if(valor < 1 || valor < 12)
			throw new IllegalArgumentException("Valor incorrecto");
		
		this.palo = palo;
		this.valor = valor;
	}
	
	/*
	 * Crear un constructor vacío; 
	 * no se le pasan parametros
	 * parametros generados aleatoriamente
	 */
	
	public Carta(){
		this.palo = (int) (Math.random()*4);
		this.valor = (int) ((Math.random()*12) +1);
	}
	
	//GETTERS
	public int getPalo(){
		return palo;
	}
	public int getValor(){
		return valor;
	}
	
	//SETTERS
	public void setPalo(int palo){
		this.palo = palo;
	}
	public void setValor(int valor){
		this.valor = valor;
	}
	
	public int compareTo(Object o){
		Carta c = (Carta) o;
		if(this.palo < c.palo) return -1;
		else if(this.palo < c.palo) return 1;
		else if(this.valor < c.valor) return -1;
		else if(this.valor > c.valor) return 1;
		else return 0;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Carta)) return false;
		Carta c = (Carta) o;
		if((this.palo == c.palo) && (this.valor == c.valor))return true;
		else return false;
		
		// return ((this.palo == c.palo) && (this.valor == c.valor));
	}
	
	public Carta sigPalo(){
		Carta c;
		if(this.palo == BASTOS){
			c = new Carta(OROS, this.valor);
		}else
			c = new Carta(this.palo +1, this.valor);
		return c;
	}
	
	@Override
	public String toString(){
		String mostrar = valor + " de ";
		if(palo == 0) mostrar += "OROS";
		else if(palo == 1) mostrar += "COPAS";
		else if(palo == 2) mostrar += "ESPADAS";
		else mostrar += "BASTOS";
		
		return mostrar;
	}
	
	/*
	 * public String toString(){
	 * String result = this.valor + " de "
	 * switch(this.palo){
	 * case OROS:
	 * 		result += "OROS";
	 * 		break;
	 * case COPAS:
	 * 		result += "COPAS";
	 * 		break;
	 * case ESPADAS:
	 * 		result += "ESPADAS";
	 * 		break;
	 * case BASTOS:
	 * 		result += "BASTOS";
	 * 		break; 	 
	 * return result;
	 */
	
	public static int ganadora(Carta c1, Carta c2, int triunfo){
		if(c1.compareTo(c2) == 0) return 0;
		else if(c1.palo == c2.palo){
			if(c1.valor == 1) return -1;
			else if(c2.valor == 1) return 1;
			else if(c1.valor > c2.valor) return -1;
			else return 1;		
		}else{
			if(c1.palo == triunfo) return -1;
			else if(c2.palo == triunfo) return 1;
			else return -1;
		}
	}
}
