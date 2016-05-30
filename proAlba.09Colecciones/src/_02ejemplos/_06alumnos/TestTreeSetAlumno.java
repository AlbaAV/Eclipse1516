package _02ejemplos._06alumnos;

import java.util.TreeSet;

public class TestTreeSetAlumno {
	public static void main(String[] args) {
		Alumno a1 = new Alumno(1,"pepe");
		Alumno a2 = new Alumno(2,"ana");
		Alumno a3 = new Alumno(3,"rosa");
		Alumno a4 = new Alumno(4,"pablo");
		
		TreeSet<Alumno> ts = new TreeSet<>();
		ts.add(a1);
		ts.add(a2);
		ts.add(a3);
		ts.add(a4);
		System.out.println(ts);
	}
}
