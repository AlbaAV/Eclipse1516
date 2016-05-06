package _03ejercicios._05ListaEspera;

public class Paciente implements Comparable<Paciente>{
	private String dni;
	private String nombre;
	private int edad;
	private int estado;
	
	public Paciente(String d,String n, int e){
		dni = d;
		nombre = n;
		edad = e;
		this.estado = (int) ((Math.random()*5)+1);
	}
	public String getDni(){
		return dni;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public int getEstado(){
		return estado;
	}
	
	public void mejorar(){
		if(estado <6)estado++;
	}
	
	public void empeorar(){
		if(estado > 1) estado--;
	}
	
	public String toString(){
		String res = "";
		res += dni + "		 " + nombre +"		 " + edad + "	 " + estado;
		return res;
		
	}
	
	@Override
	public int compareTo(Paciente p){
		if(this.estado < p.estado ) return -1;
		else if(this.estado > p.estado) return 1;
		else return 0;
	}
	
	public boolean equals(Paciente p){
		if(p == this)return true;
		else {
			if(p.nombre.equals(p.nombre)) return true;
			else return false;
		}
	}
}
