package com.antra;

public class MaxOfLeft {
	public static void main(String[] args) {
		int[] input = { 6, 4, -3, 56, 46, 12, 78 };
		int[][] quarry = { { 2, 5 }, { 1, 2 }, { 0, 1 } };// 56,4,6
		int[] findMaxInTheGivenIndex = findMaxInTheGivenIndex(input, quarry);
		for (int i : findMaxInTheGivenIndex) {
			System.out.println(i);
		}

	}

	private static int[] findMaxInTheGivenIndex(int[] input, int[][] quarry) {
		int[] maxOfLeft = new int[input.length];
		int[] output = new int[quarry.length];
		for (int i = 0; i < quarry.length; i++) {
			int[] js = quarry[i];
			int s = js[0];
			int e = js[1];
			maxOfLeft[s] = input[s];
			for (int k = s + 1; k <= e; k++) {
				maxOfLeft[k] = Math.max(maxOfLeft[k - 1], input[k]);

				output[i] = maxOfLeft[e];
			}
		}
		return output;

	}

}
