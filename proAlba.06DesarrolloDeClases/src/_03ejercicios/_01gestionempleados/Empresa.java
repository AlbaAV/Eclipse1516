package _03ejercicios._01gestionempleados;

public class Empresa {
	public static final int MAXEMPLEADOS = 100;
	private String nombre;
	private Empleado plantilla[];
	private int numEmpleados;
	
	public Empresa (String nombre){
		this.nombre = nombre;
		this.plantilla = new Empleado[MAXEMPLEADOS];
		this.numEmpleados = 0;
	}
	
	public void contratar(Empleado e) throws PlantillaCompletaException{
		//Comprobamos si la plantilla está llena
//		if(numEmpleados == MAXEMPLEADOS)
		if(numEmpleados == plantilla.length){
			throw new PlantillaCompletaException("La plantilla de la empresa está completa");
		}
		
		plantilla[numEmpleados] = e;
		numEmpleados++;
		
		//o bien ...
		//plantilla[numEmpleados++] = e;
	}
	
	public void despedir (Empleado e) throws ElementoNoEncontrado{
		//Buscar el empleado a despedir
		boolean enc = false;
		int pos=0;
		for(int i = 0; i< numEmpleados && !enc; i++){
			if(plantilla[i].equals(e)){
				enc = true;
				pos = i;
			}
		}
		if(enc){
			//Eliminamos el empleado de la posición pos
			for(int i = pos; i<numEmpleados-1; i++){
				plantilla[i] = plantilla[i+1];
			}
			plantilla[numEmpleados-1] = null;
			numEmpleados--;
		} else throw new ElementoNoEncontrado("El empleado no existe");
	}
	
	
	public void subirTrienio (double porcentaje){
		for (int i = 0; i < numEmpleados; i++) {
			if(plantilla[i].antiguedad() % 3 == 0) {
				plantilla[i].incrementarSueldo(porcentaje);
			}
		}
	}
	
	@Override 
	public String toString(){
		String result = "Nombre: " + nombre +
				"\nEmpleados:";
		for (int i = 0; i < numEmpleados; i++) {
			result += "\n-----------\n" + plantilla[i].toString();
		}
		return result;
			
	}
}