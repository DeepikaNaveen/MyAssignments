package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {
		
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application URL loaded successfully");
	}
	
	public static void main(String[] args) {
		
		Browser bb=new Browser();
		System.out.println(bb.launchBrowser("Chrome")+" "+"browser launched successfully");
		bb.loadUrl();
	}

}
