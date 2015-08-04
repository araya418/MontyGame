
public class Monty2 extends Monty{

	private int [] jane;
	public Monty2()
	{
		jane2();
		betty2();
		frank2();
		fred2();
	}
	public void jane2()
	{
		
		for(int i = 0; i < 1000; i++)
		{
			jane();
		}
		System.out.println("Jane wins: " + jwins);
	}
	
	public void betty2()
	{
		
		for(int i = 0; i < 1000; i++)
		{
			betty();
		}
		System.out.println("Betty wins: " + bwins);
	}
	
	public void frank2()
	{
		for(int i = 0; i < 1000; i++)
		{
			frank();
		}
		System.out.println("Frank wins: " + fwins);
	}
	
	public void fred2()
	{
		for(int i = 0; i < 1000; i++)
		{
			fred();
		}
		System.out.println("Fred wins: " + frwins);
	}
	public static void main(String [] args)
	{
		Monty2 mon = new Monty2();
	}
}
