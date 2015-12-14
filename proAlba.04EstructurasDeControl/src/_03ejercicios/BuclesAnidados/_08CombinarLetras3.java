package _03ejercicios.BuclesAnidados;

public class _08CombinarLetras3 {
	public static void main(String[] args) {
		for(char i = 'a'; i <='d'; i++){
			for(char j = 'a'; j<='d';j++){	
				for(char k ='a'; k<= 'd';k++){
					System.out.println((char) i +""+ (char)j +""+ (char)k);
				}
			}
		}
	}
}
