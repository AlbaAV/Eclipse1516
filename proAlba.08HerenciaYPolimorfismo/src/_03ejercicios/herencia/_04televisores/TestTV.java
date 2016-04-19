package _03ejercicios.herencia._04televisores;

public class TestTV 
{

	public static void main(String[] args) 
	{
		TVTubo tt1 = new TVTubo("Sony", "XD", 1283.85, 60, 1000);
		TVLCD tt2 = new TVLCD("Samsung", "LOL", 2200.99, 84.5, 1920, 1080);
		Televisor t = new TVTubo("Phillips", "DAM", 500.50, 40, 700);
		
		System.out.println(tt1);
		System.out.println();
		System.out.println(tt2);
		System.out.println();
		System.out.println(t);
		System.out.println();
		t = new TVLCD("DeLosChinos", "LaBarata", 20, 3, 1, 1);
		System.out.println(t);
	}

}
