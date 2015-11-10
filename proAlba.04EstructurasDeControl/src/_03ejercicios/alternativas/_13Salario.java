package _03ejercicios.alternativas;

import java.util.Scanner;

public class _13Salario {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce las horas semanales: ");
		int horas = tec.nextInt();
		int extra;
		int salario;
		double neto;
		double impuesto;
		if(horas<=40){
			salario = horas*6;
			System.out.println("Salario Bruto: "+ salario);
			impuesto = 0.02;
			neto = salario - (salario*impuesto);
		}else{
			extra = horas - 40;
			horas = 40;
			salario = horas*6;
			salario = salario + (extra*10);
			System.out.println("Salario Bruto: " + salario);
			if(salario <= 350){
				impuesto = 0.02;
				neto = salario - (salario*impuesto);
			}
			else{
				impuesto =0.1;
				neto = salario - (salario*impuesto);
			}
		}
		System.out.println("Salario neto: " + neto);
			
		}
	}

