package _04examen._03AlumnosDuplicados;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class QuitarDuplicados {
	public static void main(String[] args) {
		List<Alumno> l = new LinkedList<>();
		try(DataInputStream fe = new DataInputStream(new FileInputStream("alumnos.dat"))){
			while(true){
				int e = fe.readInt();
				String n = fe.readUTF();
				String g = fe.readUTF();
				Alumno a = new Alumno(e,n,g);
				if(!l.contains(a)){
					l.add(0, a);
				}
			}
		}catch(EOFException e){
			
		}catch(FileNotFoundException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try(FileWriter f = new FileWriter("alumnos.txt")){
//			for(Alumno a: l){
//				f.write(a.getNumExpediente());f.write(System.lineSeparator());
//				f.write(a.getNombre());f.write(System.lineSeparator());
//				f.write(a.getGrupo());f.write(System.lineSeparator());
//			}
//		}catch(IOException e){
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("alumnos.txt"))){
			for(Alumno a: l){
				bw.write(""+a.getNumExpediente());bw.newLine();
				bw.write(a.getNombre());bw.newLine();
				bw.write(a.getGrupo());bw.newLine();
			}
		}catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
