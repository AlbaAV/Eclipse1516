package _03ejercicios;

public class _03Dados {
	public static final int LANZAMIENTOS = 100000;
	public static final int FRECUENCIA = 1000;
	public static void main(String[] args) {
		int[] contador =new int[7];
		for(int i =1; i <= LANZAMIENTOS; i++){
			int dado =(int) (Math.random()*6+1);
			
			contador[dado] ++;
			
			if(i%FRECUENCIA == 0){
				//Mostrar Resultados
				System.out.println("\n\nNUMERO DE LANZAMIENTO: " + i);
				for(int j = 1; j< 7; j++){
					System.out.format("\n%d = %.8f%%  ",j,(contador[j]/(double)i*100));
				}
			}
		}
		
		
	}
}
