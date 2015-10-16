package _03ejercicios;

public class _19Trazas {

	public static void main(String[] args) {
		
		//a)
		System.out.println("a");
		int a = 3, b = 2;
		a = b+b;
		System.out.println("a: " +a);
		b = a +a ;
		System.out.println("b: "+ b);
		System.out.println();
		
		//b)
		System.out.println("b");
		a=3;
		b=0;
		b = b -1;
		a =a+b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		//c)
		System.out.println("c");
		a=0;
		b=5;
		b++;
		++b;
		a =b+1;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		//d)
		System.out.println("d");
		a=5;
		b=0;
		b=a++;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		//e)
		System.out.println("e");
		a=5;
		b=0;
		b=++a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		//f)
		System.out.println("f");
		a=2;
		b=3;
		b+= a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		//g
		System.out.println("g");
		a=2;
		b=3;
		b -=a;
		a= -b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		//h
		System.out.println("h");
		a=2;
		b=3;
		b%=a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		//i
		System.out.println("i");
		a=2;
		b=3;
		int c =4;
		a = --b + c++;		
		b +=a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	
		
	}
}
