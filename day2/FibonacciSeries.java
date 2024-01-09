package week1.day2;

public class FibonacciSeries {

public void Fibonacci(int n) {
	int x=0,y=1;
	for (int i = 0; i < n; i++) {	
		System.out.println(x);
		int z=x+y;
		x=y;
		y=z;		
	}
}
	public static void main(String[] args) {

		FibonacciSeries fb=new FibonacciSeries();
		fb.Fibonacci(8);
	}

}
