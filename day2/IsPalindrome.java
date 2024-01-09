package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {

		int input=1221, output=0,rem;
		for (int i = input; i >0;) {
			rem=i%10;
			output=output*10+rem;
			i=i/10;
			
		}
		if (input==output) {
			System.out.println(input+" is Palindrome");
		}
		else {
			System.out.println(input+" is not Palindrome");
		}
	}

}
