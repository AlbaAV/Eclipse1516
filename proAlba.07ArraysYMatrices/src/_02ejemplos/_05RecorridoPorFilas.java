package _02ejemplos;

public class _05RecorridoPorFilas {
	public static void main(String[] args) {
		int m[][] = {{1,2,3,4,5},
				{2,4,6,8,10},
				{4,3,2,1,9}};
		
		for (int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Inverso
		
		for(int i = m.length-1; i >= 0; i--){
			for(int j = m[i].length-1; j >= 0; j--){
				System.out.print(m[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Suma por filas		
		
		for (int i = 0; i < m.length; i++) {
			int suma = 0;
			for(int j = 0; j < m[i].length; j++){		
				System.out.print(m[i][j] +" ");
				suma += m[i][j];
			}
			System.out.print(" = " +suma);
			System.out.println();
		}
		
		System.out.println();
		
		//Media por filas
		
		for (int i = 0; i < m.length; i++) {
			int suma = 0;
			double media = 0;
			for(int j = 0; j < m[i].length; j++){		
				System.out.print(m[i][j] +" ");
				suma += m[i][j];
			}
			media = (double)suma /m[i].length;
			System.out.print(" = " +media);
			System.out.println();
		}
		
		System.out.println();
		
		//Elemento mas grande de cada fila
		
		for (int i = 0; i < m.length; i++) {
			int max = m[i][0];
			for(int j = 0; j < m[i].length; j++){		
				System.out.print(m[i][j] +" ");
				if(m[i][j] > max){
					max = m[i][j];
				}
				
			}
			System.out.print(" = " +max);
			System.out.println();
			max = m[i][0];
		}
		
		System.out.println();
		
		//Elemento mas pequenyo de cada fila	
		
		for (int i = 0; i < m.length; i++) {
			int min = m[i][0];
			for(int j = 0; j < m[i].length; j++){		
				System.out.print(m[i][j] +" ");
				if(m[i][j] < min){
					min= m[i][j];
				}
						
		}
			System.out.print(" = " +min);
			System.out.println();
		}
				
		System.out.println();
		
		//Elemento mas grande de toda la matriz
		int maxM = m[0][0];
		for (int i = 0; i < m.length; i++) {		
			for(int j = 0; j < m[i].length; j++){		
				if(m[i][j] > maxM){
					maxM = m[i][j];
				}				
			}
		}
		
		System.out.println("MAX MATRIZ = " +maxM + "\n");
			
		//Elemento mas pequenyo de toda la matriz
		
		int minM = m[0][0];
		for (int i = 0; i < m.length; i++) {		
			for(int j = 0; j < m[i].length; j++){		
				if(m[i][j] < minM){
					minM = m[i][j];
				}				
			}
		}		
		System.out.println("MIN MATRIZ = " +minM +"\n");		}
}
