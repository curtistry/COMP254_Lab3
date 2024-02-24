package exercise2;

public class PalindromeDriver {
	
	public static Boolean isPalindrome(String text) {
		//no more characters to compare, meaning it is a palindrome
		if (text.length() <= 1)
		{
			return true;
		}
		//compare characters at both ends
		if (text.charAt(0) == text.charAt(text.length()-1))
		{
			//call the method again,
			//but exclude the first and last characters.
			return isPalindrome(text.substring(1, text.length()-1));
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		String myText = "racecar";
		Boolean result = isPalindrome(myText);
		System.out.printf("Is '%s' a palindrome: %s \n", myText,result);
		
		myText = "gohangasalamiimalasagnahog";
		result = isPalindrome(myText);
		System.out.printf("Is '%s' a palindrome: %s \n", myText,result);
	}
}
