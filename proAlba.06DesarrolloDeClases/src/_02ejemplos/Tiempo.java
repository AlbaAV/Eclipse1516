package _02ejemplos;

import java.util.Calendar;

public class Tiempo {
	//Atributos
	private int hora;
	private int minuto;
	private int segundo;
	
	//Métodos
	
	//Constructores
	
	public Tiempo(int hora, int minuto, int segundo){
		this.setHora(hora);
		this.setMinuto(minuto);
		this.setSegundo(segundo);
	}
	
	public Tiempo(){
		this(0,0,0);
	}
	//Getter
	public int getHora(){
		return hora;
	}
	public int getMinuto(){
		return minuto;
	}
	public int getSegundo(){
		return segundo;
	}
	
	//Setter
	public void setHora(int hora){
		//this es necesario
		if (hora < 0) this.hora = 0;
		else if (hora > 23) this.hora = 23;
		else this.hora = hora;
	}
	public void setMinuto(int minuto){
		this.minuto = minuto;
	}
	public void setSegundo(int segundo){
		this.segundo = segundo;
	}
	
	@Override
	public String toString(){
		return hora + ":" + minuto + ":" + segundo;
	}
	
	@Override
	public boolean equals(Object o){
		
		if(this == o) return true;
		if(! (o instanceof Tiempo)) return false;
		
		Tiempo t = (Tiempo) o;
		if(this.hora == t.hora && this.minuto == t.minuto && this.segundo == t.segundo)
			return true;
		else
			return false;
	}
	
	public int compareTo(Object o){
		Tiempo t = (Tiempo) o;
		
		if(this.hora < t.hora) return -1;
		else if(this.hora > t.hora) return 1;
		else if(this.minuto < t.minuto) return -1;
		else if(this.minuto > t.minuto) return 1;
		
		// else return this.segundo - t.segundo;
		
		else if(this.segundo <t.segundo) return -1;
		else if(this.segundo > t.segundo) return -1;
		else return 0;
	}
	
	public static Tiempo getHoraActual(){
		int h = Calendar.getInstance().get(Calendar.HOUR);
		int m = Calendar.getInstance().get(Calendar.MINUTE);
		int s = Calendar.getInstance().get(Calendar.SECOND);
		Tiempo actual = new Tiempo(h,m,s);
		return actual;
	}
	
	public static int diferencia(Tiempo t1, Tiempo t2){
		int segundos1 = t1.hora * 60 * 60 + t1.minuto * 60 + t1.segundo;
		int segundos2= t2.hora * 60 * 60 + t2.minuto * 60 + t2.segundo;
		return segundos2 - segundos1;
	}
	
	public int diferencia(Tiempo t){
		int segundos1 = this.hora * 60 * 60 + this.minuto * 60 + this.segundo;
		int segundos2= t.hora * 60 * 60 + t.minuto * 60 + t.segundo;
		return segundos2 - segundos1;
	}
}
