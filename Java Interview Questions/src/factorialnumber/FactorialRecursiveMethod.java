package factorialnumber;

import java.util.Scanner;

public class FactorialRecursiveMethod {
	public static int getfact(int number) {
		if (number == 0) {
			return 1;
		} else {
			return (number * getfact(number - 1));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		System.out.println("Factorial is : " + getfact(number));

	}
}
