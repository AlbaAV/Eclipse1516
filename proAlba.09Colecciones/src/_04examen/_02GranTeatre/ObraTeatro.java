package _04examen._02GranTeatre;

public class ObraTeatro extends Evento{
	private String director;
	private String interpretes;
	
	public ObraTeatro(String t, String f, String h, double p, String d, String i)
	{
		super(t,f,h,p);
		director = d;
		interpretes = i;
	}
	
	@Override
	public String toString()
	{
		return "OBRA DE TEATRO \nDirector: " + director + 
				"\nInterpretes: " + interpretes + 
				super.toString();
	}
}
