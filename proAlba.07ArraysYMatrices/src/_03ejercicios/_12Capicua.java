package _03ejercicios;

public class _12Capicua {
	public static void main(String[] args) {
		String[] capi ={"uno","dos","tres","dos","uno"};
		System.out.println(Capicua(capi) ? "Es capicua" : "No es capicua");
	}
	
	public static boolean Capicua(String v[]){
		int j = v.length-1;
		boolean esCapi = true;
		for(int i = 0; i<v.length/2 && esCapi; i++){
			if(v[i].equals(v[j]) != true){
				esCapi = false;
			}
			j++;
		}
		
		return esCapi;
	}
	
}
