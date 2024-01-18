package practice.conditionalsandloops;

import java.util.Scanner;

public class PerfectNumber {
	
	static int perfect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			int rem = n%i;
			if(rem == 0) {
				sum = sum + i;
			}
		}
		return sum;
		
		
 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int nextInt = input.nextInt();
		
		int checkPerfect = perfect(nextInt);
		if (checkPerfect == nextInt) {
			System.out.printf("%d is a perfect number",checkPerfect);
		}
		
		
		
		

	}

}
