package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,6,8,9,5,2,3,4};
		Arrays.sort(a);
		for (int i = 0; i < a.length;i++) {
			
			if(a[i]!=i+1) {
			System.out.println(i+1);
			break;
		}
		
		

	}

	}
}
