package practice.basic;

import java.util.Scanner;

public class Sum_natural_numbers {
	
	static int sum(int start, int end ) {
		int add = 0;
		for (int i = start; i <=end; i++) {
			add = add + i;
		}
		return add;
		
	}
	
	public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
		
		System.out.print("Enter number_1 = ");
		int A = inputs.nextInt();
		
		System.out.print("Enter number_2 = ");
		int B = inputs.nextInt();
		
		System.out.printf("Sum of natural numbers between %d and %d are %d", A,B,sum(A, B));
		
	}

}
