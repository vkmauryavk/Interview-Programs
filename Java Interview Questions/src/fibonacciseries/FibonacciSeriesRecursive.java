package fibonacciseries;

public class FibonacciSeriesRecursive {
	int first = 0, second = 1, next = 0;

	public void printFibonacciSeries(int size) {

		if (size > 0) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(" " + next);

			printFibonacciSeries(size - 1);
		}
	}

	public static void main(String[] args) {

		FibonacciSeriesRecursive fb = new FibonacciSeriesRecursive();

		System.out.print("0 1");
		fb.printFibonacciSeries(8);

	}

}
