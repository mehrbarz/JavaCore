package src;

/**
 * This program compares two string objects using the equals method
 * @author MehrBarz
 *
 */
public class StringCompare {

	public static void main(String[] args) {
		String name1 = "Mark", 
				name2 = "Mark",
				name3 = "Mary";
		
		// Compare Mark and Mark
		if(name1.equals(name2))
		{
			System.out.println(name1 + " and " + name2 + " are the same.");
			
		}
		else
		{
			System.out.println( name1 + " and " + name2 + " are not the same.");
		}
		
		// Compare "Mark" and "Mary"
		if (name1.equals(name3))
		{
			System.out.println(name1 + " and " + name3 + " are the same.");
		}
		else
		{
			System.out.println(name1 + " and " + name3 + " are not the same.");
		}

	}

}
