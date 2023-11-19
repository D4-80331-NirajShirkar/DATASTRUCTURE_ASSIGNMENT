package dasassignment1;

public class question1a {
	public static boolean ispalindrome(String inputstring)
	{
		String reversed = new StringBuilder(inputstring).reverse().toString();
		return inputstring.equals(reversed);
		
	}
public static void main(String[] args) {
	String inputstring = "radar";
	boolean result = ispalindrome(inputstring);
	System.out.println("Is it a palindrome: "+result);
}
}
