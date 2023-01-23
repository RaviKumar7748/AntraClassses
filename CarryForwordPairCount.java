package com.antra;

public class CarryForwordPairCount {
	public static void main(String[] args) {
		char[] input = { 'a', 'b', 'e', 'g', 'a', 'g', 'g', 'a' ,'g'};
		int countPairOfAandG = countPairOfAandG(input);
		System.out.println(countPairOfAandG);
	}

	private static int countPairOfAandG(char[] input) {
		int aCount = 0;
		int ans = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] == 'a') {
				aCount++;
			}
			if (input[i] == 'g') {
				ans += aCount;
			}
		}

		return ans;
	}

}
