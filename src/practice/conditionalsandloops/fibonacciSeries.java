package practice.conditionalsandloops;

import java.util.Scanner;

public class fibonacciSeries {
	
	static void series(int n) {
		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber = 0;
		
		for (int i = 0; i < n; i++) {
			
			System.out.print(firstNumber + " ");
			thirdNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		int number = input.nextInt();
		series(number);
		
		
	}

}
