package dasassignment1;

public class question1b {
	public static boolean ispalindrome(String inputstring)
	{
		int left = 0;
		int right = inputstring.length()-1;
		while(left<=right)
		{
			if(inputstring.charAt(left)!=inputstring.charAt(right))
			{	return false;}
			right--;
			left++;
			
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		String inputstring = "radar";
		boolean result = ispalindrome(inputstring);
		System.out.println("Is it a palindrome: "+result);
	}

}
