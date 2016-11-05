package com.bourne.wang.practise._1._1;

import org.junit.Test;

public class _5 {

	public int[] getSameNumbers(int[] a, int[] b) {
		if(a.length < 1 || b.length < 1) {
			return new int[0];
		}
		int[] x = new int[Math.min(a.length, b.length)];
		return getSameNumbers(x, 0, a, 0, b, 0);
	}

	private int[] getSameNumbers(int[] x, int k, int[] a, int i, int[] b, int j) {
		if (k >= x.length || j >= b.length || i >= a.length) {
			for (int l = 0; l < x.length; l++) {
				if(x[l] == 0) {
					if(l < 1) {
						return new int[0];
					}
					int[] y = new int[l];
					for (int h = 0; h < y.length; h++) {
						y[h] = x[h];
					}
					return y;
				}
			}
			return x;
		}
		for (int n = j; n < b.length; n++) {
			if (a[i] == b[n]) {
				x[k] = a[i];
				return getSameNumbers(x, k + 1, a, i + 1, b, n + 1);
			}
		}
		return getSameNumbers(x, k, a, i + 1, b, j);
	}

	
	@Test
	public void test_getSameNumbers() {
		int[] a = {2,5,5,5};
		int[] b = {2,2,3,5,5,7};
		_5 outputer = new _5();
		int[] x = outputer.getSameNumbers(a, b);
		for (int i : x) {
			System.out.print(i+" ");
		}
	}

}
