package src;

public class StringCompareTo {

	public static void main(String[] args) {
		
		String name1= "Martin",
		       name2 = "Robin";
		
		// Compare the two names
		
		if(name1.compareTo(name2) < 0 )
		{
			System.out.println(name1 + " is less than " + name2);
		}
		else if (name1.compareTo(name2) == 0)
		{
			System.out.println(name1 + " is equal to " + name2);
		}
		else if (name1.compareTo(name2) > 0 )
		{
			System.out.println(name1 +  "is greater than " + name2);
		}

	}

}
