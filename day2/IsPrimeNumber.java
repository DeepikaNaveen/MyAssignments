package week1.day2;

public class IsPrimeNumber {
	
	public void primenum(int n) {
		int i,j=0;
		if (n==1 || n==2 ) {
			System.out.println("Prime Number");
			}
		else {
			for(i=2;i<n-1;i++) {
				if (n%i==0) {
					j++;
				}
			}
				if(j==0) {
						System.out.println(n+" is prime number");
				}
			
				else {
					System.out.println(n+" is not a prime number");
				}
		}
			
		}
			
	public static void main(String[] args) {
		IsPrimeNumber pm=new IsPrimeNumber();
		pm.primenum(9);
		

	}

	}
	
