package _03ejercicios._02gestionhospital;

public class Hospital {
	public final static int MAXC = 10;
	private Paciente listaCamas[];
	private int numLibres;

	public Hospital() {
		listaCamas = new Paciente[MAXC + 1];
		numLibres = MAXC;
	}

	public int getNumLibres() {
		return numLibres;
	}

	public boolean hayLibres() {
		return numLibres > 0;
	}

	public int primeraLibre() {
		boolean enc = false;
		int i = 1;
		while (i < listaCamas.length && !enc) {
			if (listaCamas[i] == null)
				enc = true;
			else
				i++;

		}
		if (enc)
			return i;
		else
			return 0;
	}

	public int primeraLibre2() {
		if (hayLibres()) {
			// Busqueda con centinela
			int i = 1;
			while (listaCamas[i] != null) {
				i++;
			}
			return i;

		} else
			return 0;
	}

	public void ingresarPaciente(String n, int e) throws HospitalLlenoException {
		int pos = primeraLibre();
		if (pos == 0)
			throw new HospitalLlenoException("El hospital esta lleno");
		else {
			listaCamas[pos] = new Paciente(n, e);
			numLibres--;
		}

	}

	public void ingresarPaciente2(String n, int e) throws HospitalLlenoException {

		if (!hayLibres())
			throw new HospitalLlenoException("El hospital esta lleno");
		else {
			listaCamas[primeraLibre()] = new Paciente(n, e);
			numLibres--;
		}

	}

	public void darAltaPaciente(int i) {
		listaCamas[i] = null;
		numLibres++;
	}

	public void darAltaPaciente(Paciente p) {
		// Buscamos al paciente que hay que dar de alta
		boolean enc = false;
		int i = 1;
		while (i < listaCamas.length && !enc) {
			if (listaCamas[i] != null && listaCamas[i].equals(p)) {
				enc = true;

			} else
				i++;
		}
		if (enc) {
			listaCamas[i] = null;
			numLibres++;
		}

	}

	public void darAltas() {
		for (int i = 1; i < listaCamas.length; i++) {
			if (listaCamas[i] != null) {
				listaCamas[i].mejorar();
				if (listaCamas[i].getEstado() == 6) {
					// Paciente curado
					darAltaPaciente(i);
				}
			}

		}
	}

	@Override
	public String toString() {
		String res = "";
		for (int i = 1; i < listaCamas.length; i++) {
			if (listaCamas[i] != null) {
				res += i + listaCamas[i].toString() + "\n";
			} else {
				res += i + " libre\n";
			}

		}
		return res;
	}
}
