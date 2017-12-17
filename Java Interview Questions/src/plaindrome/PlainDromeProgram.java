package plaindrome;

import java.util.Scanner;

public class PlainDromeProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int reminder, reverse = 0, temp;

		System.out.print("Enter the Number to Check : ");
		int n = 454;
		temp = n;

		while (n > 0) {

			reminder = n % 10;
			reverse = (reverse * 10) + reminder;
			n = n / 10;

		}

		if (n == temp) {
			System.out.println("This is Plaindrome Number");
		} else {
			System.out.println("This is not plaindrome number");
		}

	}
}
