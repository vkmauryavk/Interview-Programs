package factorialnumber;

import java.util.Scanner;

public class FactorialMethod {

	public static void getFactorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; ++i) {
			fact = fact * i;
		}
		System.out.println("Factorial is :" + fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		getFactorial(number);

	}

}
