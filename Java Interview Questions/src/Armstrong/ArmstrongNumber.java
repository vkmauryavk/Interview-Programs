package Armstrong;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int temp, c = 0, a;

		int n = 153;
		temp = n;
		while (n > 0) {
			a = n % 10;
			c = c + (a * a * a);
			n = n / 10;

		}
		if (temp == c) {
			System.out.println("ArmStrong number");
		} else {
			System.out.println("it is not ArmStrong number");
		}
	}
}
