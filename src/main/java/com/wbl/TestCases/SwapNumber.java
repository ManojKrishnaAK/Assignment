package com.wbl.TestCases;

public class SwapNumber {
	public int[] swapNum(int a, int b) {

		int[] swap = new int[2];
		a = a + b;
		b = a - b;
		a = a - b;

		swap[0] = b;
		swap[1] = a;

		return swap;
	}
}