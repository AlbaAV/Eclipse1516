package _02ejemplos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _04LeerTexto {
	public static void main(String[] args) {
		FileReader f = null;
		
		try{
			f = new FileReader("minombre.txt");
			
//			try {
//				while((num = f.read()) != -1){
//					System.out.println((char)num);
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
			try {
				while(f.ready()){
					int num;
					try {
						num = f.read();
						System.out.println((char)num);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch(FileNotFoundException e){
			System.out.println("Problema al abrir el fichero");
		}
	}
}
