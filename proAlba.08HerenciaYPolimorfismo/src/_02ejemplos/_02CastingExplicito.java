package _02ejemplos;

public class _02CastingExplicito {
	//Implicito
	Cirujano c1 = new Cirujano(false);
	Medico m1 = c1;
	
//	//Explicito: Da error de ejecución
//	Medico m2 = new Medico();
//	Cirujano c2 = (Cirujano) m2;

	//Explicito
	Medico m3 = new Cirujano(true);
	Cirujano c3 = (Cirujano) m3;
}
