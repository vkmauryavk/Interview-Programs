package fibonacciseries;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;

		int temp = 0;
		int first = 0;
		int second = 1;
		int next = 0;
		System.out.print("0 1");
		for (int i = 2; i < 10; ++i) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(" " + next);
		}

	}
}
