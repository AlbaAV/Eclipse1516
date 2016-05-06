package _02ejemplos._06alumnos;

import java.util.HashSet;

public class TestHashSetAlumno {
	public static void main(String[] args) {
		Alumno a1 = new Alumno(1,"pepe");
		Alumno a2 = new Alumno(2,"ana");
		Alumno a3 = new Alumno(3,"rosa");
		Alumno a4 = new Alumno(4,"pablo");
		
		HashSet<Alumno> hs = new HashSet<>();
		hs.add(a1);
		hs.add(a2);
		hs.add(a3);
		hs.add(a4);
		System.out.println(hs);
		hs.add(new Alumno(2,"Ana"));
		System.out.println(hs);
	}
}
