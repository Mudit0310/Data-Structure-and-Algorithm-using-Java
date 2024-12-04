package Practice;

public class PalindromeUsingRecursion {
	public static void PalindromeCheck(String str, int left, int right)
	{
		if(left >= right)
		{
			System.out.println("String is Palindrome");
			return;
		}
		
		if(str.charAt(right)!=str.charAt(left)) {
			System.out.println("String is not Palindrome");
			return;                 
		}
		
		PalindromeCheck(str,left+1,right-1);
	}
	public static void main(String args[])
	{
		String str = "mudit";
		PalindromeCheck(str, 0, str.length()-1);
	}
}
