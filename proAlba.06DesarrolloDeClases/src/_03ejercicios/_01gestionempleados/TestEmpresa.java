package _03ejercicios._01gestionempleados;

public class TestEmpresa {
	public static void main(String[] args) {
		Empresa e = new Empresa("MatisseDam");
		
		Empleado e1 = new Empleado("Pepe","111111A",2005,1000);
		Empleado e2 = new Empleado("Miguel","22222B",2006,1100);
		Empleado e3 = new Empleado("Ana","33333C",2007,1200);
		
		try{
			e.contratar(e1);
			e.contratar(e2);
			e.contratar(e3);
			e.contratar(new Empleado("Patricia","444444D",2008,1300));
		} catch(PlantillaCompletaException ex){
			System.out.println("No se puede contratar");
			System.out.println(ex.getMessage());
		}
		
				
		e.subirTrienio(10);
		System.out.println(e.toString());
		
		
		try{
			e.despedir(new Empleado(null,"22222B",0,0));
		} catch(ElementoNoEncontrado ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		System.out.println("++++++++++++++");
		
		System.out.println(e.toString());
	}

}