package factorialnumber;

import java.util.Scanner;

public class GetFactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int number = sc.nextInt();

		int fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial Is :" + fact);
	}
}
