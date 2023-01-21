package com.antra;

public class RightOfMaxLeftMin {
	public static void main(String[] args) {

		int[] input = { 6, 4, -3, 56, 46, 12, 78 };
		int[][] quarry = { { 2, 5 }, { 3, 6 }, { 1, 5 } };
		int[] findRightMaxInTheGivenQuarry = findRightMaxInTheGivenQuarry(input, quarry);
		for (int i : findRightMaxInTheGivenQuarry) {
			System.out.print(i + "   ");
		}
	}

	private static int[] findRightMaxInTheGivenQuarry(int[] input, int[][] quarry) {
		int[] minOfRight = new int[input.length];
		int[] output = new int[quarry.length];
		for (int i = 0; i < output.length; i++) {
			int[] js = quarry[i];
			int s = js[0];
			int e = js[1];
			minOfRight[e - 1] = input[e - 1];
			for (int k = e - 2; k >= s; k--) {
				minOfRight[k] = Math.min(minOfRight[k + 1], input[k]);

			}
			output[i] = minOfRight[s];

		}

		return output;
	}
}
