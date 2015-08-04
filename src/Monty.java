/**
 * 
 * @author Nicolas Araya (received help from Ian Matthews and Katie Esposito)
 * @version 1.22.14
 */
public class Monty {

	public int jwins = 0;
	public int bwins = 0;
	public int fwins = 0;
	public int frwins = 0;
	
	public Monty()
	{
		jane();
		betty();
		frank();
		fred();
	}
	
	/**
	 * 
	 */
	public void jane()
	{
		int prize = (int) (Math.random() * 3 + 1); //picks a random prize door
		System.out.println("The winning curtain is " + prize + ".");
		int choice = 1; // Jane chooses her lucky number 1
		System.out.println("Jane selects curtain " + choice + ".");
		int open;
		//will open a door that is neither Jane's or the winning one
		do 
		{
			open = (int) (Math.random() * 3 + 1);
		}
		while(open == choice || open == prize);
		System.out.println("Monty opens curtain " + open + ".");
		System.out.println("Jane does not switch.");
		//tests to see if Jane won
		if(choice == prize)
		{
			System.out.println("Jane wins.");
			jwins+=1;
		}
		else
		{
			System.out.println("Jane loses.");
		}
		System.out.println();
	}
	
	public void betty()
	{
		int prize = (int) (Math.random() * 3 + 1); //picks a random prize door
		System.out.println("The winning curtain is " + prize + ".");
		int choice = 1; // Betty chooses her lucky number 1
		System.out.println("Betty selects curtain " + choice + ".");
		int open;
		//will open a door that is neither Betty's or the winning one
		do 
		{
			open = (int) (Math.random() * 3 + 1);
		}
		while(open == choice || open == prize);
		System.out.println("Monty opens curtain " + open + ".");
		int newChoice;
		do 
		{
			newChoice = (int) (Math.random() * 3 + 1);
		}
		while(newChoice == choice || newChoice == open);
		System.out.println("Betty switches to curtain " + newChoice + ".");
		//tests to see if Betty won
		
		if(newChoice == prize)
		{
			System.out.println("Betty wins.");
			bwins+=1;
		}
		else
		{
			//System.out.println("Betty loses.");
		}
		System.out.println();
	}
	
	public void frank()
	{
		int prize = (int) (Math.random() * 3 + 1); //picks a random prize door
		System.out.println("The winning curtain is " + prize + ".");
		int choice = (int) (Math.random() * 3 + 1); // Frank chooses a random door 1, 2 or 3
		System.out.println("Frank selects curtain " + choice + ".");
		int open;
		//will open a door that is neither Franks's or the winning one
		do 
		{
			open = (int) (Math.random() * 3 + 1);
		}
		while(open == choice || open == prize);
		System.out.println("Monty opens curtain " + open + ".");
		System.out.println("Frank does not switch.");
		//tests to see if Frank won
		if(choice == prize)
		{
			System.out.println("Frank wins.");
			fwins+=1;
		}
		else
		{
			System.out.println("Frank loses.");
		}
		System.out.println();
	}
	
	public void fred()
	{
		int prize = (int) (Math.random() * 3 + 1); //picks a random prize door
		System.out.println("The winning curtain is " + prize + ".");
		int choice = (int) (Math.random() * 3 + 1); // Fred chooses a random door 1, 2 or 3
		System.out.println("Frank selects curtain " + choice + ".");
		int open;
		//will open a door that is neither Franks's or the winning one
		do 
		{
			open = (int) (Math.random() * 3 + 1);
		}
		while(open == choice || open == prize);
		System.out.println("Monty opens curtain " + open + ".");
		int newChoice;
		do 
		{
			newChoice = (int) (Math.random() * 3 + 1);
		}
		while(newChoice == choice || newChoice == open);
		System.out.println("Fred switches to curtain " + newChoice + ".");
		//tests to see if Fred won
		if(newChoice == prize)
		{
			System.out.println("Fred wins.");
			frwins+=1;
		}
		else
		{
			System.out.println("Fred loses.");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String [] args)
	{
		Monty mon = new Monty();
		
	}
	
	
}
