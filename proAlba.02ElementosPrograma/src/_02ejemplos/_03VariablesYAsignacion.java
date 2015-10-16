package _02ejemplos;
/**
 * 
 * @author alumno
 *
 */

public class _03VariablesYAsignacion {
	public static void main(String[] args){
		
		//Declarar una variable y asignarle un valor
		int num1;
		num1 = 5;
		System.out.println(num1);
		
		num1 =7;
		System.out.println(num1);
		
		//Declarar e inicializar una variable
		int num2 = 6;
		System.out.println(num2);
		
		num2 = 8;
		System.out.println(num2);
		
		//No se puede declarar dos veces la misma variable
		//int num1;
		
		
		//Declarar una variable y asignarle una expresion
		int num3;
		num3 = num1 + num2;
		System.out.println(num3);

		/*La variable y el resultado de la expresion tienen que ser compatibles
		num3 = num1 * 0.2;
		Esto es un comentario de varias lineas
		
		*/
	}

}
