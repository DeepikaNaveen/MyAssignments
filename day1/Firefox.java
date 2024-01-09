package week1.day1;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float browserVersion= 100.2f;
		String browserName= "firefox";
		boolean isVisible = true;
		int releaseYear=1998;
		char browserLogo='f';
		
		System.out.println("Browser version: "+browserVersion);
		System.out.println("Browser Name: "+browserName);
		System.out.println("Able to see browser: "+isVisible);
		System.out.println("Browser Release Year: "+releaseYear);
		System.out.println("Browser Logo: "+browserLogo);
		System.out.println(browserName+" is having "+browserVersion);
		
		System.out.println("Browser version : " +browserVersion+"\n"+"Browser Name : "+browserName+"\n"+"is visible : "+isVisible+"\n"+"Release Year : "+releaseYear+"\n"+"Browser Logo : "+browserLogo);
	}

}
