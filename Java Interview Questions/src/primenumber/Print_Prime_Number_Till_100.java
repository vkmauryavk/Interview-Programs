package primenumber;

public class Print_Prime_Number_Till_100 {
	public static void main(String[] args) {

		for (int i = 2; i < 1000; i++) {
			boolean isPrime = true;
			/*
			 * this boolean declaration will come this place if use other place
			 * code may not work
			 */
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break; // use this break or not it will work
				}
			}
			if (isPrime == true) {
				System.out.print(" " + i);
			}
		}
	}
}
