package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		int maxRange=10;
		System.out.println("Odd Numbers: ");
		for (int i = 0; i < maxRange; i++) {
			
			if (i%2!=0) {
				
				System.out.println(i);
			}
			
		}
		System.out.println("**********");
		for (int i = 0; i < maxRange; i++) {
			
			if (i==6) {
				break;
				
			}
			System.out.println(i);

		}
	}

}
