package practice.conditionalsandloops;

import java.util.Scanner;

public class LargestAmongThree {
	
	static int largest(int a, int b, int c) {
		int largest = 0;
		if ((a>b) && (a>c)) {
			largest = a;
		}
		else if ((b>a) && (b>c)) {
			largest = b;
		}
		else {
			largest = c;
		}
		
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		System.out.println("Largest Number = "+largest(number1, number2, number3));

	}

}
