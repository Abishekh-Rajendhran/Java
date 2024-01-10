package practice.basic;

import java.util.Scanner;

public class Basic_Addition {
	
	static int add(int a, int b) {
		int sum = a + b;
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		
		System.out.print("Enter number_1 = ");
		int A = inputs.nextInt();
		
		System.out.print("Enter number_2 = ");
		int B = inputs.nextInt();
		
		System.out.printf("Addition of two numbers %d and %d are %d", A,B,add(A, B));
		
		
		
	}
}
