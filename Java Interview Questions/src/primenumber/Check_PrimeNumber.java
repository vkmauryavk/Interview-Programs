package primenumber;

import java.util.Scanner;

public class Check_PrimeNumber {
	public static void checkPrime(int number) {
		int m = number / 2;
		boolean isPrime = true;
		for (int i = 2; i < m; ++i) {
			if (number % i == 0) {
				isPrime = false;
				System.out.println(number + "  is Not Prime Number");
				break;
			}
		}
		if (isPrime == true) {
			System.out.println(number + " is Prime Number");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		checkPrime(num);
	}
}
