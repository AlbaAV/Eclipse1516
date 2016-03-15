package _03ejercicios;

public class _15Notas {
	public static void main(String[] args) {
		double n[][] = { { 6, 9, 8.5, 0 }, 
				{ 7.5, 4.5, 5, 0 }, 
				{ 5, 6, 9.5, 0 },
				{ 4, 4, 4, 4,}};
		String[] as = { "PRO", "ED", "BD", "LMI" };
		String[] al = { "Ana", "Rafa", "Luis", "Victor" };
		notasPorAlumno(n, as, al);
		notasPorAsignatura(n, as, al);
		mediaPorAlumno(n, as, al);
		mediaPorAsignatura(n, as, al);
		asignaturaMasFacil(n, as, al);
		asignaturaMejorMedia(n, as);
		aluTodasSuspendidas(n,as,al);
		asigTodosSuspendidos(n, as);
	}

	public static void notasPorAlumno(double n[][], String as[], String al[]) {

		// Imprimir notas alumno por alumno
		System.out.println("Imprimir notas alumno por alumno");
		for (int i = 0; i < n.length; i++) {
			System.out.println("Notas de " + al[i] + ":");
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(as[i] + " : " + n[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void notasPorAsignatura(double n[][], String as[], String al[]) {
		// asignatura por asignatura
		System.out.println("asignatura por asignatura");
		for (int j = 0; j < n[0].length; j++) {
			System.out.println("Notas de " + as[j] + ":");
			for (int i = 0; i < n.length; i++) {
				System.out.print(al[i] + " :" + n[i][j] + " " + "\n");

			}
		}

	}

	public static void mediaPorAlumno(double n[][], String as[], String al[]) {
		// media por alumno
		System.out.println("Imprimir la media de cada alumno");
		for (int i = 0; i < n.length; i++) {
			System.out.print("Media de " + al[i] + ": ");
			double suma = 0;
			double media = 0;
			for (int j = 0; j < n[i].length; j++) {

				suma += n[i][j];
				media = suma / n[i].length;
			}
			System.out.println(media + " ");
		}
	}

	public static void mediaPorAsignatura(double n[][], String as[], String al[]) {
		// media por asignaturas

		for (int j = 0; j < n[0].length; j++) {
			double media = 0;
			System.out.println("Media de " + as[j] + ": ");
			double suma = 0;
			for (int i = 0; i < n.length; i++) {
				suma += n[i][j];

				media = suma / n.length;
			}
			System.out.println(media);

		}
	}

	// asignatura mas facil
	public static void asignaturaMasFacil(double n[][], String as[], String al[]) {
		double max = 0;
		int posMay = 0;
		int i = 0;
		for (int j = 0; j < n[0].length; j++) {
			double media = 0;

			double suma = 0;
			for (i = 0; i < n.length; i++) {
				suma += n[i][j];

				media = suma / n.length;
				if (media > max)
					max = media;
				posMay = i;
			}

		}
		System.out.println("la media maxima es : " + as[posMay] + " " + max);
	}
	
	//programa javi
	public static void asignaturaMejorMedia(double n[][], String as[]){
		double mejorMedia = -1;
		String mejorAsignatura ="";
		for(int j = 0; j < n[0].length; j++){
			double suma = 0;
			for (int i = 0; i < n.length; i++) {
				suma += n[i][j];
			}
			double media = suma /n.length;
			if(media > mejorMedia){
				mejorMedia = media;
				mejorAsignatura = as[j];
			}
		}
		System.out.println("Asignatura de mejor media: " + mejorAsignatura);
	}
	
	public static void aluTodasSuspendidas(double n[][], String as[], String al[]){
		boolean encSuspendeTodo = false;
		for(int i = 0; i < n.length  && !encSuspendeTodo; i++){
			boolean algoAprobado = false;
			for(int j = 0; j < n[i].length && !algoAprobado; j++){
				if(n[i][j] >= 5){
					algoAprobado = true;		
				}
			}
			if(!algoAprobado){
				encSuspendeTodo = true;
				System.out.println("Alumno que ha suspendido todo: " + al[i]);
			}
		}
	}
	
	public static void asigTodosSuspendidos(double n[][], String as[]){
		boolean encSuspendeTodo = false;
		for(int j = 0; j < n[0].length  && !encSuspendeTodo; j++){
			boolean algoAprobado = false;
			for(int i = 0; i
					< n.length && !algoAprobado; i++){
				if(n[i][j] >= 5){
					algoAprobado = true;		
				}
			}
			if(!algoAprobado){
				encSuspendeTodo = true;
				System.out.println("Deadpool: " + as[j]);
			}
		}
	}
}

