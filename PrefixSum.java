package com.antra;

public class PrefixSum {
	public static void main(String[] args) {
		int[] input = { 1, 45, 7, 89, 34, 23, 90 };
		int[][] quarry = { { 1, 3 }, { 2, 5 } };
		firdPrefixSum(input, quarry);
	}

	private static int[] firdPrefixSum(int[] input, int[][] quarry) {
		int[] prefixSum = new int[input.length];
		for (int i = 0; i < quarry.length; i++) {
			int[] js = quarry[i];
			int s = js[0];
			int e = js[1];

			prefixSum[0] = input[0];
			prefixSum[i]=prefixSum[e]-input[i];

		}

		return null;

	}

}
