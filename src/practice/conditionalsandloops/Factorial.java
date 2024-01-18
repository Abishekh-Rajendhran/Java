package practice.conditionalsandloops;

import java.util.Scanner;

public class Factorial {
	
	static int fact(int number) {
	
	   int fact = 1;
	   for (int i = number; i >0; i--) {
		fact = fact * i;
	}
	return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.printf("Factorial of %d is %d", number,fact(number));

	}

}
