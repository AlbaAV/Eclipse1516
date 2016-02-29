package fechas;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Practica 3: Fechas
 * 
 * @author ALBA
 */

public class Fechas {

	static Scanner tec = new Scanner(System.in);
	static StringTokenizer romper;

	/*
	 * Método main: Es el encargado de mostrar el menú de opciones entre (0-3)
	 * El programa volverá a mostrar el menú de opciones si el usuario se
	 * equivoca al introducir al introducir un valor distinto entre (0-3) o
	 * letras... El programa terminará cuando el valor del menú sea 0.
	 * 
	 * En el método main se introducirán las fechas (String) y se repetirá el
	 * pedir la fecha si cuando se realizan la roturas del String con el
	 * StringTokenizer los valores no son enteros.
	 * 
	 * Comprobará que los valores anteriores sean válidos; para ello invocará al
	 * método validarFec. Si validarFec es falso el programa volverá a pedir el
	 * String fecha, Repetirá este proceso hasta que la fecha introducida sea
	 * válida
	 * 
	 */

	public static void main(String[] args) {

		boolean continuar = true;
		String fecha1 = "", fecha2 = "";
		int dia1 = 0, dia2 = 0, mes1 = 0, mes2 = 0, anyo1 = 0, anyo2 = 0;
		boolean fecVal1 = true, fecVal2 = true;
		/*
		 * En este bucle mostrará el menú hasta que la opcion sea 0 Comprobará
		 * que si introduce letras vuelva a pedir la opcion si la opcion no está
		 * entre 0 y 3 volverá a pedir la opción
		 */

		do {
			try {
				menuString();
				int opcion = tec.nextInt();
				switch (opcion) {

				/*
				 * El caso 1 corresponde a la opción 1 del menú: VALIDAR FECHA
				 * Comprobará si la fecha introducida es válida a partir del
				 * método validarFec(int dia, int mes,int anyo).
				 * 
				 * Si es válida mostrará por pantalla:
				 * "dia de nombreMes(int mes) de anyo . Fecha Correcta" Si no
				 * mostrará por pantalla:
				 * "DIA: dia MES: mes ANYO: anyo . Fecha Incorrecta"
				 * 
				 * Repetirá el bucle hasta que la fecha sea válida.
				 */

				case 1:
					System.out.println("1.- VALIDAR FECHA");
					System.out.println();
					do {
						try {
							System.out.println("Introduce una fecha (dd/mm/aaaa): ");
							fecha1 = tec.next();
							romper = new StringTokenizer(fecha1, "/");
							dia1 = Integer.parseInt(romper.nextToken());
							mes1 = Integer.parseInt(romper.nextToken());
							anyo1 = Integer.parseInt(romper.nextToken());
							fecVal1 = validarFec(dia1, mes1, anyo1);

							if (fecVal1 == false) {
								System.out.println();
								System.out.println(
										"Dia: " + dia1 + " Mes: " + mes1 + " Anyo: " + anyo1 + " .Fecha Incorrecta");
								System.out.println();
							}else {
								System.out.println();
								System.out
										.println(dia1 + " de " + nombreMes(mes1) + " de " + anyo1 + " .Fecha Correcta");
								System.out.println();
							}
						} catch (NumberFormatException ex) {
							System.out.println("Has introducido la fecha de manera incorrecta: ");
							fecVal1 = false;
						} catch (NoSuchElementException ex) {
							System.out.println("Has introducido la fecha de manera incorrecta: ");
							fecVal1 = false;
						}
					} while (!fecVal1);
					continuar = true;
					break;

				/*
				 * El caso 2 corresponde a la opción 2 del menú: DIFERENCIA DE
				 * FECHAS Comprobará si la fecha1 es válida; hasta que no sea
				 * válida no pedirá la fecha2 Hasta que la fecha2 no sea válida
				 * no realizará la diferencia.
				 * 
				 * Realiza la diferencia llamando al método
				 * diferenciaDias(dia1,mes1,anyo1,dia2,mes2,anyo2) Muestra la
				 * diferencia de dias entre las dos fechas
				 */

				case 2:
					fecVal1 = true;
					System.out.println("2.- DIFERENCIA DE FECHAS");
					System.out.println();

					do {
						try {
							System.out.println("Introduce la fecha 1 (dd/mm/aaaa): ");
							fecha1 = tec.next();
							romper = new StringTokenizer(fecha1, "/");
							dia1 = Integer.parseInt(romper.nextToken());
							mes1 = Integer.parseInt(romper.nextToken());
							anyo1 = Integer.parseInt(romper.nextToken());
							fecVal1 = validarFec(dia1, mes1, anyo1);

						} catch (NumberFormatException ex) {
							tec.nextLine();
							System.out.println("Has introducido la fecha 1 de manera incorrecta: ");
							fecVal1 = false;
						} catch (NoSuchElementException ex) {
							tec.nextLine();
							System.out.println("Has introducido la fecha 1 de manera incorrecta: ");
							fecVal1 = false;
						}
					} while (!fecVal1);
					System.out.println();
					do {
						try {
							System.out.println("Introduce la fecha 2 (dd/mm/aaaa): ");
							fecha2 = tec.next();
							romper = new StringTokenizer(fecha2, "/");
							dia2 = Integer.parseInt(romper.nextToken());
							mes2 = Integer.parseInt(romper.nextToken());
							anyo2 = Integer.parseInt(romper.nextToken());
							fecVal2 = validarFec(dia2, mes2, anyo2);

						} catch (NumberFormatException ex) {
							tec.nextLine();
							System.out.println("Has introducido la fecha 2 de manera incorrecta: ");
							fecVal2 = false;
						} catch (NoSuchElementException ex) {
							tec.nextLine();
							System.out.println("Has introducido la fecha 2 de manera incorrecta: ");
							fecVal2 = false;
						}
					} while (!fecVal2);

					System.out.println();
					System.out.println("	" + fecha1 + "\n - " + "	" + fecha2 + "\n ---------------------"
							+ "\n	" + diferenciaDias(dia1, mes1, anyo1, dia2, mes2, anyo2) + " dias");
					System.out.println();
					continuar = true;
					break;

				/*
				 * El caso 3 corresponde a la opción 3 del menú: SUMAR DIAS
				 * 
				 * Comprobará si la fecha introducida es válida a partir del
				 * método validarFec(int dia, int mes,int anyo). Repetirá el
				 * bucle hasta que la fecha sea válida.
				 * 
				 * Cuando la fecha es válida pedirá el número de días a sumar
				 * Volverá a pedir el número de días a sumar si no introduce un
				 * entero o si el entero no es positivo.
				 */

				case 3:
					boolean falloDias = true;
					fecVal1 = true;
					System.out.println("3.- SUMA DE FECHAS");
					System.out.println();
					do {
						try {
							System.out.println("Introduce una fecha (dd/mm/aaaa): ");
							fecha1 = tec.next();
							romper = new StringTokenizer(fecha1, "/");
							dia1 = Integer.parseInt(romper.nextToken());
							mes1 = Integer.parseInt(romper.nextToken());
							anyo1 = Integer.parseInt(romper.nextToken());
							fecVal1 = validarFec(dia1, mes1, anyo1);
						} catch (NumberFormatException ex) {
							System.out.println("Has introducido la fecha de manera incorrecta: ");
							fecVal1 = false;
						} catch (NoSuchElementException ex) {
							System.out.println("Has introducido la fecha de manera incorrecta: ");
						}
					} while (!fecVal1);

					do {
						try {
							System.out.println("Introduce el numero de dias a sumar: ");
							int diasSuma = tec.nextInt();
							if (diasSuma >= 0) {
								falloDias = false;
								System.out.println("	" + fecha1 + "\n + " + "	" + diasSuma + " dias"
										+ "\n ---------------------" + "\n	" + sumaDias(dia1, mes1, anyo1, diasSuma));
								System.out.println();
							} else
								System.out.println("El numero de dias a sumar tiene que ser positivo");
						} catch (NumberFormatException ex) {
							System.out.println("El numero de dias tiene que ser un entero: ");
						} catch (InputMismatchException ex) {
							tec.nextLine();
							System.out.println("El numero de dias tiene que ser un entero: ");
						}
					} while (falloDias);

					continuar = true;
					break;

				/*
				 * Caso 0: se muuestra salir Termina el programa
				 */
				case 0:
					System.out.println("0.- SALIR");
					continuar = false;
					break;
				/*
				 * Defecto: El usuario introduce un entero distinto de entre 0 y
				 * 3 vuelve a salir el menu de opciones.
				 */

				default:
					System.out.println(" Introduce una opcion correcta entre 0 y 3");
					System.out.println();
					continuar = true;
					break;
				}

				// Se captura la excepción si la opción del menú no es un entero
			} catch (InputMismatchException e) {
				tec.nextLine(); // vacío buffer de teclado
				System.out.println("Introduce un opcion entre 0 y 3");
				System.out.println();
			}

		} while (continuar);
	}

	/*
	 * Método menuString() es un método void que no realiza ninguna operacion ni
	 * se le pasa ningun parámetro simplemente muestra el menu de opciones por
	 * pantalla
	 */

	public static void menuString() {
		System.out.println("-----------MENU-----------------" + "\n1.- VALIDAR UNA FECHA"
				+ "\n2.- DIFERENCIAS ENTRE DOS FECHAS" + "\n3.- SUMAR DIAS" + "\n0.- SALIR"
				+ "\n----------------------------------" + "\nIndique la acción a realizar: ");
	}

	/**
	 * Método esBisiesto: Método boolean que devuelve true o false si el anyo es
	 * bisiesto o no
	 * 
	 * @param anyo;
	 *            anyo de la fecha a comprobar si es bisiesto
	 * @return bisiesto; True/False
	 */

	public static boolean esBisiesto(int anyo) {
		boolean bisiesto;
		if (anyo % 4 == 0) {
			if (anyo % 100 == 0 && anyo % 400 == 0)
				bisiesto = true;
			else if (anyo % 100 == 0)
				bisiesto = false;
			else
				bisiesto = true;
		} else
			bisiesto = false;

		return bisiesto;
	}

	/**
	 * Metodo numDiasMes Devuelve un entero; que será el número de dias que hay
	 * en cada mes respectivamente
	 * 
	 * @param mes;
	 *            mes de la fecha
	 * @param anyo;
	 *            anyo de la fecha para comprobar si es Bisiesto Si el anyo es
	 *            bisiesto febrero tendrá 29 dias
	 * @return
	 */

	public static int numDiasMes(int mes, int anyo) {
		int nDiasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			nDiasMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			nDiasMes = 30;
			break;
		case 2:
			if (esBisiesto(anyo) == false)
				nDiasMes = 28;
			else
				nDiasMes = 29;
			break;
		}
		return nDiasMes;
	}

	/**
	 * Método validarFec: Devuelve un boolean true Si el dia esta entre 1 y el
	 * numero maximo de dias numDiasMes(int mes, int anyo) Si el mes esta entre
	 * 1 y 12 Si el anyo es >= 0 Devuelve false en caso contrario
	 * 
	 * @param dia
	 * @param mes
	 * @param anyo
	 * @return
	 */

	public static boolean validarFec(int dia, int mes, int anyo) {
		boolean validar;
		boolean diaV = dia > 0 && dia <= numDiasMes(mes, anyo);
		boolean mesV = mes > 0 && mes <= 12;
		boolean anyoV = anyo >= 0;
		if (diaV && mesV && anyoV)
			validar = true;
		else
			validar = false;
		return validar;
	}

	/**
	 * Metodo nomreMes Devuelve un String con el nombre correspondiente a cada
	 * numero de mes
	 * 
	 * @param mes
	 * @return nom
	 */

	public static String nombreMes(int mes) {
		String nom = "";
		if (mes == 1)
			nom = " enero ";
		else if (mes == 2)
			nom = " febrero ";
		else if (mes == 3)
			nom = " marzo ";
		else if (mes == 4)
			nom = " abril ";
		else if (mes == 5)
			nom = " mayo ";
		else if (mes == 6)
			nom = " junio ";
		else if (mes == 7)
			nom = " julio ";
		else if (mes == 8)
			nom = " agosto ";
		else if (mes == 9)
			nom = " septiembre ";
		else if (mes == 10)
			nom = " octubre ";
		else if (mes == 11)
			nom = " noviembre ";
		else
			nom = " diciembre ";

		return nom;
	}

	/**
	 * Metodo numAnyBisiesto A partir de
	 * 
	 * @param anyo1
	 *            anyos calcula el numero de anyos bisiestos que hay entre ambos
	 * @param anyo2
	 * @return
	 */
	public static int numAnyBisiesto(int anyo1, int anyo2) {
		int cont = 0;
		int dif;

		// comprueba si el anyo1 es mayor que el anyo2

		if (anyo1 > anyo2) {

			// Cambia el orden de los anyos, se invierten
			int aux = anyo1;
			anyo1 = anyo2;
			anyo2 = aux;
		}

		// Calcula la diferencia entre dos anyos

		dif = (anyo2 - 1) - anyo1;
		
		do {
			if(dif == 0){
				cont = 0;
				anyo1 += 4;
			}
			else if (dif < 4) {
				if (esBisiesto(anyo1) || esBisiesto(anyo2)) {
					cont++;
					anyo1 += 4;
				} else
					anyo1++;
			} else if (dif == 4) {
				if (esBisiesto(anyo1) && esBisiesto(anyo2)) {
					cont = 2;
					anyo1 += 4;
				} else if (esBisiesto(anyo1)) {
					cont++;
					anyo1 += 4;
				} else
					anyo1++;
			} else {
				if (esBisiesto(anyo1) && esBisiesto(anyo2)) {
					cont++;
					int div = dif / 4;
					cont += div;
					anyo1 = anyo2;
					anyo1++;
				} else if (esBisiesto(anyo1)) {
					cont++;
					anyo1 += 4;
				} else if (esBisiesto(anyo2)) {
					cont++;
					anyo2 -= 4;
				} else
					anyo1++;
			}
		} while (anyo1 <= anyo2);
		return cont;
	}

	/**
	 * Método diferenciaDias: El metodo devuelve el número de dias que hay entre
	 * dos fechas
	 * 
	 * @param dia1
	 * @param mes1
	 * @param anyo1
	 * @param dia2
	 * @param mes2
	 * @param anyo2
	 * @return
	 */

	public static int diferenciaDias(int dia1, int mes1, int anyo1, int dia2, int mes2, int anyo2) {
		int difA = anyo2 - anyo1;

		int numBis = numAnyBisiesto(anyo1, anyo2);
		int diasEn1 = 0;
		int diasEn2 = 0;
		int total = 0;

		if (difA == 0) {
			numBis = 0;
		}

		if (anyo1 > anyo2) {
			numBis = -numBis;
		}

		for (int i = 1; i < mes1; i++) {

			diasEn1 += numDiasMes(i, anyo1);
		}
		diasEn1 += dia1;

		for (int j = 1; j < mes2; j++) {
			diasEn2 += numDiasMes(j, anyo2);
		}
		diasEn2 += dia2;

		if (dia1 == dia2 && mes1 == mes2) {
			total = 365 * difA + (1 * numBis);
		} else {
			total = 365 * difA + (1 * numBis) - diasEn1 + diasEn2;
		}
		return total;
	}

	/**
	 * Método que devuelve un String con la fecha resultante, de sumar una
	 * cantidad de dias a una fecha inicial
	 * 
	 * @param dia
	 *            ; dia de la fecha inicial
	 * @param mes
	 *            ; mes de la fecha inicial
	 * @param anyo
	 *            ; anyo de la fecha inicial
	 * @param suma;
	 *            cantidad de dias a sumar a la fecha inicial
	 * @return fecF ; devuelve un Strin con la fecha final
	 */

	public static String sumaDias(int dia, int mes, int anyo, int suma) {
		String fecF = "";
		for (int i = 0; i < suma; i++) {
			dia++;
			if (dia > numDiasMes(mes, anyo)) {
				dia = 1;
				mes++;
			}

			if (mes > 12) {
				mes = 1;
				anyo++;
			}
		}

		// La practica no especíca el formato de la fecha al realizar la suma
		// El String fecF devuelve la fecha en formato "dd/mm/aaaa" y en formato
		// "dia de nombre(mes) de anyo"

		fecF += dia + "/" + mes + "/" + anyo + "	 O  " + dia + " de " + nombreMes(mes) + " de " + anyo;
		return fecF;
	}

}