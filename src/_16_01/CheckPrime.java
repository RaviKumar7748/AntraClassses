package _16_01;

public class CheckPrime {
	public boolean isPrime(int n) {
		int sqrt = (int) Math.sqrt(n);
		int count = 0;
		for (int i = 1; i < sqrt; i++) {
			if (sqrt % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		CheckPrime obj = new CheckPrime();
		boolean prime = obj.isPrime(23);
		System.out.println(prime);
		System.out.println(obj.isPrime(55));

	}

}
